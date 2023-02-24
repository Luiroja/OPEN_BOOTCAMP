import java.util.List;

public class CocheCRUDlmpl implements CocheCRUD{

    @Override
    public void save(Coche coche) {
        System.out.println("save method");
    }

    @Override
    public List<Coche> findAll() {

        System.out.println("finAll method");
        return null;
    }

    @Override
    public void delete(Coche coche) {
        System.out.println("delete method");
    }
}
