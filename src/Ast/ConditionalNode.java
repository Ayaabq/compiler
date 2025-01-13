package Ast;

public class ConditionalNode extends ASTNode {
    private boolean condition;
    private ASTNode trueBranch;
    private ASTNode falseBranch;

    public ConditionalNode(boolean condition, ASTNode trueBranch, ASTNode falseBranch) {
        this.condition = condition;
        this.trueBranch = trueBranch;
        this.falseBranch = falseBranch;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();

System.out.println(condition);
            if (condition) { // Compare the value safely
                if (trueBranch != null) {
                    sb.append(indent)
                            .append(trueBranch.prettyPrint(indent)).append("\n");
                } else {
                    sb.append(indent).append("    TrueBranch: null\n");
                }
            } else  {
                if (falseBranch != null) {
                    sb.append(indent)
                            .append(falseBranch.prettyPrint(indent )).append("\n");
                } else {
                    sb.append(indent).append("    Condition: null\n");
                }
            }


        return sb.toString();
    }
}