


public class Main {
    static CocheCRUD cocheCRUD= new CocheCRUDlmpl();

    public static void main(String[] args) {
        cocheCRUD.save(new Coche());
        cocheCRUD.findAll();
        cocheCRUD.delete(new Coche());


    }
}