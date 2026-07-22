/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Ingrese la nota del estudiante: ");
            double nota = teclado.nextDouble();
            
            if (nota >= 7.0) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Reprobado");
            }
        }
    }
}