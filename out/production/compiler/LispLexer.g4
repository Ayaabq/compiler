lexer grammar LispLexer;

// Default mode tokens
DEFVAR : [dD][eE][fF][vV][aA][rR] ;
SETQ : [sS][eE][tT][qQ] ;
LET : [lL][eE][tT] ;
LET_STAR : [lL][eE][tT][*] ;

// Conditionals
IF : [iI][fF] ;
COND : [cC][oO][nN][dD] ;

// lambda functions
LAMBDA : [lL][aA][mM][bB][dD][aA] ;
FUNCALL : [fF][uU][nN][cC][aA][lL] ;

// Functions and Loops
DEFUN : [dD][eE][fF][uU][nN] ;
DOTIMES : [dD][oO][tT][iI][mM][eE][sS] ;
DOLIST : [dD][oO][lL][iI][sS][tT] ;
PRINT : [pP][rR][iI][nN][tT] ;
FORMAT : [fF][oO][rR][mM][aA][tT] ;
OPTIONAL : [&][oO][pP][tT][iI][oO][nN][aA][lL] ;
REST     : [&][rR][eE][sS][tT] ;
KEY      : [&][kK][eE][yY] ;   // (defun foo (&key (x 5)) x)

// Arithmetic functions
FLOOR : [fF][lL][oO][oO][rR] ;
CEILING : [cC][eE][iI][lL][iI][nN][gG] ;
MOD : [mM][oO][dD] ;
SIN : [sS][iI][nN] ;
COS : [cC][oO][sS] ;
TAN : [tT][aA][nN] ;
SQRT : [sS][qQ][rR][tT] ;
EXP : [eE][xX][pP] ;
EXPT : [eE][xX][pP][tT] ;

//  cons cell operations
CONS : [cC][oO][nN][sS] ;
CAR : [cC][aA][rR] ;
CDR : [cC][dD][rR] ;

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

// Tokens for list operations
LIST     : [lL][iI][sS][tT] ;
PUSH     : [pP][uU][sS][hH] ; //(push 4 a)
POP      : [pP][oO][pP] ;

// Identifiers
T : [Tt] ;
NIL : [Nn][Ii][Ll] ;

KEYWORD : ':' [a-zA-Z][a-zA-Z0-9-]* ;
SPECIAL_IDENTIFIER : '*' LETTER (LETTER | DIGIT | SPECIAL_CHAR)* '*' ;
TERMINAL : 't' ;

// Tokens for format-related keywords and symbols
TILDE     : '~' ;                        // Tilde character
DIRECTIVE_S : '~' [sS] ;                // ~S directive e for any Lisp object.
DIRECTIVE_D : '~' [dD] ;                // ~D directive for integers.
DIRECTIVE_NEWLINE : '~' '%' ;            // ~% directive for newlines.
DIRECTIVE_TILDE : '~~' ;                 // ~~ directive to output a single tilde.
// DIRECTIVE_A : '~' [aA] ;                // ~a directive for pretty printing


// Atoms and Identifiers
fragment ATOM_PART : (LETTER | DIGIT | SPECIAL_CHAR)* ;
fragment LETTER : [a-zA-Z] ;
fragment DIGIT : [0-9] ;
fragment SPECIAL_CHAR : [-_?!+*/<>:] ;

// Parentheses for Lists and Collections
LPAREN : '(' ;
RPAREN : ')' ;

// Numbers
INTEGER : [+-]? [0-9]+ ;
REAL : [+-]? [0-9]+ '.' [0-9]+ ([eE] [+-]? [0-9]+)? ;
RATIONAL : INTEGER '/' INTEGER ;
COMPLEX : '#'[cC] '(' REAL ' ' REAL ')' ;

// Whitespace and Comments
WS : [ \t\r\n]+ -> skip ;
COMMENT : ';'+ ~[\r\n]* -> skip ;
MULTI_LINE_COMMENT : '#|' .*? '|#' -> skip ;

// Arithmetic and Logical Operators
ADD : '+' ;
SUB : '-' ;
MUL : '*' ;
DIV : '/' ;
//concatenate
CONCATENATE: [Cc][Oo][Nn][Cc][Aa][Tt][Ee][Nn][Aa][Tt][Ee];

// Comparison Operators
NOTEQUAL : '/=' ;
LT : '<' ;
GT : '>' ;
LE : '<=' ;
GE : '>=' ;

// Equality
EQ : [eE][qQ] ;
EQUAL : [eE][qQ][uU][aA][lL] ;
EQL : [eE][qQ][lL] ;
NUM_EQ : '=' ;

// Sort
SORT : [Ss][Oo][Rr][Tt] ;
STABLE_SORT : [Ss][Tt][Aa][Bb][Ll][eE]'-'[Ss][oO][rR][tT] ;

// Keywords for special forms
QUOTE : '\'' | [qQ][uU][oO][tT][eE] ;
FUNCTION : '#' | [fF][uU][nN][cC][tT][iI][oO][nN] ;

// Special variables
SPECIAL_VARIABLE : '*' LETTER (LETTER | DIGIT | SPECIAL_CHAR)* '*' ;

// Keywords for Array Manipulation
MAKE_ARRAY : [mM][aA][kK][eE][-][aA][rR][rR][aA][yY] ;
AREF : [aA][rR][eE][fF] ;

// Keywords for Structure Manipulation
DEFSTRUCT : [dD][eE][fF][sS][tT][rR][uU][cC][tT] ;
MAKE_STRUCT : [mM][aA][kK][eE][-] [a-zA-Z]+ ;
FIELD_ACCESS : [a-zA-Z]+ '-' [a-zA-Z]+ ;

DEFPARAMETER : [dD][eE][fF][Pp][Aa][Rr][Aa][Mm][eE][Tt][Ee][Rr];

// ATOMIC_SYMBOL
ATOMIC_SYMBOL : LETTER ATOM_PART? ;

//FORMATE_EXPRISSION : LPAREN FORMAT  T '"'.*'"' RPAREN SPECIAL_IDENTIFIER->pushMode(FORMATE_STRING_MODE) ;
// String
STRING_START : '"' -> pushMode(STRING_MODE) ;
ERROR_CHAR : . ;



mode STRING_MODE;
STRING_CONTENT : ~["\\]* ('\\' [\r\n])* ;
ESCAPED_CHAR   : '\\' [btnfr"\\] ;
STRING_ERROR_CHAR : ~'"' ;
STRING_END     : '"' -> popMode ;

//mode FORMATE_STRING_MODE;
//FORMATE_STRING_CONTENT : ~["\\]*  ;
//FORMATE_ESCAPED_CHAR   : ['\\']*[~%]*[~a]* ;
//FORMATE_STRING_ERROR_CHAR : ~'"' ;
//FORMATE_STRING_END     : '"' -> popMode ;
// String
//
//STRING: '"' (ESCAPED_CHAR | ~["\\])* ('\\' [\r\n])* '"';
//
//fragment ESCAPED_CHAR : '\\' [btnfr"\\];

