package guia3ejerc;

import java.util.Scanner;

public class Ejerc1 {

    public static void main(String[] args) {

        /*1 Numero par o impar
         */
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa un numero para saber si es Par o Impar");
        int num = leer.nextInt();

        if (num % 2 == 0) {
            System.out.println("Tu numero es PAR: " + num);
        } else {
            System.out.println("Tu numero es IMPAR: " + num);
        }
    }

}
