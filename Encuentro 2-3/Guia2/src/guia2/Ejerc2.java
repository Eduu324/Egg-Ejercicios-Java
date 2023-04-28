package guia2;

import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class Ejerc2 {

    /*   
2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.
     */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        {
            System.out.println("Ingresa tu nombre");
            String name = leer.nextLine();
            System.out.println("Tu nombre es: " + name);
        }
    }

}
