/*
13
Crear un programa que dibuje una escalera de números, donde cada
línea de números comience en uno y termine en el número de la línea.
Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se
ingresa el número 3:
1 
12
123
 */
package guia3ejercextra;

import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class ejercextra13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean log = true;
        do {
            System.out.println("Ingresa un numero del 1 al 10");
            int escalera = leer.nextInt();

            String resp = ("");
            int numActual = escalera - 1;
            int colum = 0;

            if (escalera >= 1 && escalera <= 10) {
                for (int i = 1; i <= escalera; i++) {

                    for (colum = 1; colum < i; colum++) {
                        numActual = numActual;

                        resp = resp + numActual + "";

                    }
                    resp = resp + " ";

                    System.out.println(resp + colum++);

                    log = false;
                    break;
                }
            } else {
                System.out.println("El numero ingresado no esta dentro del parametro");
            }
            continue;
        } while (log = true);

    }
}
