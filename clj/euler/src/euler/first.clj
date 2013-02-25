(ns euler.first)

(defn criteria [a] (or (= 0 (mod a 3)) (= 0 (mod a 5))))

(defn solve [n] (reduce (fn [a b] (+ a b)) (filter criteria (range 1 n))))