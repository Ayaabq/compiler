package Ast;


import java.util.List;

public class LambdaFunctionNode extends ASTNode {
    private List<String> parameters;
    private ASTNode body;

    public LambdaFunctionNode(List<String> parameters, ASTNode body) {
        this.parameters = parameters;
        this.body = body;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("LambdaFunction:\n");
        sb.append(indent).append("    Parameters: ").append(parameters).append("\n");
        sb.append(body.prettyPrint(indent + "    "));
        return sb.toString();
    }
}
