package infraestructura;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public abstract class Repositorio<T> {

  private Class<T> type;

  public Repositorio(Class<T> type) {
  this.type = type;
  }

  public void agregar(Object unObjeto) {
    EntityManagerHelper.beginTransaction();
    EntityManagerHelper.entityManager().persist(unObjeto);
    EntityManagerHelper.entityManager().flush();
    EntityManagerHelper.commit();
  }

  public void modificar(Object unObjeto) {
    EntityManagerHelper.entityManager().persist(unObjeto);
    EntityManagerHelper.entityManager().flush();
  }

  public void eliminar(Object unObjeto) {
    EntityManagerHelper.entityManager().remove(unObjeto);
    EntityManagerHelper.entityManager().flush();
  }

  public List<T> buscarTodos() {
    CriteriaBuilder builder = EntityManagerHelper.entityManager().getCriteriaBuilder();
    CriteriaQuery<T> critera = builder.createQuery(type);
    critera.from(type);
    List<T> entities =  EntityManagerHelper.entityManager().createQuery(critera).getResultList();
    return entities;
  }

  public T buscar(int id) {
    return  EntityManagerHelper.entityManager().find(type, (long) id);
  }

}
