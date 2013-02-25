(ns euler.first-test
  (:use clojure.test
        euler.first))

(deftest firsttest
  (testing "First test"
    (is (= 23 (solve 10)))))
