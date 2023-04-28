/*
3
Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €
4.
 */
package guia4ejerc;

import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class ejerc3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double num;
        boolean log = true;
        String opcion;
        do {
            System.out.println("  ¿Que moneda quieres convertir?");
            System.out.println("");
            System.out.println("          Menu de conversión");
            System.out.println(" ");
            System.out.println("1- Dolares");
            System.out.println("");
            System.out.println("2- Libras");
            System.out.println("");
            System.out.println("3- Yenes");
            System.out.println("");
            int opc = leer.nextInt();
            System.out.println("");

            switch (opc) {

                case 1:
                    System.out.println("");
                    System.out.println("Ingresa el monto que quieres convertir a Dolares(Usd)");
                    num = leer.nextDouble();
                    dolar1(num);
                    System.out.println("");
                    Scanner teclado = new Scanner(System.in);
                    System.out.println(" ");
                    System.out.println("Deseas volver al menu? Si/No");
                    opcion = teclado.nextLine();
                    System.out.println("");
                    if (opcion.equalsIgnoreCase("no")) {
                        log = false;
                        return;
                    } else {
                        continue;
                    }

                case 2:
                    System.out.println("");
                    System.out.println("Ingresa el monto que quieres convertir a Libra");
                    num = leer.nextDouble();
                    libra1(num);
                    System.out.println("");
                    Scanner tecla = new Scanner(System.in);
                    System.out.println(" ");
                    System.out.println("Deseas volver al menu? Si/No");
                    opcion = tecla.nextLine();
                    System.out.println("");
                    if (opcion.equalsIgnoreCase("no")) {
                        log = false;
                        return;
                    } else {
                        continue;
                    }

                case 3:
                    System.out.println("");
                    System.out.println("Ingresa el monto que quieres convertir a Yenes");
                    num = leer.nextDouble();
                    yen1(num);
                    System.out.println("");
                    Scanner tec = new Scanner(System.in);
                    System.out.println(" ");
                    System.out.println("Deseas volver al menu? Si/No");
                    opcion = tec.nextLine();
                    System.out.println("");
                    if (opcion.equalsIgnoreCase("no")) {
                        log = false;
                        return;
                    } else {
                        continue;
                    }

            }

        } while (log = true);
    }

    public static void dolar1(double num) {
        double dolar, resultado;
        dolar = (1.28611);
        resultado = num * dolar;
        System.out.println("");
        System.out.println("El monto es: " + resultado);

    }

    public static void libra1(double num) {
        double libra, resultado;
        libra = (0.86);
        resultado = num * libra;
        System.out.println("");
        System.out.println("El monto es: " + resultado);

    }

    public static void yen1(double num) {
        double yen, resultado;
        yen = (129.852);
        resultado = num * yen;
        System.out.println("");
        System.out.println("El monto es: " + resultado);

    }

}
