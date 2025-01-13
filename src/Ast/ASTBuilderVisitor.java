package Ast;

import Grammar.LispParserBaseVisitor;
import Grammar.LispParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ASTBuilderVisitor extends LispParserBaseVisitor<ASTNode> {
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
        ASTNode body = visit(ctx.block());
        return new FunctionDefinitionNode(functionName, parameters, body);
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

            // Visit the block for the loop body and evaluate it
            ASTNode bodyNode = visit(ctx.block());

            // Add the evaluated body node to the list
            bodyList.add(bodyNode);
        }

        // Remove the iterator variable from the scope or symbol table after the loop
        symbolTable.remove(iterator);

        // Return the LoopNode with the iterator, limit, and the body list
        return new LoopNode(iterator, limitNode, bodyList);
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
            return new AtomNode(ctx.getText().substring(1, ctx.getText().length() - 1));
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
        for (var exprContext : ctx.children) {
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
            return ((AtomNode) node).getValue();
        } else if (node instanceof OperationNode) {
            OperationNode operation = (OperationNode) node;
            Object leftValue = evaluateExpression(operation.getLeft());
            Object rightValue = evaluateExpression(operation.getRight());
            return performOperation(operation.getOperator(), leftValue, rightValue);
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
