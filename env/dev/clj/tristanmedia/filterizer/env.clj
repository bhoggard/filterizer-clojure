(ns tristanmedia.filterizer.env
  (:require
    [clojure.tools.logging :as log]
    [tristanmedia.filterizer.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init       (fn []
                 (log/info "\n-=[tristanmedia.filterizer starting using the development or test profile]=-"))
   :start      (fn []
                 (log/info "\n-=[tristanmedia.filterizer started successfully using the development or test profile]=-"))
   :stop       (fn []
                 (log/info "\n-=[tristanmedia.filterizer has shut down successfully]=-"))
   :middleware wrap-dev
   :opts       {:profile       :dev}})
