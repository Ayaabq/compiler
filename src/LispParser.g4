parser grammar LispParser;

options { tokenVocab = LispLexer; }

// Entry rule
lisp_       : expression+ EOF;

// Expressions can be a function, variable declaration, conditional, loop, call, or atom
expression  : function
            | variableDeclaration
            | conditional
            | loop
            | call;
            // | atom;

// Rule for function definitions: (defun funcName (param1 param2 ...) body)
function    : LPAREN DEFUN ID LPAREN ID* RPAREN expression RPAREN;

// Variable declarations: (defvar varName value) or (setq varName value)
variableDeclaration
            : LPAREN (DEFVAR | SETQ) ID expression RPAREN;

// Conditionals: (if condition trueExpr falseExpr) or (cond (clause1) (clause2) ...)
conditional : LPAREN IF expression expression (expression)? RPAREN
            | LPAREN COND LPAREN condClause+ RPAREN RPAREN;

condClause  : LPAREN expression expression RPAREN;

// Loops: (dotimes (var count) body) and (dolist (var list) body)
loop        : LPAREN DOTIMES LPAREN ID expression RPAREN expression RPAREN
            | LPAREN DOLIST LPAREN ID expression RPAREN expression RPAREN;

// Function calls: (functionName arg1 arg2 ...)
call        : LPAREN ID expression* RPAREN;

// Atomic symbols: number, boolean constants, or identifiers
// atom        : NUMBER
//             | TRUE
//             | FALSE
//             | ID
//             | STRING;

// Arithmetic and logical expressions
arithmetic  : LPAREN (ADD | SUB | MUL | DIV) expression+ RPAREN;
logical     : LPAREN (AND | OR | NOT) expression+ RPAREN;
