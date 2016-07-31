(defproject clojure-noob "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [compojure "1.1.5"]
                 [ring/ring-core "1.2.0"]]
  :plugins [[lein-ring "0.9.1"]
            [lein-rpm "0.0.5"]]
  :ring {:handler clojure-noob.core/app-routes}
  :profiles {:uberjar {:aot :all}})


