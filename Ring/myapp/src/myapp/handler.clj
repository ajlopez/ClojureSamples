(ns myapp.handler
  (:use ring.adapter.jetty)
  (:use ring.middleware.reload))

(defn init []
  (println "myapp is starting"))

(defn destroy []
  (println "myapp is shutting down"))

(defn handler [req]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    "Hello World from Ring"})

(def app 
    (wrap-reload handler))

(defn boot []
  (run-jetty #'app {:port 3000 :join? false}))

  