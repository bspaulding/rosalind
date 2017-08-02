(ns rosalind.fib-test
  (:require [clojure.test :refer :all]
            [rosalind.fib :refer :all]))

(deftest test-fib []
  (is (= 19
         (fib 5 3)))
  (is (= 178956971
         (fib 29 2))))

