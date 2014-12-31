(ns myapp.test.handler
  (:use clojure.test
        ring.mock.request
        myapp.handler))

(deftest test-app
  (testing "main route"
    (let [response (handler (request :get "/"))]
      (is (= (:status response) 200))
      (is (= (:body response) "Hello World"))))

  (testing "not-found route"
    (let [response (handler (request :get "/invalid"))]
      (is (= (:status response) 404)))))
