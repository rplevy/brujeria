(ns brujeria.core
  (:require [clojure.edn :as edn]
            [clojure.math.combinatorics :refer [cartesian-product]]))

(defn -main [pattern-file]
  (let [guess-groups (edn/read-string (slurp pattern-file))]
    (doseq [variable-segments guess-groups
            phrase-seq (apply cartesian-product variable-segments)]
      (println (apply str phrase-seq)))))
