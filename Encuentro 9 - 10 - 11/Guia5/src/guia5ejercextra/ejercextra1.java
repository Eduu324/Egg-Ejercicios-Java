/*
1
Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.

 */
package guia5ejercextra;

import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class ejercextra1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa el tamaño del vector");
        int N = leer.nextInt();
        int suma = 0;
        int[] vector = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Ingresa los numeros para ir sumando");
            vector[i] = leer.nextInt();
            suma += vector[i];
        }
        System.out.println("La suma de los valores es: " + suma);
    }
}
