/*
4
Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o no un
número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
17 si es primo.
 */
package guia3ejerc;

import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class ejercextra4 {


public static void main(String[] args) {
 Scanner leer= new Scanner (System.in);{
    boolean retorno;
    System.out.println("Decime un numero");
    int num = leer.nextInt();
    
   retorno=esPrimo(num);
    System.out.println( retorno);
      
}
}

public static boolean esPrimo(int num){
  int contador = 2;
  boolean primo=true;
  while ((primo) && (contador!=num)){
    if (num % contador == 0)
      primo = false;
      contador++;
     }
 
 return primo;
}
}

