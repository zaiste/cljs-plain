(ns leiningen.new.cljs-plain
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]))

(def render (renderer "cljs-plain"))

(defn cljs-plain [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (->files data
      ["project.clj" (render "project.clj" data)]
      ["src/cljs/{{sanitized}}/core.cljs" (render "core.cljs" data)]
      ["resources/public/index.html" (render "index.html" data)]
      [".gitignore" (render "gitignore" data)])))
