/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio8;

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String clave;
        
        do {
            System.out.print("Ingrese la contraseña del sistema: ");
            clave = teclado.nextLine();
            
            if (!clave.equals("java2026")) {
                System.out.println("Contraseña incorrecta. Intente de nuevo.");
            }
        } while (!clave.equals("java2026"));
        
        System.out.println("Acceso concedido.");
        teclado.close();
    }
}