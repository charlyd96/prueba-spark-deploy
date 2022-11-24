package infraestructura;

import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import org.uqbarproject.jpa.java8.extras.transaction.TransactionalOps;

import javax.persistence.*;

@Entity
@Table(name = "prueba")
public class Prueba {
  @Id
  @GeneratedValue
  public Integer id;
  @Column
  public String nombre;
  @Column
  public String apellido;

  public Prueba(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
  }
}
