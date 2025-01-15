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
