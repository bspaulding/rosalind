(ns rosalind.dna-to-rna)

(defn transcribe [s]
  (case s
    \T \U
    s))

(defn dna-to-rna [dna]
  (apply str (map transcribe dna)))
