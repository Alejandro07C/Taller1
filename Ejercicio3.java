/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Ingrese la edad de la persona: ");
            int edad = teclado.nextInt();
            
            if (edad >= 18) {
                System.out.println("Es mayor de edad.");
            }
        }
    }
}
