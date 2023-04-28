/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
"salario". Luego, crea un método "calcular_aumento" que calcule el
aumento salarial de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30
años o del 5% si tiene menos de 30 años.
 */
package guia7ejercextra5;

import java.util.Scanner;



/**
 *
 * @author Eduu
 */
public class Empleado {
    public String nombre;
    public int edad;
    public double salario;
    
    

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    public Empleado(){
    
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    
   public void CrearEmpleado(){
       Scanner leer= new Scanner(System.in);
       System.out.println("Decime tu nombre");
       this.nombre=leer.nextLine();
       System.out.println("Decime tu edad");
       this.edad=leer.nextInt();
       System.out.println("Decime el monto del salario");
       this.salario=leer.nextDouble();
       
   } 
    
   public void CalcularAumento(){
       if(edad>=30){
           System.out.println(nombre + " Tu salario es de: " + (salario+(salario*0.10)));
           System.out.println("Tu aumento fue del 10%. Felicidades!!!");
       }
       else if (edad>1&&edad<30){
           System.out.println(nombre + " Tu salario es de: " + (salario+(salario*0.05)));
           System.out.println("Tu aumento fue del 5%. Felicidades!!!");
       }
           
   }
    
}
