package Ast;

import java.util.ArrayList;
import java.util.List;

public class FormatExpressionNode extends ASTNode {
    private String destination;
    private List<String> directives = new ArrayList<>();
    private List<ASTNode> expressions = new ArrayList<>();
    private String content = ""; // For storing the format content

    public FormatExpressionNode(String destination) {
        this.destination = destination;
    }

    public void addDirective(String directive) {
        directives.add(directive);
    }

    public void addExpression(ASTNode expression) {
        expressions.add(expression);
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("FormatExpression:\n");
        sb.append(indent).append("    Destination: ").append(destination).append("\n");
        sb.append(indent).append("    Content: ").append(content).append("\n");
        sb.append(indent).append("    Directives: ").append(directives).append("\n");
        sb.append(indent).append("    Expressions:\n");
        for (ASTNode expr : expressions) {
            sb.append(expr.prettyPrint(indent + "        ")).append("\n");
        }
        return sb.toString().trim();
    }

    public String generateFormattedOutput() {
        StringBuilder formattedOutput = new StringBuilder();
        int exprIndex = 0;

        for (String directive : directives) {
            switch (directive) {
                case "~d": // Decimal
                case "~a": // General string
                case "~s": // Symbolic representation
                    if (exprIndex < expressions.size()) {
                        Object value = evaluateExpression(expressions.get(exprIndex));
                        formattedOutput.append(value);
                        exprIndex++;
                    } else {
                        formattedOutput.append("<missing value>");
                    }
                    break;
                case "~%": // Newline
                    formattedOutput.append("\n");
                    break;
                default:
                    formattedOutput.append(directive);
                    break;
            }
        }

        return formattedOutput.toString();
    }

    private Object evaluateExpression(ASTNode expr) {
        if (expr instanceof AtomNode) {
            return ((AtomNode) expr).getValue();
        } else if (expr instanceof OperationNode) {
            return ((OperationNode) expr).getResult();
        }
        return "<unsupported expression>";
    }
}
