(ns rosalind.revc)

(defn complement [x]
  (case x
    \A \T
    \T \A
    \C \G
    \G \C))

(defn revc [xs]
  (apply str (reduce #(conj %1 (complement %2)) '() xs)))
