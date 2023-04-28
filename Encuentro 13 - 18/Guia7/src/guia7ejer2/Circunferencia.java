/*
Declarar una clase llamada Circunferencia que tenga como atributo
privado el radio de tipo real. A continuación, se deben crear los
siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area=〖
π*radio〗^2).
e) Método perimetro(): para calcular el perímetro
(Perimetro=2*π*radio).
 */
package guia7ejer2;

import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class Circunferencia {
    
    private double radio;

    public Circunferencia() {
}

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void CrearCircunferencia(){
        Scanner leer= new Scanner (System.in);
        System.out.println("Decime el numero del radio");
        this.radio=leer.nextDouble();
        
    }
    
     public void Area(){
         double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El Area es: " + area);
       
        
    }
     public void Perimetro(){
         
        double perimetro = 2*Math.PI*radio;
        System.out.println("El Perimetro es: " + perimetro);
    }
    
}
