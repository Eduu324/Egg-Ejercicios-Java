/*
3
Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package guia5ejerc;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class ejerc3 {
    




public static void main(String[] args) {
        int[] vector = new int[100];
        
        int num = 0;
        
        int suma;
        
        int dig1 = 0;
        int dig2 = 0;
        int dig3 = 0;
        int dig4 = 0;
        int dig5 = 0;
        
        for(int i = 0;  i < 100; i++){
            vector[i] =  (int) (Math.random() * 100000);
            num = vector[i];
            suma = 0;
            while(num > 0){
                num = num / 10;
                suma += 1;
            }
            
            switch(suma){
                case 1:
                    dig1 += 1;
                    break;
                case 2:
                    dig2 += 1;
                    break;
                case 3:
                    dig3 += 1;
                    break;
                case 4:
                    dig4 += 1;
                    break;
                case 5:
                    dig5 +=1;
                    break;
            }
        }
        
        System.out.println("Hay " + dig1 + " números de 1 dígito");
        System.out.println("");
        System.out.println("Hay " + dig2 + " números de 2 dígitos");
        System.out.println("");
        System.out.println("Hay " + dig3 + " números de 3 dígitos");
        System.out.println("");
        System.out.println("Hay " + dig4 + " números de 4 dígitos");
        System.out.println("");
        System.out.println("Hay " + dig5 + " números de 5 dígitos");
        
    }
}
 