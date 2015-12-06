(ns luke2.core
  (:require [clojure.string :as string])
  (:gen-class))

(defn prices
  "Fetch id numbers from pastebin."
  []
  (map read-string
       (string/split-lines (slurp "http://pastebin.com/raw.php?i=sJVZp7BH"))))

(defn possible-transactions
  "Calculate all transactions"
  [numbers]
  (map-indexed (fn [index currentPrice]
                 (map (fn [futurePrice]
                        (- futurePrice currentPrice))
                      (drop (inc index) numbers)))
               numbers))

(defn -main
  "Finds the largest possible transaction difference."
  [& args]
  (println (time (apply max (flatten (possible-transactions (prices))))) "best price"))