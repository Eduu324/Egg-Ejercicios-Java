/*
1
Crea una clase "Coche" con las propiedades "marca", "modelo" y "precio".
crea tres objetos de la clase "coche" y muestralos por pantalla.
 */
package guia7ejercextraextra1;

import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class Coche {

    public String marca;
    public double modelo, precio;

    public Coche() {

    }

    public Coche(String marca, double modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getModelo() {
        return modelo;
    }

    public void setModelo(double modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void CocheModelo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("De que año es el modelo de tu auto");
        this.modelo = leer.nextDouble();

    }

    public void CocheMarca() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Decime la Marca del Auto");
        this.marca = leer.nextLine();
    }

    public void CochePrecio() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Decime el Precio del Auto");
        this.precio = leer.nextDouble();

    }

    public void Auto() {
        System.out.println("La marca del Coche es: " + marca.toUpperCase() + ". Modelo: " + modelo);
        System.out.println("Su Precio es: " + precio + " Usd.");
    }

}
