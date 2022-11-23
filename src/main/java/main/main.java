package main;

import spark.Spark;

public class main {
  public static void main(String[] args) {
    Spark.port(8081);
    Spark.get("/ping", (req, resp) -> "pongaaaaa");
    Spark.init();
  }
}
