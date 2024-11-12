lexer grammar LispLexer;

// Keywords for variable declarations and scope
DEFVAR : 'defvar' ;
SETQ : 'setq' ;
LET : 'let' ;
LET_STAR : 'let*' ;

// Special variables or identifiers
SPECIAL_IDENTIFIER : '*' LETTER (LETTER | DIGIT | SPECIAL_CHAR)* '*' ;
TERMINAL : 't' ;  // Rule for recognizing 't' as a special symbol
FALSE : 'nil' ;
// Keywords for Functions and Loops
DEFUN : 'defun' ;
DOTIMES : 'dotimes' ;
DOLIST : 'dolist' ;
PRINT : 'print' ;
FORMAT : 'format' ;  // Adding format as a keyword

// Atoms and Identifiers
ATOMIC_SYMBOL : LETTER ATOM_PART? ;
fragment ATOM_PART : (LETTER | DIGIT | SPECIAL_CHAR)* ;
fragment LETTER : [a-zA-Z] ;
fragment DIGIT : [0-9] ;
fragment SPECIAL_CHAR : [-_?!+*/<>] ;

// String
STRING : '"' (ESCAPED_CHAR | ~["\\])* '"' ;
fragment ESCAPED_CHAR : '\\' . ;

// Numbers
NUMBER : [+-]? [0-9]+ ('.' [0-9]+)? ;

// Parentheses for Lists and Collections
LPAREN : '(' ;
RPAREN : ')' ;

// Whitespace and Comments
WS : [ \t\r\n]+ -> skip ;
COMMENT : ';' ~[\r\n]* -> skip ;
MULTI_LINE_COMMENT: '#||' .*? '||#' -> skip ;

// Arithmetic and Logical Operators
ADD : '+' ;
SUB : '-' ;
MUL : '*' ;
DIV : '/' ;
AND : 'and' ;
OR : 'or' ;
NOT : 'not' ;

// Comparison Operators
EQUAL : '=' ;
NOTEQUAL : '/=' ;
LT : '<' ;
GT : '>' ;
LE : '<=' ;
GE : '>=' ;