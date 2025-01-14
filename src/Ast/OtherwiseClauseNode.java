package Ast;

import java.util.List;

public class OtherwiseClauseNode extends ASTNode {
    private List<ASTNode> expressions;

    public OtherwiseClauseNode(List<ASTNode> expressions) {
        this.expressions = expressions;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("OtherwiseClause:\n");
        for (ASTNode expr : expressions) {
            sb.append(expr.prettyPrint(indent + "    ")).append("\n");
        }
        return sb.toString().trim();
    }
}
