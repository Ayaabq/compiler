#||(defvar *greeting* "Hello") ; Global variable

(defun greet ()
  (let ((name "Alice")) ; Local variable
    (format t "~a, ~a!~%" *greeting* name))) ; Outputs "Hello, Alice!"

(defun custom-greet (new-greeting)
  (let* ((old-greeting *greeting*)
         (*greeting* new-greeting)) ; Temporarily change the global var in this scope
    (greet) ; Uses the modified value of *greeting*
    (setq *greeting* old-greeting))) ; Restore original value

(greet) ; Prints "Hello, Alice!"
(custom-greet "Hi") ; Prints "Hi, Alice!", then reverts *greeting* back
||#
; (+ 5 (- 2 6)

; A simple Lisp program to test your compiler
; Simple LISP code with different number types
(define x 42)                ; INTEGER
(define pi 3.14159)          ; REAL
(define half 1/2)            ; RATIONAL
(define z #c(1.0 2.0))       ; COMPLEX

; Printing the values
(display x)                  ; Output: 42
(display pi)                 ; Output: 3.14159
(display half)               ; Output: 1/2
(display z)                  ; Output: #c(1.0 2.0)

(cons (cons 4 5) 6)
(car (cons 4 5))