import java.util.Scanner;

public class Deber {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        String nombre = teclado.nextLine();
        
        System.out.print("Ingrese su edad: ");
        int edad = teclado.nextInt();
        teclado.nextLine(); // Limpiar el buffer
        
        System.out.print("Ingrese su carrera: ");
        String carrera = teclado.nextLine();
        
        System.out.print("Ingrese su estatura (ej: 1.75): ");
        double estatura = teclado.nextDouble();
        
        System.out.println("\n--- DATOS REGISTRADOS ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Carrera: " + carrera);
        System.out.println("Estatura: " + estatura + " m");
        
        teclado.close();
    }
}