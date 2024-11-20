import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

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
            tokens.fill();

            // Print the header for the table
            System.out.printf("%-5s %-10s %-15s %-20s %s%n", "Index", "Line", "Column", "Token Type", "Value");
            System.out.println("---------------------------------------------------------------");

            // Print the tokens in a table format
            for (int i = 0; i < tokens.size(); i++) {
                Token token = tokens.get(i);
                String tokenName = lexer.getVocabulary().getSymbolicName(token.getType());
                System.out.printf("%-5d %-10d %-15d %-20s %s%n", 
                                  i, 
                                  token.getLine(), 
                                  token.getCharPositionInLine(), 
                                  tokenName, 
                                  token.getText());
            }

            // Close the input stream
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
