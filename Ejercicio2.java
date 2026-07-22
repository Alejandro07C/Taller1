/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Ingrese el primer número entero: ");
            int num1 = teclado.nextInt();
            
            System.out.print("Ingrese el segundo número entero: ");
            int num2 = teclado.nextInt();
            
            int suma = num1 + num2;
            int resta = num1 - num2;
            int multiplicacion = num1 * num2;
            
            System.out.println("\n--- RESULTADOS ---");
            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Multiplicación: " + multiplicacion);
            
            if (num2 != 0) {
                double division = (double) num1 / num2;
                int residuo = num1 % num2;
                System.out.println("División: " + division);
                System.out.println("Residuo: " + residuo);
            } else {
                System.out.println("División: No permitida (división por cero)");
                System.out.println("Residuo: No disponible (división por cero)");
            }
        }
    }
}