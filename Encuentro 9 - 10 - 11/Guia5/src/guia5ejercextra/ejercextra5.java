
package guia5ejercextra;

import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class ejercextra5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        int[][] matriz2 = new int[3][3];
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                    matriz[i][j] = leer.nextInt();
                    matriz2[j][i] = matriz[i][j];
            }
        }
        
        System.out.println("Matriz original");
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
            
        System.out.println("Matriz transpuesta");
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println("");
        }
        
        int suma = 0;
        
        for(int i = 0; i  < 3; i++){
            for(int j = 0; j  < 3; j++){
                if(matriz[i][j] == (matriz2[i][j] * -1)){
                    suma += 1;
                }
            }
        }
        
        if(suma == 9){
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz no es antisimétrica");
        }
        
    }
    
}
