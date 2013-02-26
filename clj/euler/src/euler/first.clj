(ns euler.first)

(defn criteria [a] (or (zero? (mod a 3)) (zero? (mod a 5))))

(defn solve [n] (reduce (fn [a b] (+ a b)) (filter criteria (range 1 n))))