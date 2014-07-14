(defproject compilercheck "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [prismatic/schema "0.2.4"]
                 [org.clojure/clojurescript "0.0-2268"]]
  :plugins [[lein-cljsbuild "1.0.3"]]
  :cljsbuild {:builds {:demo {:source-paths ["src"]
                              :compiler {:output-to "target/demo.cljs"
                                         :output-dir "target"
                                         :optimizations :advanced}}}})
