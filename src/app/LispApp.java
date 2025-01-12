package app;

import java.io.IOException;

import Grammar.LispLexer;
import Grammar.LispParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import Ast.ASTBuilderVisitor;
import Ast.ASTNode;

public class LispApp {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java app.LispApp <file-name>");
            return;
        }

        String fileName = args[0];
        LispParser parser = getParser(fileName);

        if (parser == null) {
            System.err.println("Failed to initialize the parser.");
            return;
        }

        // Parse the input and generate the parse tree
        ParseTree progContext = parser.program();

        // Build the AST using the visitor
        ASTBuilderVisitor visitor = new ASTBuilderVisitor();
        ASTNode ast = visitor.visit(progContext);

        // Print the generated AST
        System.out.println("Abstract Syntax Tree:");
        System.out.println(ast.prettyPrint(""));

        // Check for semantic errors
        if (visitor.semanticErrors.isEmpty()) {
            System.out.println("No semantic errors found.");
        } else {
            System.out.println("Semantic Errors:");
            for (String error : visitor.semanticErrors) {
                System.out.println(error);
            }
        }
    }

    private static LispParser getParser(String fileName) {
        LispParser parser = null;
        try {
            CharStream input = CharStreams.fromFileName(fileName);
            LispLexer lexer = new LispLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new LispParser(tokens);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parser;
    }
}
