package Ast;

import java.util.List;

public class FunctionDefinitionNode extends ASTNode {
    private String name;
    private List<String> parameters;
    private ASTNode block;

    public FunctionDefinitionNode(String name, List<String> parameters, ASTNode block) {
        this.name = name;
        this.parameters = parameters;
        this.block = block;
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("FunctionDefinition: ").append(name).append("\n");
        sb.append(indent).append("    Parameters: ").append(parameters).append("\n");
        sb.append(block.prettyPrint(indent + "    "));
        return sb.toString();
    }
}

