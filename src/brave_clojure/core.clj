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
  (println "I'm a IF condition!" (if true "true" "false"))
  (println "a do grouping" (if true (do (print "I am ") "Dada") (do (print "I am not ") "Nana")))
  (println "the when operator" (when true (print "I am using ") "oh yeah"))
  (def failed-protagonist-names
    ["Larry Potter",
     "Doreen the Explorer",
     "The Incredible Bulk"])
  (println "I'm a def example!" failed-protagonist-names)
  (println)

  (println "# Data structures")
  (println "Is nil nil?" (nil? nil))
  (println "Is 1 nil?" (nil? 1))
  (println "Is nil = nil?" (= nil nil))
  (println "Is 1 = 1?" (= 1 1))
  (println "Is 1 = 2?" (= 1 2))
  (println "Here are some numbers" [1 1.345 2/5])
  (println "Here are some strings" ["Hello World" "'Lord Voldemort' is his name" "\"Escapin'\" is fun"])
  (def str-interpol "String Interpolation")
  (println "Unfortunately" (str "No " str-interpol))
  (println)

  (println "# Maps")
  (println "Here, take this map" {})
  (println "Okay, here's a useful one" {:a 1 :b "boring example" :c []})
  (println "Strings can be keys too.." {"imma-string" 1337})
  (println "And functions can be values.." {:orly +})
  (println "Maps can be nested!" {:first {:second {:third "secret"}}})
  (println "Are you getting this?" (get {:a "No" :b "Yes"} :b))
  (println "Are you getting this?" (get {:a "No" :b {:mmm "Yes"}} :b))
  (println "Did you find it?" (get {:a 0 :b 1} :c))
  (println "By default?" (get {:a 0 :b 1} :c "Yup"))
  (println "We need to go deeper" (get-in {:a "No" :b {:c "We need to go deeper"}} [:b :c]))
  (println)

  (println "# Keywords")
  (println "Lookin' up" (:a {:a "Yo" :b "No"}))
  (println "Lookin' up with a default" (:c {:a "Yo" :b "No"} "Unicorns"))
  (println "Hash mapping all the way" (hash-map :a "hello" :b "world"))
  (println)

  (println "# Vectors")
  (println "Here's a vector" [1 2 3])
  (println "The number of the Beast.." (get [1 2 3 5 666] 4))
  (println "Vectors don't discriminate" (get ["one" 2 :three {:four "five"}] 3))
)
