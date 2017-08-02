(ns rosalind.dna)

(defn reducer [counts c]
  (case c
    \A (assoc counts :A (+ 1 (:A counts)))
    \C (assoc counts :C (+ 1 (:C counts)))
    \G (assoc counts :G (+ 1 (:G counts)))
    \T (assoc counts :T (+ 1 (:T counts)))
    counts))

(def init-counts {:A 0 :C 0 :G 0 :T 0})
(defn count-nucleotides [s]
  (let [counts (reduce reducer init-counts s)]
    [(:A counts) (:C counts) (:G counts) (:T counts)]))

