(ns myapp.handler
  (:use ring.adapter.jetty))

(defn init []
  (println "myapp is starting"))

(defn destroy []
  (println "myapp is shutting down"))

(defn handler [req]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    "Hello World from Ring"})

(defn boot []
  (run-jetty #'handler {:port 3000}))

  