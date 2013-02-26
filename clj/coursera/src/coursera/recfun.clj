(ns coursera.recfun)

(defn pascal [c r] 
	(if (or (zero? c) (= c r)) 1 (+ (pascal (dec c) (dec r)) (pascal c (dec r)))))

; need to balance parentheses in sublime 
(def lb \()
(def rb \))

(defn balance? [s] 
	(let [parentheses 
		(fn [st count] 
			(cond
				(not (seq st)) count
				(= -1 count) -1
				(= lb (first st)) (recur (rest st) (inc count)) 
				(= rb (first st)) (recur (rest st) (dec count))
				:else (recur (rest st) count)
				))]
		(= 0 (parentheses s 0))))


(defn count-change [money coins] 
	(cond 
		(= 0 money) 1
		(or (neg? money) (not (seq coins))) 0
		:else (+ (count-change (- money (first coins)) coins) (count-change money (rest coins)))))
