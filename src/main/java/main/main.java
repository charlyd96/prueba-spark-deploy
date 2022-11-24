package main;

import spark.Spark;

public class main {
  public static void main(String[] args) {
    //System.getenv().forEach((k,v) -> System.out.println("KEY: "+ k +  " - VALUE: " + v));
    String port = System.getenv("SERVER_PORT");
    Spark.port(Integer.parseInt(port));
    Spark.get("/ping", (req, resp) -> "Hola estoy respondiendo el ping");
    Spark.get("/ponga", (req, resp) -> "ping");
    Spark.init();
  }
}
