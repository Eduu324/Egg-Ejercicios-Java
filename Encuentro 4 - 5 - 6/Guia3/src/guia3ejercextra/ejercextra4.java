/*
4
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano.
 */
package guia3ejercextra;

import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class ejercextra4 {

   public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
       System.out.println("Ingresa un numero del 1 al 10");
       int num = leer.nextInt();
       
       switch (num){
           case 1:
            System.out.println(" ");
            System.out.println("El numero elegido es: " + num + " == I en romanos");
            System.out.println(" ");
            break;
          case 2:
           System.out.println(" ");
           System.out.println("El numero elegido es: " + num + " == II en romanos");
           System.out.println(" ");
           break;
           case 3:
           System.out.println(" ");
           System.out.println("El numero elegido es: " + num + " == III en romanos");
           System.out.println(" ");
           break;
           case 4:
           System.out.println(" ");
           System.out.println("El numero elegido es: " + num + " == IV en romanos");
           System.out.println(" ");
           break;
           case 5:
           System.out.println(" ");
           System.out.println("El numero elegido es: " + num + " == V en romanos");
           System.out.println(" ");
           break;
           case 6:
           System.out.println(" ");
           System.out.println("El numero elegido es: " + num + " == VI en romanos");
           System.out.println(" ");
           break;
           case 7:
           System.out.println(" ");
           System.out.println("El numero elegido es: " + num + " == VII en romanos");
           System.out.println(" ");
           break;
           case 8:
           System.out.println(" ");
           System.out.println("El numero elegido es: " + num + " == VIII en romanos");
           System.out.println(" ");
           break;
           case 9:
           System.out.println(" ");
           System.out.println("El numero elegido es: " + num + " == IX en romanos");
           System.out.println(" ");
           break;
           case 10:
           System.out.println(" ");
           System.out.println("El numero elegido es: " + num + " == X en romanos");
           System.out.println(" ");
           break;
           default:
           
               System.out.println("No esta entre ls valores 1 - 10");
          break;
       }
    }
}


