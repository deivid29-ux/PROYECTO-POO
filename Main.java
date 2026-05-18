import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Estudiante> lista = new ArrayList<>();

        int opcion;

        do {

            System.out.println("\n OPCIONS:");
            System.out.println("1. Registrar ingreso");
            System.out.println("2. Registrar salida");
            System.out.println("3. Mostrar datos");
            System.out.println("4. Salir");

            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

                if(opcion == 1){

                    System.out.println("Ingrese  su cedula: ");
                    String cedula = sc.nextLine();

                    System.out.println("Ingrese sus nombres: ");
                    String nombre = sc.nextLine();

                    System.out.println("Ingrese sus apellidos: ");
                    String apellido = sc.nextLine();

                    System.out.println("Ingrese su edad: ");
                    int edad = sc.nextInt();

                    sc.nextLine();

                    System.out.println("Ingrese su nacionalidad: ");
                    String nacionalidad = sc.nextLine();

                    System.out.println("Su funcion en la universidad: ");
                    String funcion = sc.nextLine();

                    Estudiante estudiante = new Estudiante(
                            cedula,
                            nombre,
                            apellido,
                            edad,
                            nacionalidad,
                            funcion
                    );

                    lista.add(estudiante);

                    System.out.println("\nINGRESO REGISTRADO");

                    estudiante.mostrarDatos();

                }
                
                else if(opcion ==2){

                    System.out.println("Ingrese cedula: ");
                    String cedulaSalida = sc.nextLine();

                    boolean encontrado= false;

                    for(Estudiante e :lista){

                        if(e.getCedula().equals(cedulaSalida)){

                            e.registrarSalida();

                            System.out.println("\nSALIDA REGISTRADA");

                            e.mostrarDatos();

                            encontrado = true;
                        }
                    } if(!encontrado){

                        System.out.println("Estudiante no encontrado");
                    }

                } 
                
                else if(opcion ==3){
                
                    if (lista.isEmpty()) {

                        System.out.println("No existen registros");

                    } else {

                        for (Estudiante e : lista) {

                            System.out.println("\n-------------------");

                            e.mostrarDatos();
                        }
                    }

             } 

             else if(opcion ==4){

                    System.out.println("Sistema finalizado");

                } else {

                    System.out.println("Opcion incorrecta");
                }

        } while (opcion != 4);

        sc.close();
    }
}

