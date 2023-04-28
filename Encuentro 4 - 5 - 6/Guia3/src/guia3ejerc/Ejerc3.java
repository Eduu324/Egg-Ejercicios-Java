
package guia3ejerc;

import java.util.Scanner;


public class Ejerc3 {
        /*
    3 Realizar un programa que solo permita introducir solo frases o palabras
de 8 de largo

     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa una frase de 8 letras");
        String frase = leer.nextLine();
        int length = frase.length();
        if (length == 8) {
            System.out.println("CORRECTO, es de 8 letras");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}


