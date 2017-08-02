(ns rosalind.hamm
  (:require [clojure.string :refer [split]]))

(defn hamming [a b]
  (let [zipped (map vector a b)]
    (reduce #(if (apply = %2) %1 (+ 1 %1)) 0 zipped)))

(defn hamm [raw]
  (let [[a b] (split raw #"\n")]
    (hamming a b)))
