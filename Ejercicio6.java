/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6;

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Ingrese un número entre 1 y 7: ");
            int dia = teclado.nextInt();
            
            switch (dia) {
                case 1 -> System.out.println("Lunes");
                case 2 -> System.out.println("Martes");
                case 3 -> System.out.println("Miércoles");
                case 4 -> System.out.println("Jueves");
                case 5 -> System.out.println("Viernes");
                case 6 -> System.out.println("Sábado");
                case 7 -> System.out.println("Domingo");
                default -> System.out.println("Número incorrecto. Debe estar en el rango de 1 a 7.");
            }
        }
    }
}
