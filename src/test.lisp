
(setq x 5) ; Define a variable x with value 5
(setq y 10) ; Define a variable y with value 10
(setq z 0) ; Define a variable z to store the result

; Function definition (no recursion)
(defun add-and-multiply (a b)
    (print "Adding and multiplying:")
    (print "a: ") (print a)
    (print "b: ") (print b)
    (print "Sum: ") (print (+ a b))
    (print "Product: ") (print (* a b))
    (* a b)) ; Return the product
    (print "Result of add-and-multiply:")
(print (add-and-multiply x y))
; If condition
(if (< x y)
    (print "x is less than y")
    (print "x is not less than y"))

; Case statement
(case x
    (1 (print "x is one"))
    (5 (print "x is five")) ; Matches this case
    (otherwise (print "x is something else")))

; Dotimes loop
(dotimes (i 3) ; Loop 3 times
    (print "Dotimes iteration:")
    (print i))

    ; While loop
    (while (< z 5) ; Continue while z is less than 5
        (setq z (+ z 1)) ; Increment z
        (print "While loop, z is now:")
        (print z))

    ; Print statement with escaped characters
    (print "This is a string with escaped characters: \\t \\n \\\" \\'")


; Call the function

; Call the custom function and print the result



  (print (format t "Sum: ~d, Product: ~d" x y))