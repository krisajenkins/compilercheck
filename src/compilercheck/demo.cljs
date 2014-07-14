(ns compilercheck.demo
  (:require-macros [schema.macros :as sm])
  (:require [schema.core :as s]))

(defn twice
  [x]
  (* x 2))
