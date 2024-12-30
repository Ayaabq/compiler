// Updated LispLexer.g4
lexer grammar LispLexer;

// Default mode tokens
DEFVAR : [dD][eE][fF][vV][aA][rR] ;
SETQ : [sS][eE][tT][qQ] ;
LET : [lL][eE][tT] ;
LET_STAR : [lL][eE][tT][*] ;

// Conditionals
IF : [iI][fF] ;
COND : [cC][oO][nN][dD] ;

// Lambda functions
LAMBDA : [lL][aA][mM][bB][dD][aA] ;
FUNCALL : [fF][uU][nN][cC][aA][lL] ;

// Functions and Loops
DEFUN : [dD][eE][fF][uU][nN] ;
DOTIMES : [dD][oO][tT][iI][mM][eE][sS] ;
DOLIST : [dD][oO][lL][iI][sS][tT] ;
PRINT : [pP][rR][iI][nN][tT] ;
FORMAT : [fF][oO][rR][mM][aA][tT] ;
FORMAT_T : [tT]' "' -> pushMode(FORMAT_MODE) ;
FORMAT_NIL : [nN][iI][lL]' "' -> pushMode(FORMAT_MODE) ;

OPTIONAL : [&][oO][pP][tT][iI][oO][nN][aA][lL] ;
REST     : [&][rR][eE][sS][tT] ;
KEY      : [&][kK][eE][yY] ;

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

// Cons cell operations
CONS : [cC][oO][nN][sS] ;
CAR : [cC][aA][rR] ;
CDR : [cC][dD][rR] ;

SETF : [sS][eE][tT][fF] ;
WHEN : [wW][hH][eE][nN];
UNLESS : [uU][nN][lL][eE][sS][sS];
CASE : [cC][aA][sS][eE];
OTHERWISE : [oO][tT][hH][eE][rR][wW][iI][sS][eE];
PROGN : [pP][rR][oO][gG][nN];

// Logical operations
AND : [aA][nN][dD] ;
OR : [oO][rR];
NOT : [nN][oO][tT] ;
APPLY : [aA][pP][pP][lL][yY] ;
MAPCAR : [mM][aA][pP][cC][aA][rR] ;

// Control flow
RETURN_FROM : [rR][eE][tT][uU][rR][nN][-][fF][rR][oO][mM] ;
BLOCK : [bB][lL][oO][cC][kK] ;
RETURN : [rR][eE][tT][uU][rR][nN] ;
ERROR : [eE][rR][rR][oO][rR] ;
LOOP : [lL][oO][oO][pP] ;
DO : [dD][oO] ;
DO_STAR : [dD][oO][*] ;

// List operations
LIST     : [lL][iI][sS][tT] ;
PUSH     : [pP][uU][sS][hH] ;
POP      : [pP][oO][pP] ;

// Keywords for special forms
KEYWORD : ':' [a-zA-Z][a-zA-Z0-9-]* ;
SPECIAL_IDENTIFIER : '*' LETTER (LETTER | DIGIT | SPECIAL_CHAR)* '*' ;
TERMINAL : 't' ;

// Atoms and Identifiers
IDENTIFIER : LETTER (ATOM_PART)* ;
fragment ATOM_PART : (LETTER | DIGIT | SPECIAL_CHAR)+ ;
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
COMPLEX : '#' [cC] '(' REAL ' ' REAL ')' ;

// Whitespace and Comments
WS : [ \t\r\n]+ -> skip ;
COMMENT : ';'+ ~[\r\n]* -> skip ;
MULTI_LINE_COMMENT : '#|' .*? '|#' -> skip ;

// Arithmetic and Logical Operators
ADD : '+' ;
SUB : '-' ;
MUL : '*' ;
DIV : '/' ;
// Concatenate
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

// String
STRING_START : '"' -> pushMode(STRING_MODE) ;
ERROR_CHAR : . ;

// Mode for handling FORMAT
mode FORMAT_MODE;

FORMAT_CONTENT
    :(~["~])+   // Matches any content except ~, \, and "
    ;

FORMAT_DIRECTIVE_T : '~' [tT] ;
FORMAT_DIRECTIVE_S : '~' [sS] ;
FORMAT_DIRECTIVE_A : '~' [aA] ;
FORMAT_DIRECTIVE_D : '~' [dD] ;
FORMAT_DIRECTIVE_F : '~' [fF] ;
FORMAT_DIRECTIVE_E : '~' [eE] ;
FORMAT_DIRECTIVE_G : '~' [gG] ;
FORMAT_DIRECTIVE_L : '~' [lL] ;
FORMAT_DIRECTIVE_R : '~' [rR] ;

FORMAT_NEWLINE : '~' '%' ;
FORMATQUATAION:'"';
FORMAT_END : ')' -> popMode ;

FORMAT_ERROR_CHAR : . ;

mode STRING_MODE;

STRING_CONTENT : ~["\\]+ ;  // Match any non-escaped characters inside the string

ESCAPED_CHAR   : '\\' [btnfr"\\] ;  // Single backslash escape sequences (e.g., \n, \t, \", \\)

// Error handling
STRING_ERROR_CHAR : ~['"\\] ;  // Any character that is not valid inside a string

STRING_END     : '"' -> popMode ;  // End of the string, pop the STRING_MODE
