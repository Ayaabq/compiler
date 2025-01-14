package Ast;

import Grammar.LispParser.BlockContext;
import java.util.List;

public class FunctionDefinitionNode extends ASTNode {
    private final String name;
    private final List<String> parameters;
    private final BlockContext blockContext; // Store the original BlockContext

    public FunctionDefinitionNode(String name, List<String> parameters, BlockContext blockContext) {
        this.name = name;
        this.parameters = parameters;
        this.blockContext = blockContext;
    }

    public String getName() {
        return name;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public BlockContext getBlockContext() {
        return blockContext; // Provide access to the stored BlockContext
    }

    @Override
    public String prettyPrint(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("FunctionDefinition: ").append(name).append("\n");
        sb.append(indent).append("    Parameters: ").append(parameters).append("\n");
        return sb.toString();
    }
}
