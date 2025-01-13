package Ast;


import Grammar.LispParserBaseVisitor;
import Grammar.LispParser;

import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ASTBuilderVisitor extends LispParserBaseVisitor<ASTNode>{
    private final List<String> declaredVariables = new ArrayList<>(); // Tracks declared variables
    private final Map<String, Object> symbolTable = new HashMap<>(); // Tracks variable values
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

        // Check if the expression node is an OperationNode
        if (expressionNode instanceof OperationNode) {
            OperationNode operationNode = (OperationNode) expressionNode;
            Object value = operationNode.getResult(); // Get the result directly from the operation

            // Store the value of the operation result in the symbol table
            symbolTable.put(identifier, value);
        } else {
            // If it's not an operation, evaluate normally (for AtomNode or other types)
            Object value = evaluateExpression(expressionNode);


            // Store the value of the evaluated expression in the symbol table
            symbolTable.put(identifier, value);
        }

        // Check if the variable has already been declared to avoid semantic errors
        if (declaredVariables.contains(identifier)) {
            semanticErrors.add("Variable '" + identifier + "' is already defined.");
        } else {
            declaredVariables.add(identifier);
        }

        // Return the VariableDefinitionNode with the expression node
        return new VariableDefinitionNode(identifier, expressionNode);
    }

    @Override
    public ASTNode visitFunction_definition(LispParser.Function_definitionContext ctx) {
        String functionName = ctx.IDENTIFIER().getText();
        List<String> parameters = new ArrayList<>();
        for (var param : ctx.parameter_list().IDENTIFIER()) {
            parameters.add(param.getText());
        }
        ASTNode body = visit(ctx.block());

        return new FunctionDefinitionNode(functionName, parameters, body);
    }

    @Override
    public ASTNode visitConditional(LispParser.ConditionalContext ctx) {

        // Visit the condition
        ASTNode condition1 = visit(ctx.condition()); // This handles the operator or identifier

        // If the condition is an OperationNode or AtomNode, get its result
        Object conditionValue = getConditionValue(condition1);
        boolean condition = Boolean.parseBoolean(conditionValue.toString());



        // Visit the true branch (expression)
        ASTNode trueBranch = visit(ctx.expression(0));

        // Visit the false branch if it exists, otherwise set it to null
        ASTNode falseBranch = visit(ctx.expression(1));

        // Return a ConditionalNode with the parsed condition, trueBranch, and falseBranch
        return new ConditionalNode(condition, trueBranch, falseBranch);
    }

    // Helper method to extract the value from the condition
    private Object getConditionValue(ASTNode condition) {
        if (condition instanceof OperationNode) {
            return ((OperationNode) condition).getResult(); // Get the result from the operation
        } else if (condition instanceof AtomNode) {
            return ((AtomNode) condition).getValue(); // Get the value from AtomNode
        }
        return null; // Handle other cases as needed
    }



    @Override
    public ASTNode visitLoop(LispParser.LoopContext ctx) {
        String iterator = ctx.IDENTIFIER().getText();
        ASTNode limit = visit(ctx.expression());
        ASTNode body = visit(ctx.block());

        return new LoopNode(iterator, limit, body);
    }

    @Override
    public ASTNode visitExpression(LispParser.ExpressionContext ctx) {
        // Log the input context for debugging

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
        }else if(ctx.print_statement()!=null){
            return visit(ctx.print_statement());
        }

        // Fallback for unmatched cases
        return null;
    }


    @Override
    public ASTNode visitAtom(LispParser.AtomContext ctx) {
        if (ctx.INTEGER() != null) {
            return new AtomNode(ctx.INTEGER().getText()); // Integer as String
        } else if (ctx.REAL() != null) {
            return new AtomNode(ctx.REAL().getText()); // Real value as String
        } else if (ctx.STRING_START() != null) {
            return new AtomNode(ctx.getText().substring(1, ctx.getText().length() - 1)); // Remove quotes
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
        ListNode listNode = new ListNode();
        // Loop through the child nodes in the ListContext
        for (var exprContext : ctx.children) {
            // Check if the child node is an expression (either an atom or list)
            if (exprContext instanceof LispParser.ExpressionContext) {
                ASTNode element = visit((LispParser.ExpressionContext) exprContext);
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

        // Create an OperationNode, which will calculate the result automatically
        return new OperationNode(operator, leftNode, rightNode);
    }



    @Override
    public ASTNode visitFunction_call(LispParser.Function_callContext ctx) {
        String functionName = ctx.IDENTIFIER().getText();
        FunctionCallNode functionCallNode = new FunctionCallNode(functionName);
        for (var expr : ctx.expression()) {
            functionCallNode.addArgument(visit(expr));
        }
        return functionCallNode;
    }
    private Object evaluateExpression(ASTNode node) {
        if (node instanceof AtomNode) {
            // AtomNode contains the value (e.g., a number or variable value)
            return ((AtomNode) node).getValue();
        } else if (node instanceof OperationNode) {
            // OperationNode contains an operator and operands
            OperationNode operation = (OperationNode) node;

            // Recursively evaluate left and right operands
            Object leftValue = evaluateExpression(operation.getLeft());
            Object rightValue = evaluateExpression(operation.getRight());

            // Perform the operation and return the result
            return performOperation(operation.getOperator(), leftValue, rightValue);
        }

        // Add cases for other types of expressions as needed
        return null;
    }

    private Object performOperation(String operator, Object left, Object right) {
        // Check if operands are numbers
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
                        // Division by zero case
                        return Double.NaN;
                    }
                default:
                    return null;  // Handle other operators as needed
            }
        }

        // Handle other operand types (e.g., strings or boolean operators) here if needed
        return null;
    }

    @Override
    public ASTNode visitPrint_statement(LispParser.Print_statementContext ctx) {
        ASTNode expression = visit(ctx.expression());
        return new PrintStatementNode(expression);
    }

    @Override
    public ASTNode visitFormat_expression(LispParser.Format_expressionContext ctx) {
        String destination = ctx.destination().getText();
        FormatExpressionNode formatNode = new FormatExpressionNode(destination);

        for (var directive : ctx.format_directive()) {
            formatNode.addDirective(directive.getText());
        }

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
    public ASTNode visitCase_expression(LispParser.Case_expressionContext ctx) {
        ASTNode caseExpression = visit(ctx.expression());
        CaseExpressionNode caseNode = new CaseExpressionNode(caseExpression);

        for (var clause : ctx.case_clause()) {
            caseNode.addClause(visit(clause));
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
            // Retrieve the operator and operands
            String operator = ctx.operator().getText();
            ASTNode left = visit(ctx.expression(0)); // First operand
            ASTNode right = visit(ctx.expression(1)); // Second operand

            // Construct the OperationNode with operator and operands
            OperationNode operationNode = new OperationNode(operator, left, right);

            // Get the result of the operation
            Object result = operationNode.getResult();


            // Return the result as an AtomNode
            return new AtomNode(result.toString());
        } else if (ctx.IDENTIFIER() != null) {
            // Handle identifiers directly
            String identifier = ctx.IDENTIFIER().getText();
            Object value = symbolTable.get(identifier); // Retrieve the value from the symbol table
            if (value == null) {
                throw new RuntimeException("Variable '" + identifier + "' is not initialized.");
            }
            return new AtomNode(value.toString());
        }

        return null; // Default case if neither operator nor identifier is present
    }




}