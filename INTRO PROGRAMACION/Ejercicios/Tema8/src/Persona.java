public class Persona {
    private  Integer edad;
    private String nombre;
    private  String telefono;
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(22);
        persona.setNombre("Luis");
        persona.setTelefono("920864637");

        System.out.println( "Edad: " + persona.getEdad());
        System.out.println( "Nombre: " + persona.getNombre());
        System.out.println( "Teléfono: " + persona.getTelefono());

    }

    // Create getters

    public Integer getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    // create Setters


    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}