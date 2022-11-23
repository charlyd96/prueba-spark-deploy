package main;

import spark.Spark;
import spark.servlet.SparkApplication;

public class Routes implements SparkApplication {
  public static void main(String[] args) {
    new Routes().init();
  }
  @Override
  public void init() {
    Spark.port(8080);
    Spark.get("/ping", (req, resp) -> "pongaaaaa");
  }

}
