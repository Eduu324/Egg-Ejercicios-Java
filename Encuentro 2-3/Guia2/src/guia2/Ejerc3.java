
package guia2;

import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class Ejerc3 {
    /*    
3. Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.  
*/
      public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);{
          System.out.println("Ingresa una frase");
          String frase=leer.nextLine();
          
          System.out.println("En MAYUSCULAS: "+frase.toUpperCase());
          System.out.println("En minusculas: "+frase.toLowerCase());
          }
      }
    
}
