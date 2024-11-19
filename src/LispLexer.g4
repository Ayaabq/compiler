lexer grammar LispLexer;

// Keywords for variable declarations and scope (case-insensitive)
DEFVAR : [dD][eE][fF][vV][aA][rR] ;
SETQ : [sS][eE][tT][qQ] ;
LET : [lL][eE][tT] ;
LET_STAR : [lL][eE][tT][*] ;

// Conditionals
IF : [iI][fF] ;
COND : [cC][oO][nN][dD] ;

// Keyword for lambda functions
LAMBDA : [lL][aA][mM][bB][dD][aA] ;
FUNCALL : [fF][uU][nN][cC][aA][lL] ;

// Keywords for Functions and Loops
DEFUN : [dD][eE][fF][uU][nN] ;
DOTIMES : [dD][oO][tT][iI][mM][eE][sS] ;
DOLIST : [dD][oO][lL][iI][sS][tT] ;
PRINT : [pP][rR][iI][nN][tT] ;
FORMAT : [fF][oO][rR][mM][aA][tT] ;

// arithmetic functions 
FLOOR     : [fF][lL][oO][oO][rR] ;         
CEILING   : [cC][eE][iI][lL][iI][nN][gG] ;   
MOD       : [mM][oO][dD] ;                   
SIN       : [sS][iI][nN] ;                
COS       : [cC][oO][sS] ;                  
TAN       : [tT][aA][nN] ;                  
SQRT      : [sS][qQ][rR][tT] ;                
EXP       : [eE][xX][pP] ;                   // e* 
EXPT      : [eE][xX][pP][tT] ;               // exponent with a base other than e 


// Tokens for cons cell operations (cons CAR CDR) (cons 4 5)
CONS     : [cC][oO][nN][sS] ;
CAR      : [cC][aA][rR] ;
CDR      : [cC][dD][rR] ;



// Identifiers
ID          : [a-zA-Z]+;                      

T           : [Tt];
NIL         : [Nn][Ii][Ll];

KEYWORD     : ':' [a-zA-Z][a-zA-Z0-9-]*; //  self-evaluating symbols + any symbol whose name starts with a colon is a keyword.

// Special variables or identifiers
SPECIAL_IDENTIFIER : '*' LETTER (LETTER | DIGIT | SPECIAL_CHAR)* '*' ;
TERMINAL : 't' ;



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
// NUMBER : INTEGER | REAL | RATIONAL | COMPLEX ;
INTEGER: [+-]? [0-9]+; //An integer is a string of digits that can optionally start with a + or - sign
REAL : [+-]? [0-9]+ '.' [0-9]+ ([eE] [+-]? [0-9]+)? ; // ex: 3.1415, 1.722e-15 // A real number looks like an integer but includes a decimal point. It can also be expressed in scientific notation
RATIONAL : INTEGER '/' INTEGER ;
COMPLEX : '#c' '(' REAL ' ' REAL ')' ; // A complex number is written in the form #c(r i), where r is the real part and i is the imaginary part.



// Parentheses for Lists and Collections
LPAREN : '(' ;
RPAREN : ')' ;

// Whitespace and Comments
WS : [ \t\r\n]+ -> skip ;
COMMENT : ';;' ~[\r\n]* -> skip ;
MULTI_LINE_COMMENT: '#|' .*? '|#' -> skip ;

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
