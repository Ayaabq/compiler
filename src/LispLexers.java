//import org.antlr.v4.runtime.CharStreams;
//import org.antlr.v4.runtime.CommonTokenStream;
//import org.antlr.v4.runtime.Token;
//
//import java.util.Scanner;
//public class LispLexers {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter input:");
//        String input = scanner.nextLine();
//
//        // Create a lexer instance using the input
//        LispLexer lexer = new LispLexer(CharStreams.fromString(input));
//
//        // Tokenize the input
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        tokens.fill();
//
//        // Print the tokens
//        for (Token token : tokens.getTokens()) {
//            String tokenName = LispLexer.VOCABULARY.getSymbolicName(token.getType());
//            System.out.println("Token Type: " + token.getType() +" "+ tokenName +" " + token.getText());
//        }
//
//        scanner.close();
//    }
//}

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

            // Print the tokens
            for (Token token : tokens.getTokens()) {
                String tokenName = LispLexer.VOCABULARY.getSymbolicName(token.getType());
                System.out.println("Token Type: " + token.getType() + " " + tokenName + " " + token.getText());
            }

            // Close the input stream
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
