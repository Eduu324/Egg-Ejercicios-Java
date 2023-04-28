/*
1
Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.
 */
package guia3ejerc;

import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class ejercextra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;

        String resp;
        System.out.println("Ingresa 2 numeros positivos");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        System.out.println(" ");

        System.out.println("Elegi una opcion: ");
        System.out.println(" ");
        System.out.println("       MENÚ");
        System.out.println(" ");
        System.out.println("1)  SUMA ");
        System.out.println(" ");
        System.out.println("2)  RESTA ");
        System.out.println(" ");
        System.out.println("3)  MULTIPLICACION");
        System.out.println(" ");
        System.out.println("4)  DIVISION ");
        System.out.println(" ");

        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                double retorno = suma(opcion);
                break;
            case 2:
                retorno = resta(opcion);
                break;
            case 3:
                retorno = multiplic(opcion);
                break;
            case 4:
                retorno = division(opcion);
                break;
        }

    }

    public static double suma(int opcion) {
        Scanner leer = new Scanner(System.in);
        double num3, num4;
        double sum;

        System.out.println("                   SUMA ");
        System.out.println("Ingresa los numeros que quieres sumar");

        num3 = leer.nextInt();
        num4 = leer.nextInt();
        sum = (num3 + num4);
        System.out.println("La SUMA es:  " + sum);

        return sum;
    }

    public static double resta(int opcion) {
        Scanner leer = new Scanner(System.in);
        double num3, num4;
        double rest;

        System.out.println("                   RESTA ");
        System.out.println("Ingresa los numeros que quieres restar");

        num3 = leer.nextInt();
        num4 = leer.nextInt();
        rest = (num3 - num4);
        System.out.println("La RESTA es:  " + rest);

        return rest;
    }

    public static double multiplic(int opcion) {
        Scanner leer = new Scanner(System.in);
        double num3, num4;
        double mult;

        System.out.println("                   MULTIPLICACION ");
        System.out.println("Ingresa los numeros que quieres multiplicar r");

        num3 = leer.nextInt();
        num4 = leer.nextInt();
        mult = (num3 * num4);
        System.out.println("La MULTIPLICACION es:  " + mult);
        return mult;
    }

    public static double division(int opcion) {
        Scanner leer = new Scanner(System.in);
        double num3, num4;
        double divis;

        System.out.println("                   DIVISION ");
        System.out.println("Ingresa los numeros que quieres dividir");

        num3 = leer.nextInt();
        num4 = leer.nextInt();
        divis = (num3 / num4);
        System.out.println("La DIVISION es:  " + divis);
        return divis;

    }
}
