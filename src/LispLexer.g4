lexer grammar LispLexer;

// Default mode tokens
DEFVAR : [dD][eE][fF][vV][aA][rR] ;
SETQ : [sS][eE][tT][qQ] ;
LET : [lL][eE][tT] ;
LET_STAR : [lL][eE][tT][*] ;

// Conditionals
IF : [iI][fF] ;
COND : [cC][oO][nN][dD] ;

T           : [Tt];
NIL         : [Nn][Ii][Ll];

// Keyword for lambda functions
LAMBDA : [lL][aA][mM][bB][dD][aA] ;
FUNCALL : [fF][uU][nN][cC][aA][lL] ;

// Keywords for Functions and Loops
DEFUN : [dD][eE][fF][uU][nN] ;
DOTIMES : [dD][oO][tT][iI][mM][eE][sS] ;
DOLIST : [dD][oO][lL][iI][sS][tT] ;
PRINT : [pP][rR][iI][nN][tT] ;
FORMAT : [fF][oO][rR][mM][aA][tT] ;
OPTIONAL : [&][oO][pP][tT][iI][oO][nN][aA][lL] ; 
REST     : [&][rR][eE][sS][tT] ;    
KEY      : [&][kK][eE][yY] ;   // (defun foo (&key (x 5)) x)


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

///
SETF : [sS][eE][tT][fF] ;
WHEN : [wW][hH][eE][nN];
UNLESS : [uU][nN][lL][eE][sS][sS];
CASE : [cC][aA][sS][eE];
OTHERWISE : [oO][tT][hH][eE][rR][wW][iI][sS][eE];
PROGN : [pP][rR][oO][gG][nN];

///
AND : [aA][nN][dD] ;
OR : [oO][rR];
NOT : [nN][oO][tT] ;
APPLY : [aA][pP][pP][lL][yY] ;
MAPCAR : [mM][aA][pP][cC][aA][rR] ;

///
RETURN_FROM : [rR][eE][tT][uU][rR][nN][-][fF][rR][oO][mM] ;
BLOCK : [bB][lL][oO][cC][kK] ; 
RETURN : [rR][eE][tT][uU][rR][nN] ; 
ERROR : [eE][rR][rR][oO][rR] ;
LOOP : [lL][oO][oO][pP] ;
DO : [dD][oO] ;
DO_STAR : [dD][oO][*] ;

// Tokens for cons cell operations (cons CAR CDR) (cons 4 5)
CONS     : [cC][oO][nN][sS] ;
CAR      : [cC][aA][rR] ;
CDR      : [cC][dD][rR] ;

// Tokens for list operations 
LIST     : [lL][iI][sS][tT] ;
PUSH     : [pP][uU][sS][hH] ; //(push 4 a)
POP      : [pP][oO][pP] ;

// Identifiers
KEYWORD     : ':' [a-zA-Z][a-zA-Z0-9-]*; //  self-evaluating symbols + any symbol whose name starts with a colon is a keyword.

// Special variables or identifiers
//SPECIAL_IDENTIFIER : '*' LETTER (LETTER | DIGIT | SPECIAL_CHAR)* '*' ;
TERMINAL : 't' ;

// Parentheses for Lists and Collections
LPAREN : '(' ;
RPAREN : ')' ;

// Tokens for format-related keywords and symbols
TILDE     : '~' ;                        // Tilde character
DIRECTIVE_S : '~' [sS] ;                // ~S directive e for any Lisp object.
DIRECTIVE_D : '~' [dD] ;                // ~D directive for integers.
DIRECTIVE_NEWLINE : '~' '%' ;            // ~% directive for newlines.
DIRECTIVE_TILDE : '~~' ;                 // ~~ directive to output a single tilde.
// DIRECTIVE_A : '~' [aA] ;                // ~a directive for pretty printing

IDENTIFIER : [a-zA-Z_][a-zA-Z0-9_]* ; // Identifiers (function names, variable names)


// Sort
SORT : [Ss][Oo][Rr][Tt] ;
STABLE_SORT : [Ss][Tt][Aa][Bb][Ll][eE]'-'[Ss][oO][rR][tT] ;

// For special forms
QUOTE : '\'' | [qQ][uU][oO][tT][eE] ; // ' or quote
FUNCTION : '#' | [fF][uU][nN][cC][tT][iI][oO][nN] ;

// Keywords for Array Manipulation
MAKE_ARRAY : [mM][aA][kK][eE][-][aA][rR][rR][aA][yY] ;
AREF : [aA][rR][eE][fF] ;

// Special variables (dynamically scoped)
// SPECIAL_VARIABLE : '*' LETTER (LETTER | DIGIT | SPECIAL_CHAR)* '*';

//???? concatenate ,, list*
// Keywords for Structure Manipulation 
DEFSTRUCT : [dD][eE][fF][sS][tT][rR][uU][cC][tT] ;
MAKE_STRUCT : [mM][aA][kK][eE][-] [a-zA-Z]+ ; // Matches make-<struct_name>
FIELD_ACCESS : [a-zA-Z]+ '-' [a-zA-Z]+ ; // Matches <struct_name>-<field_name>

// Arithmetic and Logical Operators
ADD : '+' ;
SUB : '-' ;
MUL : '*' ;
DIV : '/' ;

// Equality
EQ : [eE][qQ] ;
EQUAL : [eE][qQ][uU][aA][lL] ;
EQL : [eE][qQ][lL] ;
NUM_EQ : '=' ;

// Comparison Operators
NOTEQUAL : '/=' ;
LT : '<' ;
GT : '>' ;
LE : '<=' ;
GE : '>=' ;

// Atoms and Identifiers
fragment ATOM_PART : (LETTER | DIGIT | SPECIAL_CHAR)* ;
fragment LETTER : [a-zA-Z] ;
fragment DIGIT : [0-9] ;
fragment SPECIAL_CHAR : [-_?!+*/<>:] ;

// // String definition (after directives)
// STRING : '"' (ESCAPED_CHAR | ~["\\~])* '"' ; // Exclude ~ from being treated as part of the string
// fragment ESCAPED_CHAR : '\\' . ;

// Numbers
// NUMBER : INTEGER | REAL | RATIONAL | COMPLEX ;
INTEGER: [+-]? [0-9]+; //An integer is a string of digits that can optionally start with a + or - sign
REAL : [+-]? [0-9]+ '.' [0-9]+ ([eE] [+-]? [0-9]+)? ; // ex: 3.1415, 1.722e-15 // A real number looks like an integer but includes a decimal point. It can also be expressed in scientific notation
RATIONAL : INTEGER '/' INTEGER ;
COMPLEX : '#c' '(' REAL ' ' REAL ')' ; // A complex number is written in the form #c(r i), where r is the real part and i is the imaginary part.

// Whitespace and Comments
WS : [ \t\r\n]+ -> skip ;
COMMENT : ';;' ~[\r\n]* -> skip ;
MULTI_LINE_COMMENT: '#|' .*? '|#' -> skip ;

ATOMIC_SYMBOL : LETTER ATOM_PART? ;
//FORMATE_EXPRISSION : FORMAT LPAREN T '"'->pushMode(FORMATE_EXPRISSION) ;
// String
STRING_START : '"' -> pushMode(STRING_MODE) ;
ERROR_CHAR : . ;

mode STRING_MODE;
STRING_CONTENT: '"' (ESCAPED_CHAR | ~["\\~])* '"' ;
//STRING_CONTENT : (ESCAPED_CHAR | ~[\"\\\])+ ; // At least one character must be matched
ESCAPED_CHAR   : '\\' [btnfr"\\] ;
STRING_ERROR_CHAR : ~'"' ;
STRING_END     : '"' -> popMode ;

// Directives and special identifiers
DIRECTIVE_A : '~' [aA]; // ~a directive for pretty printing
SPECIAL_IDENTIFIER : '*' LETTER (LETTER | DIGIT | SPECIAL_CHAR)* '*';



