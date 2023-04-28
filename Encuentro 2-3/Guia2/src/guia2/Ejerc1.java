package guia2;

import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class Ejerc1 {

    
    
/*1. Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        {
            System.out.println("Ingresa 2 numeros");
            int num = leer.nextInt();
            int num1 = leer.nextInt();
            int suma = num + num1;
            System.out.println("La suma es: " + suma);

        }
    }

}
