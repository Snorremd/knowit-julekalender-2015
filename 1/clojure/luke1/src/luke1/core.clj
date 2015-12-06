(ns luke1.core
  (:require [clojure.string :as string])
  (:gen-class))


(defn ids
  "Fetch id numbers from pastebin."
  []
  (string/split-lines (slurp "http://pastebin.com/raw.php?i=F8z0JWqa")))

(defn valid-id
  "Returns boolean true if id is valid, false if not."
  [id]
  (re-matches #"[a-z]{0,3}[0-9]{2,8}[A-Z]{3,}" id))


(defn -main
  "I count the number of valid ids."
  [& args]
  (println (count (filter valid-id (ids))) " valid ids."))
