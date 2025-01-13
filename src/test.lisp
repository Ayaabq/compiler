(setq x 0)                         ; Initialize x to 0
(setq y 10)                        ; Initialize y to 10
(setq z 5)                         ; Initialize z to 5
(setq i 0)
(setq j 0)
(if (> y z)                        ; Conditional: Check if y is greater than z
    (print "y is greater than z")  ; True branch
    (print "y is not greater than z") ; False branch
)

(dotimes (i y)                     ; Loop from i = 0 to i < y (10 times)
  (setq x (+ x 1))                 ; Increment x by 1
  (if (> y x)                     ; Conditional inside the loop
      (print "x is even")          ; True branch
      (print "x is odd")           ; False branch
  )
)

(print x)                          ; Print the final value of x

(dotimes (i 3)                     ; Another loop
  (dotimes (j 2)                   ; Nested loop
    (print (+ i j))                ; Print the sum of i and j
  )
)

(setq w 0)                         ; Initialize w to 0

(while (< w 5)                     ; While loop
  (setq w (+ w 1))                 ; Increment w by 1
  (print w)                        ; Print the current value of w
)
