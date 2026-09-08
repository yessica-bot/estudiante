import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);

        System.out.println("Ingrese nombre: ");
        String nombre = scaner.nextLine();

        System.out.println("Ingrese carrera: ");
        String carrera = scaner.nextLine();

        System.out.println("Ingrese edad: ");
        int edad = scaner.nextInt();

        Estudiante estudiante = new Estudiante(
                nombre,carrera,edad);


        estudiante.mostrarInformacion();

        if (edad >= 18){
            System.out.println("Autorizado.");
        }
        else{
            System.out.println("Denegado.");
        }

        scaner.close();
    }
}
