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
    | print_statement
    | expression
    | block_statement
    | return_statement
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
    : IDENTIFIER* // Accept zero or more parameters
    ;

// A block of expressions (e.g., (progn ...))
block
    : (statement | expression)*
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
    | format_expression
    | operation
    | operator
    | print_statement
    | function_call
    | lambda_function
    | case_expression
    | progn_block
    | structure_definition
    | make_structure
    ;

// Atoms (numbers, strings, identifiers, booleans)
atom
    : INTEGER
    | REAL
    | STRING_START (escaped_char | string_content)* STRING_END // Handles strings with escaped characters
    | IDENTIFIER
    | KEYWORD
    | TERMINAL
    |SPECIAL_IDENTIFIER
    ;

escaped_char : ESCAPED_CHAR ;

string_content : STRING_CONTENT ;

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
    : LPAREN FUNCALL IDENTIFIER expression* RPAREN
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
    : LPAREN (operator | IDENTIFIER) expression+ RPAREN
    ;

// Print statement (e.g., (print x))
print_statement
    : LPAREN PRINT expression RPAREN
    ;

// Format expression (e.g., (format t "The number ~d is ~s" num val))
format_expression
    : LPAREN FORMAT destination (format_directive | format_content)* FORMAT_END expression* RPAREN
    ;




// Destination for format (e.g., t, nil, or an identifier)
destination
    : FORMAT_T
    | FORMAT_NIL
    | IDENTIFIER
    ;

// Format content
format_content
    : FORMAT_CONTENT
    ;

// Format directives
format_directive
    : FORMAT_DIRECTIVE_T
    | FORMAT_DIRECTIVE_S
    | FORMAT_DIRECTIVE_A
    | FORMAT_DIRECTIVE_D
    | FORMAT_DIRECTIVE_F
    | FORMAT_DIRECTIVE_E
    | FORMAT_DIRECTIVE_G
    | FORMAT_DIRECTIVE_L
    | FORMAT_DIRECTIVE_R
    | FORMAT_NEWLINE
    ;

// Lambda function (e.g., (lambda (x) (+ x 1)))
lambda_function
    : LPAREN LAMBDA LPAREN parameter_list RPAREN block RPAREN
    ;

// Case expression (e.g., (case x ((1 2) "one or two") (otherwise "other")))
case_expression
    : LPAREN CASE expression (case_clause)* RPAREN
    ;

case_clause
    : LPAREN expression+ RPAREN
    | LPAREN OTHERWISE expression+ RPAREN
    ;

// Progn block (e.g., (progn (print "Hello") (print "World")))
progn_block
    : LPAREN PROGN (statement | expression)* RPAREN
    ;

// Structure definition (e.g., (defstruct point x y))
structure_definition
    : LPAREN DEFSTRUCT IDENTIFIER (IDENTIFIER)* RPAREN
    ;

// Make structure (e.g., (make-struct point :x 10 :y 20))
make_structure
    : LPAREN MAKE_STRUCT IDENTIFIER (KEYWORD expression)* RPAREN
    ;

// Block statement (e.g., (block my-block (print "In block")))
block_statement
    : LPAREN BLOCK IDENTIFIER (statement | expression)* RPAREN
    ;

// Return statement (e.g., (return-from my-block x))
return_statement
    : LPAREN RETURN_FROM IDENTIFIER expression RPAREN
    ;
