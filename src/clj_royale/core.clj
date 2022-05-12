(ns clj-royale.core
  (:gen-class)
  (:use ring.util.response
        ring.adapter.jetty
        ring.middleware.resource))

(defn handler [request]
  (resource-response "public/index.html"))

(defn -main [& args]
  (run-jetty handler {:port 8080}))
