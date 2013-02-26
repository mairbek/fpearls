(ns coursera.recfun)

(defn pascal [c r] 
	(if (or (= 0 c) (= c r)) 1 (+ (pascal (dec c) (dec r)) (pascal c (dec r)))))

(def lb \()
(def rb \))

(defn balance? [s] 
	(let [parenthes 
		(fn [st count] 
			(cond
				(not (seq st)) count
				(= -1 count) -1
				(= lb (first st)) (recur (rest st) (inc count)) 
				(= rb (first st)) (recur (rest st) (dec count))
				:else (recur (rest st) count)
				))]
		(= 0 (parenthes s 0))))

