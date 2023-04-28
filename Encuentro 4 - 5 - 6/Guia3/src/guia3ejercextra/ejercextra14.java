/*
14
Se dispone de un conjunto de N familias, cada una de las cuales tiene
una M cantidad de hijos. Escriba un programa que pida la cantidad de
familias y para cada familia la cantidad de hijos para averiguar la media
de edad de los hijos de todas las familias.
 */
package guia3ejercextra;

import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class ejercextra14 {
 
   public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
    
        System.out.println("Ingrese la cantidad de familias");
        int familia = leer.nextInt();
        
        int prom = 0;
        
        int cont = 0;
        
        for (int i = 1; i <= familia; i++){
            System.out.println("Indique la cantidad de hijos de la familia " + i);
            int hijos = leer.nextInt();
            System.out.println("Ingrese la edad de cada hijo");
            for(int j = 1; j <= hijos; j++){
                int edad = leer.nextInt();
                prom = prom + edad;
                cont = cont + 1;
            }
        }
        
        float promedio = (float) prom/cont;
        
        System.out.println("La media de edad de todos los hijos de todas las familias es: " + promedio);
    }
}
 