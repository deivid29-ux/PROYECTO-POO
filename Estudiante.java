import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Estudiante extends Persona {

    private LocalDateTime horaIngreso;
    private LocalDateTime horaSalida;

    public Estudiante(String cedula, String nombre, String apellido,
                      int edad, String nacionalidad,
                      String funcionUniversidad) {

        super(cedula, nombre, apellido, edad, nacionalidad, funcionUniversidad);

        horaIngreso = LocalDateTime.now();
    }

    public void registrarSalida() {
        horaSalida = LocalDateTime.now();
    }
    @Override
    public void mostrarDatos() {

        DateTimeFormatter formato =
                DateTimeFormatter.ofPattern("HH:mm");

        super.mostrarDatos();

        System.out.println("Hora de ingreso: " + horaIngreso.format(formato));

        if (horaSalida != null) {

            System.out.println("Hora de salida: " + horaSalida.format(formato));

        } else {

            System.out.println("Aun no registra salida");
        }
    }
}