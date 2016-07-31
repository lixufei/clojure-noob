(ns clojure-noob.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]))

  (defn app-routes []
     (get "/" [] "<h1>Hello World</h1>")
     (get "/foo" [] "<h1>Hello foo World</h1>")
     (route/not-found [] "<h1>routs not found</h1>")
        )


;(ns clojure-noob.core
;  (:gen-class))
;
;(defn -main
;  "I don't do a whole lot ... yet."
;  [& args]
;  (println "Hello, World!"))