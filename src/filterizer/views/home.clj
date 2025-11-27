(ns filterizer.views.home
  (:require [hiccup2.core :as h]))

(defn layout [& content]
  [:html
   [:head
    [:meta {:charset "UTF-8"}]
    [:meta {:name "viewport" :content "width=device-width, initial-scale=1.0"}]
    [:title "Art Calendar - NYC"]
    [:link {:rel "stylesheet" :href "/css/tailwind.css"}]
    [:script {:src "/js/main.js" :defer true}]]
   [:body content]])

(defn index []
  (str
   (h/html
    {:mode :html}
    (layout
     [:div.min-h-screen.bg-gray-50
      [:header.bg-white.shadow-sm
       [:div.max-w-7xl.mx-auto.px-4.py-6.sm:px-6.lg:px-8
        [:h1.text-3xl.font-bold.text-gray-900 "NYC Art Calendar"]]]
      [:main.max-w-7xl.mx-auto.px-4.py-8.sm:px-6.lg:px-8
       [:div.bg-white.rounded-lg.shadow.p-6
        [:h2.text-2xl.font-semibold.text-gray-800.mb-4 "Current Events"]
        [:p.text-gray-600 "Welcome to the NYC Art Calendar. Events will be displayed here."]]]]))))
