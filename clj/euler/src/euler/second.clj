(ns euler.second)

(defn gen-fibs [a b] (cons a (lazy-seq (gen-fibs b (+ a b)))))

(def fibs (gen-fibs 1 1))

(defn even? [x] (= 0 (mod x 2)))

(defn solve [] (reduce + (take-while (fn [x] (< x 4000000)) (filter even? fibs))))