/*
3 
Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.
 */
package guia5ejercextra;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class ejercextra3 {
    


	
	public static void main(String[] args){
            Scanner leer = new Scanner(System.in);
            System.out.println("Decime el tamaño del vector");
            int num = leer.nextInt();
             System.out.println(" ");
	   int[] vector = new int[num];
                
		llenarVector(vector, num);
		imprimirVector(vector, num);
	}
        
	
	public static int[] llenarVector(int[] vector, int num){
          System.out.println("Se estan llenando los vectores");
           System.out.println(" ");
          System.out.println("Bancame un ratito pa");
            System.out.println(" ");
            
	for(int i=0;i<num;i++){
           vector[i] = new Random().nextInt(100);
	}
	return vector;
	}
        
        
	public static void imprimirVector(int[] vector, int num){
		 System.out.println(" Listo papa");
                  System.out.println(" ");
                  
		for(int i=0;i<num;i++){
			System.out.print(vector[i] +" ");
		}
	}

}
   
    