package guia7ejer4;

import java.util.Scanner;

/*
Crear una clase Rectángulo que modele rectángulos por medio de un
atributo privado base y un atributo privado altura. La clase incluirá un
método para crear el rectángulo con los datos del Rectángulo dados por
el usuario. También incluirá un método para calcular la superficie del
rectángulo y un método para calcular el perímetro del rectángulo. Por
último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los
métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
        
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void CrearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la Base");
        this.base = leer.nextDouble();
        System.out.println("Ingresa la Altura");
        this.altura = leer.nextDouble();

    }

    public void HacerRectangulo() {
        for (int i = (int) altura; i > 0; i--) {

            for (int j = (int) base; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public void Superficie() {
        double sup = base * altura;
        System.out.println("La superficie es: " + sup);
        
    }

    public void  Perímetro() {
        double perim = (base + altura) * 2;
        System.out.println("El perimetro es: " + perim);
        
    }
}
  
