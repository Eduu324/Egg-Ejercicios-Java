
package guia7ejercextra1;

import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class Cancion {
    
    private String autor;
    public String titulo;

    public Cancion(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Cancion(){
    
}
    public void CrearCancion(){
        Scanner leer= new Scanner (System.in);
        System.out.println("Decime el Autor de la canción");
        this.autor =leer.nextLine();
        System.out.println("");
         System.out.println("Decime el Titulo de la canción");
        this.titulo=leer.nextLine();
        System.out.println("");       
        System.out.println("");
    }
    
    public void Titulo(){
        System.out.println("La Canción se llama: "+ titulo);
        System.out.println("");
    }
    public void Autor(){
        System.out.println("El Autor es: "+autor );
    }
    
}
