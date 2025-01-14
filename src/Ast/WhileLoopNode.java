package Ast;

import java.util.List;

public class WhileLoopNode extends ASTNode {
    private ASTNode condition;
    private List<ASTNode> body;

    public WhileLoopNode(ASTNode condition, List<ASTNode> body) {
        this.condition = condition;
        this.body = body;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("While Loop:\n");
        sb.append(indent).append("    Condition: ").append(condition.prettyPrint(indent + "        ")).append("\n");
        sb.append(indent).append("    Body:\n");

        for (ASTNode bodyNode : body) {
            sb.append(bodyNode.prettyPrint(indent + "        ")).append("\n");
        }

        return sb.toString();
    }
}
