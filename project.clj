(defproject spamscope "1.4.5-SNAPSHOT"
  :resource-paths ["_resources"]
  :target-path "_build"
  :min-lein-version "2.0.0"
  :jvm-opts ["-client"]
  :dependencies  [[org.apache.storm/storm-core "1.0.3"]
                  [org.apache.storm/flux-core "1.0.3"]]
  :jar-exclusions     [#"log4j\.properties" #"org\.apache\.storm\.(?!flux)" #"trident" #"META-INF" #"meta-inf" #"\.yaml"]
  :uberjar-exclusions [#"log4j\.properties" #"org\.apache\.storm\.(?!flux)" #"trident" #"META-INF" #"meta-inf" #"\.yaml"]
  )
