package guia3ejerc;

import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class Ejerc4 {

    /*
4 Letra A primero, falta
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean log = true;
        do {
            System.out.println("Ingresa una frase que la primer letra sea A");
            String frase = leer.nextLine();
            String vocal = frase.substring(0, 1);

            if (vocal.equalsIgnoreCase("a")) {
                System.out.println("CORRECTO");
                log = false;
                break;
            } else {
                System.out.println("INCORRECTO");
            }
            log = true;

        } while (log = true);

    }
}
