/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
a dos jugadores jugar un juego de adivinanza de números. El primer
jugador elige un número y el segundo jugador intenta adivinarlo. El
segundo jugador tiene un número limitado de intentos y recibe una pista
de "más alto" o "más bajo" después de cada intento. El juego termina
cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el
número de veces que cada jugador ha ganado.
 */
package guia7ejercextra3;

import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class Juego {

    private int num1;
    private int num2;

    public Juego(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Juego() {

    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void IniciarJuego() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa el numero a adivinar");
        this.num1 = leer.nextInt();
        System.out.println(" ");

    }

    public void Adivinar() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero de intentos");
        int intento = leer.nextInt();
        System.out.println("");
        for (int i = 0; i < intento; i++) {
            System.out.println("Ingresa el numero para saber si es correcto");
            this.num2 = leer.nextInt();
            System.out.println("");
            if (num1 == num2) {
                System.out.println("Felicidades adivinaste el numero: " + num1);

            } else if (num1 > num2) {
                System.out.println("El numero es mas alto");
                System.out.println("");
                System.out.println("Intentalo de nuevo te quedan " +
                        " pocos intentos para adividar el numero ");
                System.out.println("");
            } else if (num1 < num2) {
                System.out.println("El numero es mas bajo");
                System.out.println("");
                System.out.println("Intentalo de nuevo te quedan " +
                        " de intentos para adividar el numero ");
                System.out.println("");
            }
        }

    }

}
