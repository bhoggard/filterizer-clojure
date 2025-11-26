(ns filterizer.handlers
  (:require [reitit.ring :as ring]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [filterizer.views.home :as home]))

(def routes
  [["/" {:get {:handler (fn [_] {:status 200
                                   :headers {"Content-Type" "text/html; charset=utf-8"}
                                   :body (home/index)})}}]])

(def app
  (ring/ring-handler
   (ring/router routes)
   (ring/routes
    (ring/create-resource-handler {:path "/"})
    (ring/create-default-handler
     {:not-found (constantly {:status 404 :body "Not Found"})}))
   {:middleware [[wrap-defaults site-defaults]]}))
