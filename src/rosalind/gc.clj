(ns rosalind.gc
  (:require [clojure.string :refer [split trim]]))

(defn parse-chunk [chunk]
  (let [lines (split chunk #"\n")
        id (first lines)
        strand (apply str (map trim (drop 1 lines)))]
  {:id id :strand strand}))

(defn parse [data]
  (let [raw-chunks (drop 1 (split data #">"))
        entries (map parse-chunk raw-chunks)]
    entries))
(defn is-gc [c]
  (or (= \C c) (= \G c)))

(defn gc [strand]
  (let [cgs (filter is-gc strand)]
    (/ (count cgs) (count strand))))

(defn add-gc [entry]
  (assoc entry :gc (gc (:strand entry))))

(defn highest [data]
  (let [entries (map add-gc (parse data))
        high (first (sort-by :gc > entries))]
    (str (:id high) "\n" (format "%.6f" (float (* 100 (:gc high)))))))
