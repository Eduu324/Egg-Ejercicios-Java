package guia3ejerc;

import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class Ejerc8 {

    /*   
8 Cuadrado *
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de lados");
        int num = leer.nextInt();
        if (num >= 1 && num <= 10) {
            //Linea superior
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }
            System.out.println();

            //centro de la forma
            for (int i = 0; i < num - 2; i++) {
                System.out.print("*");
                for (int j = 0; j < num - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }

            //Linea inferior
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }
        } else {
            System.out.println("Los parametros son de 1 - 10 ");
        }
    }
}
