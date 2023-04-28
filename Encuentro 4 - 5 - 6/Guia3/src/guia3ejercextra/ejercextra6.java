/*
6
Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
 */
package guia3ejercextra;

import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class ejercextra6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique la cantidad de personas");
        int pers = leer.nextInt();
        double altura = 0, bajopromed = 0, promed = 0;
        int cont = 0;
        for (int i = 0; i < pers; i++) {
            do {
                System.out.println("Decime las alturas");
                altura = leer.nextDouble();
                if (altura < 160) {
                    bajopromed = +altura;
                    cont++;
                }
                promed = +altura;

            } while (altura >= 0 && altura < 3);
        }
        System.out.println("el promedio es: " + (promed / pers) + " %");
        System.out.println("el promedio bajo es:" + (bajopromed / cont) + " %");

    }
}
