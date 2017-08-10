(ns rosalind.iprb-test
  (:require [clojure.test :refer :all]
            [rosalind.iprb :refer :all]))

(deftest test-iprb []
  (is (= 0.78333
         (iprb 2 2 2))))
