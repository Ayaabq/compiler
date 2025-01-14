(setq x 10)                        ; Set x to 10
(setq y 3)                         ; Set y to 3
(setq z 0)
(defun factorial (n)
    (setq result 1)                ; Start with 1
    (while (> n 0)                 ; Loop until n is 0
        (setq result (* result n)) ; Multiply result by n
        (setq n (- n 1)))          ; Decrease n by 1
    result)

    (print "Factorial of x: ") (factorial x)

