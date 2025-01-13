package Ast;

import java.util.ArrayList;
import java.util.List;

public class BlockNode extends ASTNode {
    private List<ASTNode> statements;
    private List<ASTNode> expressions;

    public BlockNode() {
        this.statements = new ArrayList<>();
        this.expressions = new ArrayList<>();
    }

    public void addStatement(ASTNode statement) {
        statements.add(statement);
    }

    public void addExpression(ASTNode expression) {
        expressions.add(expression);
    }

    public List<ASTNode> getStatements() {
        return statements;
    }

    public List<ASTNode> getExpressions() {
        return expressions;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();


        for (ASTNode statement : statements) {
            sb.append(statement.prettyPrint(indent + "    "));
        }

        for (ASTNode expression : expressions) {
            sb.append(expression.prettyPrint(indent + "    "));
        }

        return sb.toString();
    }
}
