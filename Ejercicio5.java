/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Ingrese la calificación (0 a 10): ");
            double calificacion = teclado.nextDouble();
            
            if (calificacion < 0 || calificacion > 10) {
                System.out.println("Calificación inválida. Fuera del rango de 0 a 10.");
            } else if (calificacion >= 9.0) {
                System.out.println("Excelente");
            } else if (calificacion >= 8.0) {
                System.out.println("Muy Bueno");
            } else if (calificacion >= 7.0) {
                System.out.println("Bueno");
            } else if (calificacion >= 5.0) {
                System.out.println("Regular");
            } else {
                System.out.println("Deficiente");
            }
        }
    }
}
