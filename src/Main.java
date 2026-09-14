
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcion = -1; // variable de control

        while (opcion != 0) {
            System.out.println("***** Sistema Estudiante *****");
            System.out.println("1. Mostrar estado");
            System.out.println("2. Procesar estudiante");
            System.out.println("0. Salir");

            System.out.print("Seleccionar una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar salto de línea

            if (opcion == 1) {
                System.out.println("Ingrese nombre: ");
                String nombre = scanner.nextLine();

                System.out.println("Ingrese carrera: ");
                String carrera = scanner.nextLine();

                System.out.println("Ingrese edad: ");
                int edad = scanner.nextInt();
                scanner.nextLine(); // limpiar salto de línea

                Estudiante estudiante = new Estudiante(nombre, carrera, edad);
                estudiante.mostrarInformacion();

                if (edad < 18) {
                    System.out.println("Usted es menor de edad.");
                } else if (edad < 30) {
                    System.out.println("Estudiante lolo");
                } else {
                    System.out.println("Estudiante avanzado");
                }

            } else if (opcion == 2) {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Procesando estudiante " + i);
                }

            } else if (opcion == 0) {
                System.out.println("Cerrando sistema...");

            } else {
                System.out.println("Opcion no válida, intente de nuevo.");
            }
        }

        scanner.close();
    }
}


