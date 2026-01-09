(ns tristanmedia.filterizer.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init       (fn []
                 (log/info "\n-=[tristanmedia.filterizer starting]=-"))
   :start      (fn []
                 (log/info "\n-=[tristanmedia.filterizer started successfully]=-"))
   :stop       (fn []
                 (log/info "\n-=[tristanmedia.filterizer has shut down successfully]=-"))
   :middleware (fn [handler _] handler)
   :opts       {:profile :prod}})
