package Ast;

public class PrintFunctionCallNode extends ASTNode {
    private ASTNode result;
    private String prettyPrintedResult;

    public PrintFunctionCallNode(ASTNode result, String prettyPrintedResult) {
        this.result = result;
        this.prettyPrintedResult = prettyPrintedResult;
    }

    @Override
    public String prettyPrint(String indent) {
        return prettyPrintedResult;
    }

    public ASTNode getResult() {
        return result;
    }
}
