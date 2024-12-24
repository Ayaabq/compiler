parser grammar LispParser;

 options {
   tokenVocab = LispLexer; // Connects the lexer file
 }

 // Root rule for the program
 program
     : statement* EOF ; // A Lisp program consists of multiple statements or expressions

 // Statements
 statement
     : variable_definition
     | function_definition
     | conditional
     | loop
     | expression // Expressions are also valid standalone statements
     ;

 // Variable definition (e.g., (setq x 5))
 variable_definition
     : LPAREN SETQ IDENTIFIER expression RPAREN
     ;

 // Function definition (e.g., (defun add (x y) (+ x y)))
 function_definition
     : LPAREN DEFUN IDENTIFIER LPAREN parameter_list RPAREN block RPAREN
     ;

 // Parameters for a function
 parameter_list
     : IDENTIFIER* // A list of identifiers
     ;

 // A block of expressions (e.g., (progn ...))
 block
     : LPAREN (statement | expression)* RPAREN
     ;

 // Conditionals (e.g., (if (< x 10) "small" "large"))
 conditional
     : LPAREN IF condition expression (expression)? RPAREN
     ;

 // Loops (e.g., (dotimes (i 10) (print i)))
 loop
     : LPAREN DOTIMES LPAREN IDENTIFIER expression RPAREN block RPAREN
     ;

 // General expression
 expression
     : atom
     | list
     | operation
     | function_call
     ;

 // Atoms (numbers, strings, identifiers, booleans)
 atom
     : INTEGER
     | REAL
     | STRING_CONTENT
     | IDENTIFIER
     | TERMINAL // For true/false values
     ;

 // List of expressions
 list
     : LPAREN expression* RPAREN
     ;

 // Operations (e.g., (+ x y))
 operation
     : LPAREN operator expression+ RPAREN
     ;

 // Function calls (e.g., (funcall my-func arg1 arg2))
 function_call
     : LPAREN FUNCALL IDENTIFIER (expression)* RPAREN
     ;

 // Supported operators
 operator
     : ADD | SUB | MUL | DIV // Arithmetic
     | AND | OR | NOT        // Logical
     | LT | GT | LE | GE     // Comparisons
     | EQ | EQUAL | NUM_EQ   // Equality
     ;

 // Condition (used in if or loops)
 condition
     : LPAREN operator expression+ RPAREN
     ;
