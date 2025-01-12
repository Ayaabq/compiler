package Ast;

public class VariableDefinitionNode extends ASTNode {
    private String identifier;
    private ASTNode expression;

    public VariableDefinitionNode(String identifier, ASTNode expression) {
        this.identifier = identifier;
        this.expression = expression;
    }

    @Override
    public String prettyPrint(String indent) {
        return indent + "VariableDefinition: " + identifier + " = " + expression.prettyPrint("");
    }
}
