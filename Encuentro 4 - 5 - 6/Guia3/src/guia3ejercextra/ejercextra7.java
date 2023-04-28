/*
7
Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.
 */
package guia3ejercextra;

import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class ejercextra7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa el valor");
        int n = leer.nextInt();
        do {
            System.out.println("Ingresa el valor maximo");
            double valormax = leer.nextDouble();
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Ingresa el valor minimo");
            double valormin = leer.nextDouble();
            System.out.println(" ");
            System.out.println(" ");

            System.out.println("Promedio del valor maximo es: " + n / valormax);
            System.out.println(" ");
            System.out.println("Promedio del valor minimo es: " + n / valormin);
            System.out.println(" ");
        } while (n > 0);
    }
}
