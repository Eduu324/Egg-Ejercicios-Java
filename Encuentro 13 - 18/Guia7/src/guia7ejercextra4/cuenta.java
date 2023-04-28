/*
 Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.
 */
package guia7ejercextra4;

import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class cuenta {

    private double saldo;
    private String titular;

    public cuenta(){

    }

    public cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void CuantoSaldo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Nombre del titular de la cuenta");
        this.titular = leer.nextLine();
        System.out.println("");
        System.out.println("Decime el saldo");
        this.saldo = leer.nextDouble();

    }

    public void RetirarDinero() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Tu saldo es: " + saldo);
        System.out.println("¿Cuanto deseas sacar?");
        double monto = leer.nextDouble();
        if(monto>=saldo){
          System.out.println("");
        System.out.println("Tu saldo quedo en: " + (saldo=0));
  
        }else{
              System.out.println("");
        System.out.println("Tu saldo quedo en: " + (saldo - monto));
  
        }
            
        
    }

}
