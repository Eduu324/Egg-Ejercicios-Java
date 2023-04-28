
package guia2;

import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class Ejerc5 {
    /*
5. Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt(). 
*/
  public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);{
      System.out.println("Ingresa un numero");
      int num= leer.nextInt();
      int dob = num*num;
      int trip= num*num*num;
     
      
      System.out.println("El numero es: " +num
              + " y el DOBLE es: " + dob);
      System.out.println(" ");
      System.out.println("El numero es: " +num
              + " y el TRIPLE es: " + trip);
      System.out.println(" ");
      System.out.println("El numero es: " +num
              + " y la RAIZ es: " +Math.sqrt(num));
       }
  }
     
}
