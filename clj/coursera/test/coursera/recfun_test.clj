(ns coursera.recfun-test
  (:use clojure.test
        coursera.recfun))

(deftest pascal-test
  (testing "col=0, row=2"
    (is (= 1 (pascal 0 2))))
  (testing "col=1, row=2"
    (is (= 2 (pascal 1 2))))
  (testing "col=1, row=3"
    (is (= 3 (pascal 1 3))))
  (testing "col=2, row=4"
    (is (= 6 (pascal 2 4)))))

(deftest balance-test
	(testing "'(if (zero? x) max (/ 1 x))' is balanced."
		(is (balance? "(if (zero? x) max (/ 1 x))")))
	(testing "'I told him ...' is balanced."
		(is (balance? "I told him (that it's not (yet) done).\n(But he wasn't listening)")))
	(testing "':-)' is unbalanced."
		(is (not (balance? ":-)"))))
	(testing "Counting is not enough"
		(is (not (balance? "())(")))))

(deftest count-change-test
	(testing "manual"
		(is (= 3 (count-change 4 '(1 2)))))
	(testing "sorted CHF"
		(is (= 1022 (count-change 300 '(5 10 20 50 100 200 500)))))
	(testing "no pennies"
		(is (= 0 (count-change 301 '(5 10 20 50 100 200 500)))))
	(testing "unsorted CHF"
		(is (= 1022 (count-change 300 '(500 5 50 100 20 200 10))))))