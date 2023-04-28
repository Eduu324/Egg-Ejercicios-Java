
package guia7ejer3;

import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class Operaciones {

  
    
   private double num1; 
   private double num2;

    public Operaciones(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
   
   public Operaciones () {
       
   }

   public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
   public void CrearOperaciones(){
       Scanner leer= new Scanner (System.in);
       System.out.println("Ingresa el primer numero");
       this.num1 =leer.nextDouble();
       
       System.out.println("Ingresa el segundo numero");
       this.num2 =leer.nextDouble();
       
   }
   
   public double Sumar(){
   double suma= this.num1 + this.num2;
       System.out.println("El resultado de la Suma es: " +suma );
      
   return suma;
   }
 
   public double Restar(){
   double resta= this.num1 - this.num2;
       System.out.println("El resultado de la Resta es: " +resta );
      
   return resta;
   }
   
   public double Multiplicar(){
   double mult= this.num1 * this.num2;
      if(num1==0 || num2==0){
          mult=0;
          System.out.println("Error");
      }    else 
          System.out.println("El resultado de la Multiplicación es: " + mult );

   return mult;
   }
   
   
   public double Dividir(){
   double div= this.num1 / this.num2;
      if(num1==0 || num2==0){
          div=0;
          System.out.println("Error");
      }    else 
          System.out.println("El resultado de la División es: " + div );
 
   return div;
   }
   
   
}
