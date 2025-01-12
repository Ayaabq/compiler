package Ast;

public class OperationNode extends ASTNode {
    private String operator;
    private ASTNode left;
    private ASTNode right;

    public OperationNode(String operator, ASTNode left, ASTNode right) {
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    @Override
    public String prettyPrint(String indent) {
        return indent + operator + ":\n" +
                left.prettyPrint(indent + "    ") + "\n" +
                right.prettyPrint(indent + "    ");
    }
}
