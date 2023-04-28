package guia3ejerc;

import java.util.Scanner;

public class Ejerc2 {

/*2 Frase secreta eureka
*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa la frase correcta");
        String frase = leer.nextLine();
        String frasesecret = ("eureka");

        if (frase.equals(frasesecret)) {
            System.out.println("CORRECTO, esa es la frase");
        } else {
            System.out.println("INCORRECTO, intenta de nuevo");
        }
    }
}
