(ns coursera.recfun)

(defn pascal [c r] 
	(if (or (zero? c) (= c r)) 1 (+ (pascal (dec c) (dec r)) (pascal c (dec r)))))

; need to balance parentheses in sublime 
(def lb \()
(def rb \))

(defn balance? [s] 
	(let [p (loop [s s count 0] 
				(cond
					(not (seq s)) count
					(= -1 count) -1
					(= lb (first s)) (recur (rest s) (inc count)) 
					(= rb (first s)) (recur (rest s) (dec count))
					:else (recur (rest s) count)
				))] 
		(= 0 p)))

(defn count-change [money coins] 
	(cond 
		(= 0 money) 1
		(or (neg? money) (not (seq coins))) 0
		:else (+ (count-change (- money (first coins)) coins) (count-change money (rest coins)))))
