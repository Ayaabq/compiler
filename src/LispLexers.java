import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class LispLexers {
    public static void main(String[] args) {
        try {
            // Specify the file path
            File file = new File("src/lisp_code.lisp");

            // Open a FileInputStream to read from the file
            FileInputStream inputStream = new FileInputStream(file);

            // Create a lexer instance using the input from the file
            LispLexer lexer = new LispLexer(CharStreams.fromStream(inputStream));

            // Tokenize the input
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            tokens.fill();

            // Print the tokens
            for (Token token : tokens.getTokens()) {
                String tokenName = LispLexer.VOCABULARY.getSymbolicName(token.getType());
                if (tokenName == null) {
                    tokenName = "UNKNOWN"; // Handle unrecognized tokens
                }

                System.out.printf(
                        "Index: %d, Line: %d, Column: %d, Type: %s, Value: %s%n",
                        token.getTokenIndex(),           // Token index
                        token.getLine(),                 // Line number
                        token.getCharPositionInLine(),   // Column number
                        tokenName,                       // Token type
                        token.getText()                  // Token value
                );

                // Handle lexical errors explicitly
                if ("ERROR_CHAR".equals(tokenName)) {
                    System.err.printf(
                            "Lexical Error: Unrecognized character '%s' at line %d, column %d%n",
                            token.getText(),
                            token.getLine(),
                            token.getCharPositionInLine()
                    );
                }
            }

            // Close the input stream
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
