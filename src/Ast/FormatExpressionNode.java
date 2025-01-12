package Ast;

import java.util.ArrayList;
import java.util.List;

public class FormatExpressionNode extends ASTNode {
    private String destination;
    private List<String> directives = new ArrayList<>();
    private List<ASTNode> expressions = new ArrayList<>();

    public FormatExpressionNode(String destination) {
        this.destination = destination;
    }

    public void addDirective(String directive) {
        directives.add(directive);
    }

    public void addExpression(ASTNode expression) {
        expressions.add(expression);
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("FormatExpression:\n");
        sb.append(indent).append("    Destination: ").append(destination).append("\n");
        sb.append(indent).append("    Directives: ").append(directives).append("\n");
        sb.append(indent).append("    Expressions:\n");
        for (ASTNode expr : expressions) {
            sb.append(expr.prettyPrint(indent + "        ")).append("\n");
        }
        return sb.toString().trim();
    }
}
