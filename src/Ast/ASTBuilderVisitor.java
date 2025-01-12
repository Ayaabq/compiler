package Ast;


import Grammar.LispParserBaseVisitor;
import Grammar.LispParser;
import java.util.ArrayList;
import java.util.List;

public class ASTBuilderVisitor extends LispParserBaseVisitor<ASTNode>{
    private List<String> declaredVariables = new ArrayList<>(); // Tracks declared variables
    public List<String> semanticErrors = new ArrayList<>(); // Stores semantic errors

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
        ASTNode expression = visit(ctx.expression());

        if (declaredVariables.contains(identifier)) {
            semanticErrors.add("Variable '" + identifier + "' is already defined.");
        } else {
            declaredVariables.add(identifier);
        }

        return new VariableDefinitionNode(identifier, expression);
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
        ASTNode condition = visit(ctx.condition());
        ASTNode trueBranch = visit(ctx.expression(0));
        ASTNode falseBranch = ctx.expression(1) != null ? visit(ctx.expression(1)) : null;

        return new ConditionalNode(condition, trueBranch, falseBranch);
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
        }
        return null;
    }

    @Override
    public ASTNode visitAtom(LispParser.AtomContext ctx) {
        if (ctx.INTEGER() != null) {
            return new AtomNode(ctx.INTEGER().getText());
        } else if (ctx.REAL() != null) {
            return new AtomNode(ctx.REAL().getText());
        } else if (ctx.IDENTIFIER() != null) {
            String identifier = ctx.IDENTIFIER().getText();
            if (!declaredVariables.contains(identifier)) {
                semanticErrors.add("Variable '" + identifier + "' is not declared.");
            }
            return new AtomNode(identifier);
        }
        return null;
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
        ASTNode left = visit(ctx.expression(0));
        ASTNode right = visit(ctx.expression(1));

        return new OperationNode(operator, left, right);
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
}