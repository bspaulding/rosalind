(ns rosalind.fib)

(defn fib [n k]
  (cond
    (<= n 0) 0
    (<= n 2) 1
    :else (+ (fib (- n 1) k) (* k (fib (- n 2) k)))))
