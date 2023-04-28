package guia9ejerc2;

import Entidades.ParDeNumeros;
import Service.ParDeNumerosService;

public class Guia9Ejerc2 {

    public static void main(String[] args) {
        
        ParDeNumerosService sv = new ParDeNumerosService();
        
        ParDeNumeros c1 = new ParDeNumeros();
        
        System.out.println(" Valores de los numeros");
        sv.MostrarValores(c1);

        System.out.println(" Numero mayor");
        sv.devolverMayor(c1);

        System.out.println(" Potencia del mayor");
        sv.CalcularPotencia(c1);
        
        System.out.println(" Raiz del numero menor");
        sv.calculaRaiz(c1);

    }

}
