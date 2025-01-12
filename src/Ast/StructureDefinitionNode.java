package Ast;

import java.util.List;

public class StructureDefinitionNode extends ASTNode {
    private String name;
    private List<String> fields;

    public StructureDefinitionNode(String name, List<String> fields) {
        this.name = name;
        this.fields = fields;
    }

    @Override
    public String prettyPrint(String indent) {
        return indent + "StructureDefinition: " + name + " Fields: " + fields;
    }
}
