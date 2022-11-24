package infraestructura;

public class servicio {
  PruebaRepositorio repo = new PruebaRepositorio(Prueba.class);
  public void crear() {

      repo.agregar(new Prueba("Carlos", "Desiderio"));

  }
}
