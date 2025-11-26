(ns filterizer.core
  (:require [ring.adapter.jetty :refer [run-jetty]]
            [filterizer.handlers :as handlers])
  (:gen-class))

(defn -main [& args]
  (let [port (Integer/parseInt (or (System/getenv "PORT") "3000"))]
    (println (str "Starting server on port " port))
    (run-jetty handlers/app {:port port :join? true})))
