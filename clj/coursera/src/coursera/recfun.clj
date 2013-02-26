(ns coursera.recfun)

(defn pascal [c r] 
	(if (or (= 0 c) (= c r)) 1 (+ (pascal (dec c) (dec r)) (pascal c (dec r)))))