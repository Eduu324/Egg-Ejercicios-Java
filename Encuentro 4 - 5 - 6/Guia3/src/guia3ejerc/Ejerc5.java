package guia3ejerc;

import java.util.Scanner;

public class Ejerc5 {

    /*  
5 valor limite y que se supere sumando
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Decime un numero limite");
        int numlimit = leer.nextInt();

        int aux = 0;
        for (int i = 0; aux <= numlimit; i++) {
            System.out.println("Introduzca numeros");
            int num = leer.nextInt();
            aux = num + aux++;

        }
        while (numlimit <= aux) {
            System.out.println("Limite superado, lo superaste con: " + aux);
            break;
        }
    }
}
