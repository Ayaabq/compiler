package Ast;

public class PrintStatementNode extends ASTNode {
    private ASTNode expression;

    public PrintStatementNode(ASTNode expression) {
        this.expression = expression;
    }

    @Override
    public String prettyPrint(String indent) {
        return indent + "PrintStatement:\n" + expression.prettyPrint(indent + "    ");
    }
}
