public class Main {

    public static void main(String[] args) {
        Client client = new Client(26, "Luis", "920865788");
        client.setCredito("1000");
        client.mostrarDatosClient();

        Worker worker = new Worker(34, "Juanito", "912371237137");
        worker.setSalary("2000");
        worker.mostrarDatosWorker();
    }
}




class Person {
    private Integer edad;
    private String nombre;
    private String telefono;

    public Person(Integer edad,
                  String nombre,
                  String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
}

class Client extends Person {
    private String credito;

    //constructor
    public Client(Integer edad,
                  String nombre,
                  String telefono) {
        super(edad, nombre, telefono);

    }

    public void setCredito(String credito) {
        this.credito = credito;
    }

    public String getCredito() {
        return credito;
    }

    public void mostrarDatosClient() {
        System.out.println(" Nombre Cliente: " + getNombre() + " Edad: " + getEdad() + " Telefono:" + getTelefono());
    }

}


class Worker extends Person {
    private String salary;

    //constructor
    public Worker(Integer edad,
                  String nombre,
                  String telefono) {
        super(edad, nombre, telefono);

    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getSalary() {
        return salary;
    }

    public void mostrarDatosWorker() {
        System.out.println(" Nombre Trabajador: " + getNombre() + " Edad: " + getEdad() + " Telefono:" + getTelefono());
    }

}
