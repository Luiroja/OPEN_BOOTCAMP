
import java.util.List;

/**
 * Se declaran los métodos no se implementan
 * Actúa como un contrato, dice lo que hay que hacer pero no lo hace
 */
public interface CocheCRUD {
 void save(Coche coche);
 List<Coche> findAll();
 void delete(Coche coche);
}
