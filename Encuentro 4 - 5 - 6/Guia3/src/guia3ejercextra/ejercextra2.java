/*
2
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package guia3ejercextra;

import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class ejercextra2 {
 
public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
    System.out.println("Ingresa los valores de A, B, C, D");
       
    System.out.println("Ingresa valor de A");
    int a= leer.nextInt();
    System.out.println(" ");
    System.out.println("Ingresa valor de B");
    int b= leer.nextInt();
    System.out.println(" ");
    System.out.println("Ingresa valor de C");
    int c= leer.nextInt();
    System.out.println(" ");
    System.out.println("Ingresa valor de D");
     int d= leer.nextInt();
     System.out.println(" ");
     
     int aux;
     aux=b;
     b=c;
     c=a;
     a=d;
     
     System.out.println("Valor de A "+a);
    
    System.out.println(" ");
    System.out.println("Valor de B "+b);
    
    System.out.println(" ");
    System.out.println("Valor de C "+c);
    
    System.out.println(" ");
    System.out.println("Valor de D "+aux);
     
     System.out.println(" ");
     
}
}

