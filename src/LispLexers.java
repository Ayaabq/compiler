import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Trees;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class LispLexers {
    public static void main(String[] args) {
        try {
            // Create a FileInputStream to read from the file "lisp_code.lisp"
            File file = new File("src/lisp_code.lisp");
            FileInputStream inputStream = new FileInputStream(file);

            // Create a lexer instance using the input from the file
            LispLexer lexer = new LispLexer(CharStreams.fromStream(inputStream));

            // Tokenize the input
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Create the parser instance
            LispParser parser = new LispParser(tokens);

            // Parse the input and generate the parse tree
            ParseTree tree = parser.program();

            // Save the parse tree as text to a file
            File outputFile = new File("src/lisp_parse_tree.txt");
            try (PrintWriter writer = new PrintWriter(outputFile)) {
                writer.println("Parse Tree:");
                writer.println(Trees.toStringTree(tree, parser));
            }

            System.out.println("Parse tree has been saved to: " + outputFile.getAbsolutePath());

            // Close the input stream
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
