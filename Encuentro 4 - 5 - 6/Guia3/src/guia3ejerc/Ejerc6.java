
package guia3ejerc;

import java.util.Scanner;


public class Ejerc6 {

    
    /*
6 Menu suma, resta, etc
     */
    
    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double num1;
        double num2;
        String resp;
        System.out.println("Ingresa 2 numeros positivos");
        num1 = leer.nextDouble();
        num2 = leer.nextDouble();
        System.out.println(" ");
        boolean log = true;

        do {
            System.out.println(" ");
            System.out.println("Elegi una opcion: ");
            System.out.println(" ");
            System.out.println("     MENÚ");
            System.out.println(" ");
            System.out.println("1) SUMA ");
            System.out.println(" ");
            System.out.println("2) RESTA ");
            System.out.println(" ");
            System.out.println("3) MULTIPLICACION");
            System.out.println(" ");
            System.out.println("4) DIVISION ");
            System.out.println(" ");
            System.out.println("5) SALIR ");
            System.out.println(" ");
            int opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("                   SUMA ");
                    System.out.println("Ingresa los numeros que quieres sumar");

                    num1 = leer.nextDouble();
                    num2 = leer.nextDouble();
                    double sum = (num1 + num2);
                    System.out.println(" ");
                    System.out.println("La SUMA es:  " + sum);
                    System.out.println(" ");

                    break;
                case 2:
                    System.out.println("                   RESTA ");
                    System.out.println("Ingresa los numeros que quieres restar");

                    num1 = leer.nextDouble();
                    num2 = leer.nextDouble();
                    double rest = (num1 - num2);
                    System.out.println(" ");
                    System.out.println("La RESTA es:  " + rest);
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("                   MULTIPLICACION ");
                    System.out.println("Ingresa los numeros que quieres multiplicar r");

                    num1 = leer.nextDouble();
                    num2 = leer.nextDouble();
                    double mult = (num1 * num2);
                    System.out.println(" ");
                    System.out.println("La MULTIPLICACION es:  " + mult);
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println("                   DIVISION ");
                    System.out.println("Ingresa los numeros que quieres dividir");

                    num1 = leer.nextDouble();
                    num2 = leer.nextDouble();
                    double divis = (num1 / num2);
                    System.out.println("La DIVISION es:  " + divis);
                    System.out.println(" ");

                    break;
                case 5:
                    System.out.println("                   SALIR ");
                    Scanner teclado = new Scanner(System.in);
                    System.out.println("Estas seguro que deseas salir? S/N");
                    resp = teclado.nextLine();
                    if (resp.equalsIgnoreCase("s")) {
                        log = false;
                        return;
                    } else {
                        continue;
                    }
            }
        } while (log = true);
    }

}
