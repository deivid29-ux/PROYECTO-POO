public class Persona {

    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;
    private String nacionalidad;
    private String funcionUniversidad;
   

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getFuncionUniversidad() {
        return funcionUniversidad;
    }

     public Persona(String cedula, String nombre, String apellido,
                   int edad, String nacionalidad, String funcionUniversidad) {

        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.funcionUniversidad = funcionUniversidad;
    }

    public void mostrarDatos() {

        System.out.println("Cedula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Funcion en la universidad: " + funcionUniversidad);
    }
}