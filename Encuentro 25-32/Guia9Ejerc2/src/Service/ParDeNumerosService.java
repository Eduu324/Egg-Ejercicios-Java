package Service;

import Entidades.ParDeNumeros;
import static java.lang.Math.sqrt;

public class ParDeNumerosService {

    /*
 a) Método mostrarValores que muestra cuáles son los dos números
guardados.
     */
    public void MostrarValores(ParDeNumeros c1) {

        System.out.println("El primer numero es: " + (int) c1.getNum1());
        

        System.out.println("El segundo numero es: " + (int) c1.getNum2());
        System.out.println("");
    }

    /*     
b) Método devolverMayor para retornar cuál de los dos atributos tiene
el mayor valor
     */
    public void devolverMayor(ParDeNumeros c1) {

        if (c1.getNum1() > c1.getNum2()) {

            System.out.println("El primer numero " + (int) c1.getNum1()
                    + " es mayor que el segundo " + (int) c1.getNum2());
            System.out.println("");
            
        } else if (c1.getNum1() < c1.getNum2()) {

            System.out.println("El segundo valor " + (int) c1.getNum2()
                    + " es mayor que el primero " + (int) c1.getNum1());
             System.out.println("");
            
        }
    }

    /*  
c) Método calcularPotencia para calcular la potencia del mayor valor de
la clase elevado al menor número. Previamente se deben redondear
ambos valores.
     */
    public void CalcularPotencia(ParDeNumeros c1) {

        if ((int) c1.getNum1() > (int) c1.getNum2()) {

            System.out.println("base: " + (int) c1.getNum1()
                    + " exponente: " + (int) c1.getNum2());

            System.out.println("El resultado es: " +
                    Math.pow(c1.getNum1(), c1.getNum2()));
             System.out.println("");
            

        } else if ((int) c1.getNum1() < (int) c1.getNum2()) {

            System.out.println("base: " + (int) c1.getNum2()
                    + " exponente: " + (int) c1.getNum1());

            System.out.println("El resultado es: " +
                    Math.pow(c1.getNum2(), c1.getNum1()));
             System.out.println("");
            
        }
    }

    /*   
d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
dos valores. Antes de calcular la raíz cuadrada se debe obtener el
valor absoluto del número.
     */
    public void calculaRaiz(ParDeNumeros c1) {
         double absolut=0;
         
        if ((int) c1.getNum1() > (int) c1.getNum2()) {
            
           absolut=Math.abs(c1.getNum2());
            System.out.println("Numero menor: " +(int)c1.getNum2());
            System.out.println("El resultado es: " + sqrt(absolut));

        } else if ((int) c1.getNum1() < (int) c1.getNum2()) {
            
         absolut=Math.abs(c1.getNum1());
            System.out.println("Numero menor: " + (int)c1.getNum1() );
            System.out.println("El resultado es: " + sqrt(absolut));
        }
    }

}
