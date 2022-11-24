package infraestructura;

import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import org.uqbarproject.jpa.java8.extras.transaction.TransactionalOps;

public class servicio implements WithGlobalEntityManager, TransactionalOps {
  PruebaRepositorio repo = new PruebaRepositorio(Prueba.class);
  public void crear() {
    withTransaction(() -> {
      repo.agregar(new Prueba("Carlos", "Desiderio"));
    });
  }
}
