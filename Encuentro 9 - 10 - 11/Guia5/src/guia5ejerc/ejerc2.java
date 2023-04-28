/*
2 
Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
 */
package guia5ejerc;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class ejerc2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del vector");
        int N = leer.nextInt();
        int[] vector = new int[N];
        System.out.println("Ingresa un numero de 1-9 para saber si esta repetido");
        int num = leer.nextInt();
        Random azar = new Random();
        for (int i = 0; i < N; i++) {
            vector[i] = azar.nextInt(9);

            if (vector[i] == num) {
                System.out.println("El numero se encuentra repetido");
                System.out.println(vector[i]);
            } else {
                System.out.println("El numero no se encuentra repetido");
            }

        }

    }
}
