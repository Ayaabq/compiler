package Ast;

import java.util.ArrayList;
import java.util.List;

public class FunctionCallNode extends ASTNode {
    private String functionName;
    private List<ASTNode> arguments = new ArrayList<>();

    public FunctionCallNode(String functionName) {
        this.functionName = functionName;
    }

    public void addArgument(ASTNode argument) {
        arguments.add(argument);
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("FunctionCall: ").append(functionName).append("\n");
        for (ASTNode arg : arguments) {
            sb.append(arg.prettyPrint(indent + "    ")).append("\n");
        }
        return sb.toString().trim();
    }
}
