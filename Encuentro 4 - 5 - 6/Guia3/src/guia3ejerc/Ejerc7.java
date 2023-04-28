package guia3ejerc;

import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class Ejerc7 {

    /*   
7 Realizar un programa que simule el funcionamiento de un dispositivo RS232
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String codigo = "";
        int correcto = 0;
        int incorrecto = 0;
        do {
            System.out.println("Ingresa una frase de 5 caracteres");
            codigo = leer.nextLine();

            if (codigo.length() == 5) {
                if (codigo.substring(0, 1).equalsIgnoreCase("X")
                        && codigo.substring(4, 5).equalsIgnoreCase("O")) {
                    correcto++;
                } else if (!codigo.equalsIgnoreCase("&&&&&")) {
                    incorrecto++;
                }
            }
        } while (!codigo.equalsIgnoreCase("&&&&&"));
        System.out.println("Ingreso un total de "
                + correcto + " códigos correctos");
        System.out.println("Ingreso un total de "
                + incorrecto + " códigos incorrectos");
    }
}
