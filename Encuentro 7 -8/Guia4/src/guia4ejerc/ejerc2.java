/*
2
Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.
 */
package guia4ejerc;

import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class ejerc2 {

    public static void main(String[] args) {
        boolean log1 = true;
        String vuelve;
        int retorno;

        do {
            vuelve = nombre();
            retorno = edad();

            Scanner tecla = new Scanner(System.in);

            System.out.println(" ");
            System.out.println("Deseas seguir ingresando personas?");
            System.out.println(" ");
            System.out.println("Ingresa NO para finalizar");
            String opc = tecla.nextLine();
            if (opc.equalsIgnoreCase("no")) {
                log1 = false;
                break;
            } else {
                continue;
            }

        } while (log1 = true);

    }

    public static String nombre() {
        Scanner otro = new Scanner(System.in);
        System.out.println("Decime tu nombre");
        String name1 = otro.nextLine();
        System.out.println(" ");
        return name1;

    }

    public static int edad() {
        Scanner otro1 = new Scanner(System.in);
        System.out.println("Decime tu edad");
        int num1 = otro1.nextInt();
        System.out.println(" ");

        if (num1 >= 18) {
            System.out.println("Eres mayor de edad");

        } else {
            System.out.println("Eres menor de edad");
        }
        return num1;
    }
}
