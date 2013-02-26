(ns euler.second-test
  (:use clojure.test
        euler.second))

(deftest firsttest
  (testing "First five fib numbers"
    (is (= '(1 1 2 3 5) (take 5 fibs))))
  (testing "Even number"
  	(is (even? 2))
  	(is (even? 4))
  	(is (not (even? 3)))))
