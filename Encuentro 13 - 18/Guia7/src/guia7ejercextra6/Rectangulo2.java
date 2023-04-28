/*
Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un
método "calcular_area" que calcule y devuelva el área del rectángulo.
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados
de 4 y 6 y imprime el área del rectángulo.
 */
package guia7ejercextra6;

import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class Rectangulo2 {
    
    private double lado1;
    private double lado2;
    
    public Rectangulo2(){
    
}

    public Rectangulo2(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    
    public void CrearRectangulo1() {
        Scanner leeer = new Scanner(System.in);
        System.out.println("Ingresa el numero de 1 lado");
        this.lado1 = leeer.nextDouble();
        
        System.out.println("Ingresa el numero del 2 lado");
        this.lado2 = leeer.nextDouble();
        System.out.println("");

    }

    public void HacerRectangulo() {
        System.out.println("          Rectangulo");
      
        for (int i = (int) lado2; i > 0; i--) {

            for (int j = (int) lado1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public void CalcularArea() {
        double area = lado1 * lado2;
        System.out.println("");
        System.out.println("El Area es: " + area);
        System.out.println("");
        
    }

  
        public void HacerRectangulo1() {
            System.out.println("          Rectangulo 1");
            
            System.out.println("Lado 4 y lado 6");
        for (int i = (int) 6; i > 0; i--) {

            for (int j = (int) 4; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
    
    
}
