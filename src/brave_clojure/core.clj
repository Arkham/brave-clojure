(ns brave-clojure.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "# Forms")
  (println "I'm a number!" 10)
  (println "I'm a string!" "Hello there")
  (println "I'm an array!" ["Goodbye" "Cruel" "World"])
  (println "I'm an expression!" (+ 2 3 4))
  (println "I'm concatenating strings!" (str "It was a panda " "in the library " "stealing books."))
  (println)
  (println "# Control Flow")
  (println "I'm a IF condition!", (if true "true" "false"))
  (println "a do grouping", (if true (do (print "I am ") "Dada") (do (print "I am not ") "Nana")))
  (println "the when operator", (when true (print "I am using ") "oh yeah"))
  (def failed-protagonist-names
    ["Larry Potter",
     "Doreen the Explorer",
     "The Incredible Bulk"])
  (println "I'm a def example!", failed-protagonist-names)
  (println)
  (println "# Data structures")
  (println "Is nil nil?", (nil? nil))
  (println "Is 1 nil?", (nil? 1))

)
