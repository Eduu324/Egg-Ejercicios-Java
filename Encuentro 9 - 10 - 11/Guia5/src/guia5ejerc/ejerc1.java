/*
1
Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
 */
package guia5ejerc;

import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class ejerc1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int[] vector = new int[100];

        vector[0] = 100;

        for (int i = 0; i < 100; i++) {
            vector[i] = 100 - i;
            System.out.println("[" + vector[i] + "]");
        }
    }
}
