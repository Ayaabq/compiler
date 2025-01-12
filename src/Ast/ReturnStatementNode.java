package Ast;


public class ReturnStatementNode extends ASTNode {
    private String blockName;
    private ASTNode returnValue;

    public ReturnStatementNode(String blockName, ASTNode returnValue) {
        this.blockName = blockName;
        this.returnValue = returnValue;
    }

    @Override
    public String prettyPrint(String indent) {
        return indent + "ReturnStatement: " + blockName + " Value: " + returnValue.prettyPrint("");
    }
}
