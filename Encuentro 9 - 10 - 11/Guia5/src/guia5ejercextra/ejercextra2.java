/*
2
Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos).
 */
package guia5ejercextra;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class ejercextra2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del vector");
        int N = leer.nextInt();
        int[] vector = new int[N];
        Random azar = new Random();
        for (int i = 0; i < N; i++) {
            vector[i] = azar.nextInt();
            if (i == N) {
                System.out.println(vector[i] + N);
                break;
            } else {
                continue;
            }

        }

    }
}
