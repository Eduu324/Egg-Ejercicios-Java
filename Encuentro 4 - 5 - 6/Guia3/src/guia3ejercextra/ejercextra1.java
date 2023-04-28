/*
1
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
 */
package guia3ejercextra;

import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class ejercextra1 {
   

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingresa la cantidad de minutos que quieres calcular");
       int min = leer.nextInt();
       int hora;
       int dias;
       int seg;
       hora= (1*min)/60;
       dias= min/1440;
       seg= min*60;
       
        System.out.println("Cantidad de dias: " + dias);
        System.out.println(" ");
         System.out.println("Cantidad de horas: " + hora );
         System.out.println(" ");
          System.out.println("Cantidad de segundos: "+ seg);
    
}
}

