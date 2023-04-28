/*
3
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String.
 */
package guia3ejercextra;

import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class ejercextra3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una letra");
        char letra1 = leer.next().charAt(0);
        String letra = String.valueOf(letra1);
        boolean vocal = "a".equalsIgnoreCase(letra)
                || "e".equalsIgnoreCase(letra)
                || "i".equalsIgnoreCase(letra)
                || "o".equalsIgnoreCase(letra)
                || "u".equalsIgnoreCase(letra);

        if (vocal) {
            System.out.println("La letra elegida es una vocal: " + letra);

        } else {
            System.out.println("La letra elegida no es una vocal");
        }
    }
}
