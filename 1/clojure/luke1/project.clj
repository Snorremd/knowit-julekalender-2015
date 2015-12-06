(defproject luke1 "1.0.0-SNAPSHOT"
  :description "Solution to luke 1 in Knowit's 2015 julekalender"
  :license {:name "MIT"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :main ^:skip-aot luke1.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
