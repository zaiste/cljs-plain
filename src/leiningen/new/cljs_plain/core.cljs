(ns {{name}}.core)

(enable-console-print!)

(defn on-click []
  (js/alert "Hello, World!"))

(.addEventListener (.getElementById js/document "button")
                   "click" on-click)
