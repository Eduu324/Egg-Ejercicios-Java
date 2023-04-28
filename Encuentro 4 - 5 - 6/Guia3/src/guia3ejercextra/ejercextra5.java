/*
5
Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.
 */
package guia3ejercextra;

import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class ejercextra5 {
    

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingresa el tipo de socio que sos");
        System.out.println(" ");
        System.out.println(" SOCIO A ");
        System.out.println(" ");
        System.out.println(" SOCIO B ");
        System.out.println(" ");
        System.out.println(" SOCIO C ");
        System.out.println(" ");
     String socio= leer.nextLine();
     double num, desc;
  switch (socio.toUpperCase()) {
      case "A":
          System.out.println("    Usted es socio de tipo A, tiene un 50% de descuento en tratamiento ");
          System.out.println(" ");
          System.out.println("Ingresa el monto para hacer el descuento del 50%");
          System.out.println(" ");
          num= leer.nextInt();
          desc = num * (0.5);
          System.out.println(" ");
          System.out.println("Su monto con descuento es: " + desc);
          break;
    case "B":
          System.out.println("    Usted es socio de tipo B, tiene un 35% de descuento en tratamiento ");
       System.out.println(" ");
          System.out.println("Ingresa el monto para hacer el descuento del 35%");
          System.out.println(" ");
          num= leer.nextInt();
          desc = num * (0.35);
          System.out.println(" ");
          System.out.println("Su monto con descuento es: " + desc);
          break;
     case "C":
          System.out.println("    Usted es socio de tipo C ");
           System.out.println(" ");
          System.out.println("Ingresa el monto");
          System.out.println(" ");
          num= leer.nextInt();
          System.out.println(" ");
          System.out.println("Su monto  es: " + num);
          break;
  }
}
}
 
