load("@rules_java//java:defs.bzl", "java_binary", "java_library")

package(default_visibility = ["//visibility:public"])

java_binary(
  name = 'Guice',
  main_class = "main.java.com.example.guice.GuiceApp",
   runtime_deps = [":java-guice-lib"],
)

java_library(
    name = "java-guice-lib",
    srcs = glob([
        "src/main/java/com/example/guice/*.java",
    ]),
    deps = [
        "@maven//:com_google_inject_guice",
        "@maven//:javax_inject_javax_inject",
    ]
)