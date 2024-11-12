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

(define (factorial n)
  (if (= n 0)
      1
      (* n (factorial (- n 1)))))

(define (main)
  (display "Factorial of 5 is: ")
  (display (factorial 5))
  (newline))

(main)
