(ns myapp.handler
  (:use ring.adapter.jetty))

(defn init []
  (println "myapp is starting"))

(defn destroy []
  (println "myapp is shutting down"))

(defn app [req]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    "Hello World from Ring"})

(defn boot []
  (run-jetty #'app {:port 3000}))

  