/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio11;

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Por favor ingrese 10 números:");
            System.out.print("Número 1: ");
            double primerNumero = teclado.nextDouble();
            
            double mayor = primerNumero;
            double menor = primerNumero;
            
            for (int i = 2; i <= 10; i++) {
                System.out.print("Número " + i + ": ");
                double numeroActual = teclado.nextDouble();
                
                if (numeroActual > mayor) {
                    mayor = numeroActual;
                }
                if (numeroActual < menor) {
                    menor = numeroActual;
                }
            }
            
            System.out.println("\n--- ANÁLISIS DE EXTREMOS ---");
            System.out.println("El número mayor es: " + mayor);
            System.out.println("El número menor es: " + menor);
        }
    }
}