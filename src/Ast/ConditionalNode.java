package Ast;

public class ConditionalNode extends ASTNode {
    private ASTNode condition;
    private ASTNode trueBranch;
    private ASTNode falseBranch;

    public ConditionalNode(ASTNode condition, ASTNode trueBranch, ASTNode falseBranch) {
        this.condition = condition;
        this.trueBranch = trueBranch;
        this.falseBranch = falseBranch;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("Conditional:\n");
        if (condition != null) {
            sb.append(indent).append("    Condition: ").append(condition.prettyPrint(indent + "        ")).append("\n");
        } else {
            sb.append(indent).append("    Condition: null\n");
        }
        if (trueBranch != null) {
            sb.append(indent).append("    TrueBranch: ").append(trueBranch.prettyPrint(indent + "        ")).append("\n");
        } else {
            sb.append(indent).append("    TrueBranch: null\n");
        }
        if (falseBranch != null) {
            sb.append(indent).append("    FalseBranch: ").append(falseBranch.prettyPrint(indent + "        ")).append("\n");
        }
        return sb.toString();
    }

}

