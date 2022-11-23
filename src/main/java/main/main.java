package main;

import spark.Spark;
import spark.servlet.SparkApplication;

public class main implements SparkApplication {
  public static void main(String[] args) {
    new main().init();
  }

  @Override
  public void init() {
    //Spark.port(8081);
    Spark.get("/", (req, resp) -> "home");
    Spark.get("/ping", (req, resp) -> "pongaaaaa");
    Spark.init();
  }
}
