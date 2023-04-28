package guia2;

import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class Ejerc4 {

    /*
4. Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        {

            System.out.println("Ingresa la cantidad de grados que quieres calcular");
            double c = leer.nextDouble();
            double f = 32 + (9 * c / 5);
            System.out.println("Los grados Fahrenheit son: " + f + "°");
        }
    }

}
