package main;

import infraestructura.Prueba;
import infraestructura.PruebaRepositorio;
import infraestructura.servicio;
import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import org.uqbarproject.jpa.java8.extras.transaction.TransactionalOps;
import spark.Spark;

public class main {
  public static void main(String[] args) {
    servicio servicio = new servicio();
    String port = System.getenv("SERVER_PORT");
    int intPort =  port != null && !port.equals("") ? Integer.parseInt(port) : 4567;
    Spark.port(intPort);
    Spark.get("/ping", (req, resp) -> "Hola estoy respondiendo el ping");
    Spark.get("/ponga", (req, resp) -> "ping");
    Spark.get("/crear", (req, resp) -> {
      servicio.crear();
      return "Creación OK";
    });
    Spark.init();
  }
}
