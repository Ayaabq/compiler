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

// Identifiers
T : [Tt] ;
NIL : [Nn][Ii][Ll] ;

KEYWORD : ':' [a-zA-Z][a-zA-Z0-9-]* ;
SPECIAL_IDENTIFIER : '*' LETTER (LETTER | DIGIT | SPECIAL_CHAR)* '*' ;
TERMINAL : 't' ;

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
AND : 'and' ;
OR : 'or' ;
NOT : 'not' ;

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


// ATOMIC_SYMBOL
ATOMIC_SYMBOL : LETTER ATOM_PART? ;

//FORMATE_EXPRISSION : FORMAT LPAREN T '"'->pushMode(FORMATE_EXPRISSION) ;
// String
STRING_START : '"' -> pushMode(STRING_MODE) ;
ERROR_CHAR : . ;



mode STRING_MODE;
STRING_CONTENT : ~["\\]* ('\\' [\r\n])* ;
ESCAPED_CHAR   : '\\' [btnfr"\\] ;
STRING_ERROR_CHAR : ~'"' ;
STRING_END     : '"' -> popMode ;
//mode FORMATE_STRING_MODE;
//FORMATE_STRING_CONTENT : ~["\\]* ('\\' [\r\n])* ;
//FORMATE_ESCAPED_CHAR   : '\\' [btnfr"\\] ;
//FORMATE_STRING_ERROR_CHAR : ~'"' ;
//FORMATE_STRING_END     : '"' -> popMode ;
// String
//
//STRING: '"' (ESCAPED_CHAR | ~["\\])* ('\\' [\r\n])* '"';
//
//fragment ESCAPED_CHAR : '\\' [btnfr"\\];

