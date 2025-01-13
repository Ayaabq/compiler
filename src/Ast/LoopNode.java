package Ast;

import java.util.List;

public class LoopNode extends ASTNode {
    private String iterator;
    private ASTNode limit;
    private List<ASTNode> body;

    public LoopNode(String iterator, ASTNode limit, List<ASTNode> body) {
        this.iterator = iterator;
        this.limit = limit;
        this.body = body;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("Loop:\n");
        sb.append(indent).append("    Iterator: ").append(iterator).append("\n");
        sb.append(indent).append("    Limit: ").append(limit.prettyPrint(indent + "        ")).append("\n");
        sb.append(indent).append("    Body:\n");

        for (ASTNode bodyNode : body) {
            sb.append(bodyNode.prettyPrint(indent + "        ")).append("\n");
        }

        return sb.toString();
    }
}
