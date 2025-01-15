package Ast;

import Grammar.LispParserBaseVisitor;
import Grammar.LispParser;

import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ASTBuilderVisitor extends LispParserBaseVisitor<ASTNode> {
    private final List<String> declaredVariables = new ArrayList<>(); // Tracks declared variables
    private final Map<String, Object> symbolTable = new HashMap<>(); // Tracks variable values
    private final Map<String, FunctionDefinitionNode> functionTable = new HashMap<>();//Tracks the function
    public final List<String> semanticErrors = new ArrayList<>(); // Stores semantic errors

    @Override
    public ASTNode visitProgram(LispParser.ProgramContext ctx) {
        ProgramNode programNode = new ProgramNode();
        for (LispParser.StatementContext statement : ctx.statement()) {
            programNode.addStatement(visit(statement));
        }
        return programNode;
    }

    @Override
    public ASTNode visitVariable_definition(LispParser.Variable_definitionContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        ASTNode expressionNode = visit(ctx.expression());
        Object value;
        // Evaluate the expression node
        if (expressionNode instanceof OperationNode) {
            OperationNode operationNode = (OperationNode) expressionNode;
            value = operationNode.getResult();
        } else {
            value = evaluateExpression(expressionNode);
        }

        // Check if the variable is already defined
        if (declaredVariables.contains(identifier)) {
            // Update the value in the symbol table
            symbolTable.put(identifier, value);
        } else {
            // Add the variable to the declaredVariables set and symbol table
            declaredVariables.add(identifier);
            symbolTable.put(identifier, value);
        }

        return new VariableDefinitionNode(identifier, expressionNode);
    }


    @Override
    public ASTNode visitFunction_definition(LispParser.Function_definitionContext ctx) {
        String functionName = ctx.IDENTIFIER().getText();
        List<String> parameters = new ArrayList<>();
        for (var param : ctx.parameter_list().IDENTIFIER()) {
            parameters.add(param.getText());
        }

        // Store the block context for execution
        LispParser.BlockContext blockContext = ctx.block();

        FunctionDefinitionNode functionNode = new FunctionDefinitionNode(functionName, parameters, blockContext);
        functionTable.put(functionName, functionNode); // Store the function in the table

        return functionNode;
    }


    @Override
    public ASTNode visitConditional(LispParser.ConditionalContext ctx) {
        ASTNode condition1 = visit(ctx.condition());
        Object conditionValue = getConditionValue(condition1);
        boolean condition = Boolean.parseBoolean(conditionValue.toString());

        ASTNode trueBranch = visit(ctx.expression(0));
        ASTNode falseBranch = visit(ctx.expression(1));

        return new ConditionalNode(condition, trueBranch, falseBranch);
    }

    // Helper method to extract the value from the condition
    private Object getConditionValue(ASTNode condition) {
        if (condition instanceof OperationNode) {
            return ((OperationNode) condition).getResult();
        } else if (condition instanceof AtomNode) {
            return ((AtomNode) condition).getValue();
        }
        return null;
    }

    @Override
    public ASTNode visitLoop(LispParser.LoopContext ctx) {
        // Extract the iterator name
        String iterator = ctx.IDENTIFIER().getText();

        // Evaluate the loop limit expression to an ASTNode
        ASTNode limitNode = visit(ctx.expression());

        // Try to evaluate the limit as an integer
        int limitValue;
        try {
            limitValue = Integer.parseInt(evaluateExpression(limitNode).toString());
        } catch (NumberFormatException e) {
            throw new RuntimeException("Loop limit must evaluate to a numeric value.");
        }

        // Create a list to store the executed body for each iteration
        List<ASTNode> bodyList = new ArrayList<>();

        // Loop from 0 to the limit value
        for (int i = 0; i < limitValue; i++) {
            // Add the iterator value to the scope or symbol table
            symbolTable.put(iterator, i);
             declaredVariables.add(iterator);
            // Visit the block for the loop body and evaluate it
            ASTNode bodyNode = visit(ctx.block());

            // Add the evaluated body node to the list
            bodyList.add(bodyNode);
        }

        // Remove the iterator variable from the scope or symbol table after the loop
        symbolTable.remove(iterator);
        declaredVariables.remove(iterator);

        // Return the LoopNode with the iterator, limit, and the body list
        return new LoopNode(iterator, limitNode, bodyList);
    }

    @Override
    public ASTNode visitWhile_loop(LispParser.While_loopContext ctx) {
        // Evaluate the condition expression and get the result
        ASTNode conditionNode = visit(ctx.operation());

        // Get the result from the conditionNode using the getResult method
        Object conditionValue = ((OperationNode) conditionNode).getResult();

         // Print the condition to verify the value

        // Declare the list for storing the loop body nodes
        List<ASTNode> bodyList = new ArrayList<>();

        // Execute the loop as long as the condition evaluates to true
        while (Boolean.TRUE.equals(conditionValue)) {
            ASTNode bodyNode = visit(ctx.block());

            bodyList.add(bodyNode);
             conditionNode = visit(ctx.operation());
            // Recalculate the condition after each loop iteration (in case it changes)
            conditionValue = ((OperationNode) conditionNode).getResult();
        }

        // Return a WhileLoopNode containing the condition and the body
        return new WhileLoopNode(conditionNode, bodyList);
    }



    @Override
    public ASTNode visitBlock(LispParser.BlockContext ctx) {
        // Create a new BlockNode to hold the statements and expressions
        BlockNode blockNode = new BlockNode();

        // Iterate through all child nodes of the block
        for (int i = 0; i < ctx.children.size(); i++) {
            var child = ctx.children.get(i);

            // Check if the child is a StatementContext
            if (child instanceof LispParser.StatementContext) {
                // If it's a statement, visit it and add to the block
                ASTNode statementNode = visit((LispParser.StatementContext) child);
                blockNode.addStatement(statementNode);
            }
            // Check if the child is an ExpressionContext
            else if (child instanceof LispParser.ExpressionContext) {
                // If it's an expression, visit it and add to the block
                ASTNode expressionNode = visit((LispParser.ExpressionContext) child);
                blockNode.addExpression(expressionNode);
            }
        }


        return blockNode;
    }



    @Override
    public ASTNode visitExpression(LispParser.ExpressionContext ctx) {
        if (ctx.atom() != null) {
            return visit(ctx.atom());
        } else if (ctx.list() != null) {
            return visit(ctx.list());
        } else if (ctx.operation() != null) {
            return visit(ctx.operation());
        } else if (ctx.function_call() != null) {
            return visit(ctx.function_call());
        } else if (ctx.lambda_function() != null) {
            return visit(ctx.lambda_function());
        } else if (ctx.case_expression() != null) {
            return visit(ctx.case_expression());
        } else if (ctx.progn_block() != null) {
            return visit(ctx.progn_block());
        } else if (ctx.structure_definition() != null) {
            return visit(ctx.structure_definition());
        } else if (ctx.make_structure() != null) {
            return visit(ctx.make_structure());
        } else if (ctx.print_statement() != null) {
            return visit(ctx.print_statement());
        }else if(ctx.format_expression()!= null){
            return visit(ctx.format_expression());
        }

        return null; // Fallback for unmatched cases
    }

    @Override
    public ASTNode visitAtom(LispParser.AtomContext ctx) {
        if (ctx.INTEGER() != null) {

            return new AtomNode(ctx.INTEGER().getText());
        } else if (ctx.REAL() != null) {
            return new AtomNode(ctx.REAL().getText());
        } else if (ctx.STRING_START() != null) {
            // Extract the raw string and resolve escaped characters
            String rawString = ctx.getText().substring(1, ctx.getText().length() - 1); // Remove surrounding quotes
            String resolvedString = resolveEscapedCharacters(rawString);
            return new AtomNode(resolvedString);
        } else if (ctx.IDENTIFIER() != null) {
            String identifier = ctx.IDENTIFIER().getText();

            if (!declaredVariables.contains(identifier)) {
                semanticErrors.add("Variable '" + identifier + "' is not declared.");
                return null;
            }
            Object value = symbolTable.get(identifier);
            if (value == null) {
                semanticErrors.add("Variable '" + identifier + "' is not initialized.");
                return null;
            }


            return new AtomNode(String.valueOf(value));
        }
        return null; // Return null if no valid atom type matches
    }


    @Override
    public ASTNode visitList(LispParser.ListContext ctx) {
        if (ctx.children == null || ctx.children.isEmpty()) {
            return new ListNode(); // Empty list
        }

        // The first child (index 1) is the function name
        ParseTree firstChild = ctx.children.get(1);

        // Check if the first child is an identifier, which would be a function name
        String firstChildText = firstChild.getText();

        // If the first child text is a function name in the function table, treat it as a function call
        if (functionTable.containsKey(firstChildText)) {

            List<ASTNode> arguments = new ArrayList<>();

            // Process the arguments starting from the second child (index 2)
            for (int i = 2; i < ctx.children.size() - 1; i++) {  // Skipping '(' and function name
                ASTNode argument = visit(ctx.children.get(i));
                arguments.add(argument);
            }

            // Retrieve the function definition from the function table
            FunctionDefinitionNode function = functionTable.get(firstChildText);

            // Create a map to store the arguments bound to the function's parameters
            Map<String, Object> functionParams = new HashMap<>();

            // Bind the arguments to the function's parameters
            List<String> paramNames = function.getParameters();
            if (paramNames.size() != arguments.size()) {
                throw new RuntimeException("Function '" + firstChildText + "' expects " + paramNames.size() + " arguments, but got " + arguments.size() + ".");
            }

            // Store the arguments in the symbol table
            for (int i = 0; i < paramNames.size(); i++) {
                Object paramValue = evaluateExpression(arguments.get(i));
                if (paramValue == null) {
                    System.out.println("Warning: Parameter '" + paramNames.get(i) + "' evaluated to null.");
                }

                functionParams.put(paramNames.get(i), paramValue);
                declaredVariables.add(paramNames.get(i));
                symbolTable.put(paramNames.get(i), paramValue);
            }

            // Now visit the function body (block) and execute it
            LispParser.BlockContext functionBody = function.getBlockContext();

            ASTNode result = visit(functionBody);

            // After the function body execution, remove the parameters from the symbol table
            for (String param : paramNames) {
                declaredVariables.remove(param);
                symbolTable.remove(param);
            }

            // Return the result of the function body
            return result;
        }

        // Otherwise, treat it as a regular list
        ListNode listNode = new ListNode();
        System.out.println(ctx.children);
        for (var child : ctx.children) {
            if (child instanceof LispParser.ExpressionContext) {
                ASTNode element = visit((LispParser.ExpressionContext) child);
                listNode.addElement(element);
            }
        }

        return listNode;
    }


    @Override
    public ASTNode visitOperation(LispParser.OperationContext ctx) {
        String operator = ctx.operator().getText();
        ASTNode leftNode = visit(ctx.expression(0));
        ASTNode rightNode = visit(ctx.expression(1));

        return new OperationNode(operator, leftNode, rightNode);
    }

    @Override
    public ASTNode visitFunction_call(LispParser.Function_callContext ctx) {
        String functionName = ctx.IDENTIFIER().getText();
        FunctionCallNode functionCallNode = new FunctionCallNode(functionName);

        // Retrieve the function definition from the function table
        FunctionDefinitionNode function = functionTable.get(functionName);
        if (function == null) {
            throw new RuntimeException("Function '" + functionName + "' is not defined.");
        }

        // Retrieve the list of parameter names from the function definition
        List<String> paramNames = function.getParameters();
        List<ASTNode> arguments = new ArrayList<>();

        // Visit each argument in the function call and add to the arguments list
        for (var expr : ctx.expression()) {
            arguments.add(visit(expr));
        }

        // Check if the number of arguments matches the number of parameters
        if (paramNames.size() != arguments.size()) {
            throw new RuntimeException(
                    "Function '" + functionName + "' expects " + paramNames.size() + " arguments, but got " + arguments.size() + "."
            );
        }

        // Map arguments to parameters in the symbol table
        for (int i = 0; i < paramNames.size(); i++) {
            declaredVariables.add(paramNames.get(i));
            symbolTable.put(paramNames.get(i), evaluateExpression(arguments.get(i)));
        }

        // Visit the function's body (the block of code within the function definition)
        LispParser.BlockContext functionBody = function.getBlockContext();
        ASTNode result = visit(functionBody);

        // Clean up the parameters from the symbol table after the function execution
        for (String param : paramNames) {
            symbolTable.remove(param);
        }

        // Combine pretty print of the function call with the result
        String resultWithPrettyPrint = functionCallNode.prettyPrint("") + "\nResult: " + result.prettyPrint("");

        // Create a new node to encapsulate the result and the pretty print
        return new PrintFunctionCallNode(result, resultWithPrettyPrint);
    }


    private Object evaluateExpression(ASTNode node) {
        if (node instanceof AtomNode) {
            return ((AtomNode) node).getValue();
        } else if (node instanceof OperationNode) {
            OperationNode operation = (OperationNode) node;
            Object leftValue = evaluateExpression(operation.getLeft());
            Object rightValue = evaluateExpression(operation.getRight());

            if (leftValue == null || rightValue == null) {
                throw new RuntimeException("Operation has null operand(s).");
            }

            return ((OperationNode) node).getResult();
        }
        return null;
    }


    private Object performOperation(String operator, Object left, Object right) {
        if (left instanceof Number && right instanceof Number) {
            double leftNum = ((Number) left).doubleValue();
            double rightNum = ((Number) right).doubleValue();

            switch (operator) {
                case "+":
                    return leftNum + rightNum;
                case "-":
                    return leftNum - rightNum;
                case "*":
                    return leftNum * rightNum;
                case "/":
                    if (rightNum != 0) {
                        return leftNum / rightNum;
                    } else {
                        return Double.NaN; // Division by zero case
                    }
                default:
                    return null;
            }
        }
        return null;
    }

    @Override
    public ASTNode visitPrint_statement(LispParser.Print_statementContext ctx) {

        ASTNode expression = visit(ctx.expression());


        return new PrintStatementNode(expression);
    }
    private String resolveEscapedCharacters(String raw) {
        return raw
                .replace("\\n", "\n")
                .replace("\\t", "\t")
                .replace("\\\"", "\"")
                .replace("\\\\", "\\");
    }


    @Override
    public ASTNode visitFormat_expression(LispParser.Format_expressionContext ctx) {
        String destination = ctx.destination().getText();
        FormatExpressionNode formatNode = new FormatExpressionNode(destination);

        StringBuilder formatContent = new StringBuilder();
        int exprIndex = 0;

        // Iterate through the format content and directives
        for (int i=0; i<ctx.format_content().size();i++) {
            formatContent.append(ctx.format_content().get(i).getText());



            formatContent.append(evaluateExpression(visit(ctx.expression().get(i))));
        }

        for (var directive : ctx.format_directive()) {
            formatNode.addDirective(directive.getText());
        }
        // Set the generated content to the FormatExpressionNode
        formatNode.setContent(formatContent.toString());

        // Add expressions to the formatNode for pretty printing if needed
        for (var expr : ctx.expression()) {
            formatNode.addExpression(visit(expr));
        }

        return formatNode;
    }


    @Override
    public ASTNode visitLambda_function(LispParser.Lambda_functionContext ctx) {
        List<String> parameters = new ArrayList<>();
        for (var param : ctx.parameter_list().IDENTIFIER()) {
            parameters.add(param.getText());
        }
        ASTNode body = visit(ctx.block());
        return new LambdaFunctionNode(parameters, body);
    }
    @Override
    public CaseClauseNode visitCase_clause(LispParser.Case_clauseContext ctx) {
        List<ASTNode> conditions = new ArrayList<>();
        List<ASTNode> statements = new ArrayList<>();

        // Handle 'otherwise' clause
        if (ctx.OTHERWISE() != null) {
            for (var expression : ctx.expression()) {
                statements.add(visit(expression));
            }
            return new CaseClauseNode(conditions, statements); // Empty conditions list for 'otherwise'
        }

        // Handle regular clauses
        int conditionCount = ctx.expression().size() - 1; // Last expression is the statement
        for (int i = 0; i < conditionCount; i++) {
            conditions.add(visit(ctx.expression(i)));
        }

        // Add statements
        for (int i = conditionCount; i < ctx.expression().size(); i++) {
            statements.add(visit(ctx.expression(i)));
        }

        return new CaseClauseNode(conditions, statements);
    }

    @Override
    public ASTNode visitCase_expression(LispParser.Case_expressionContext ctx) {
        // Visit the main expression
        ASTNode caseExpression = visit(ctx.expression());
        CaseExpressionNode caseNode = new CaseExpressionNode(caseExpression);

        // Visit each clause and add it
        for (var clause : ctx.case_clause()) {
            CaseClauseNode clauseNode = (CaseClauseNode) visit(clause);

            // Now compare each condition with the caseExpression inside the visitor
            boolean conditionMatched = false;

            // Compare the caseExpression with each condition in the clause
            for (ASTNode condition : clauseNode.getConditions()) {
                Object caseValue = evaluateExpression(caseExpression);
                Object conditionValue = evaluateExpression(condition);

                // Debugging output

                // Perform the comparison, considering both types and values
                boolean valuesEqual = false;

                // Check if the values are the same type and are equal
                if (caseValue.getClass() == conditionValue.getClass()) {
                    valuesEqual = caseValue.equals(conditionValue);
                } else {
                    // Handle cases where types are different, but values can still be considered equal
                    // For example, comparing "1" (String) with 1 (Integer), or "true" (String) with true (Boolean)
                    if (caseValue instanceof String && conditionValue instanceof Integer) {
                        valuesEqual = Integer.parseInt((String) caseValue) == (Integer) conditionValue;
                    } else if (caseValue instanceof Integer && conditionValue instanceof String) {
                        valuesEqual = (Integer) caseValue == Integer.parseInt((String) conditionValue);
                    } else if (caseValue instanceof Boolean && conditionValue instanceof String) {
                        valuesEqual = Boolean.parseBoolean((String) conditionValue) == (Boolean) caseValue;
                    } else if (caseValue instanceof String && conditionValue instanceof Boolean) {
                        valuesEqual = (Boolean) caseValue == Boolean.parseBoolean((String) conditionValue);
                    }
                }

                if (valuesEqual) {
                    conditionMatched = true;
                    break; // Stop once a match is found
                }
            }

            // If a condition matches, add the clause to the caseNode
            if (conditionMatched) {
                caseNode.addClause(clauseNode);
            }
        }

        return caseNode;
    }


    @Override
    public ASTNode visitProgn_block(LispParser.Progn_blockContext ctx) {
        PrognBlockNode prognNode = new PrognBlockNode();
        for (var stmt : ctx.statement()) {
            prognNode.addBody(visit(stmt));
        }
        return prognNode;
    }

    @Override
    public ASTNode visitReturn_statement(LispParser.Return_statementContext ctx) {
        String blockName = ctx.IDENTIFIER().getText();
        ASTNode returnValue = visit(ctx.expression());
        return new ReturnStatementNode(blockName, returnValue);
    }

    @Override
    public ASTNode visitCondition(LispParser.ConditionContext ctx) {
        if (ctx.operator() != null) {
            String operator = ctx.operator().getText();
            ASTNode left = visit(ctx.expression(0));
            ASTNode right = visit(ctx.expression(1));

            OperationNode operationNode = new OperationNode(operator, left, right);
            Object result = operationNode.getResult();
            return new AtomNode(result.toString());
        } else if (ctx.IDENTIFIER() != null) {
            String identifier = ctx.IDENTIFIER().getText();
            Object value = symbolTable.get(identifier);
            if (value == null) {
                throw new RuntimeException("Variable '" + identifier + "' is not initialized.");
            }
            return new AtomNode(value.toString());
        }
        return null; // Default case if neither operator nor identifier is present
    }
}
