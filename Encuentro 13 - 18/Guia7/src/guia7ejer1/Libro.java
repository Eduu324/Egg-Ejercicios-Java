/*
Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.
 */
package guia7ejer1;

import java.util.Scanner;

/**
 *
 * @author Eduu
 */
public class Libro {

    private int ISBN, pag;
    private String titulo, autor;

    public Libro() {

    }

    public Libro(int ISBN, int pag, String titulo, String autor) {
        this.ISBN = ISBN;
        this.pag = pag;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getPag() {
        return pag;
    }

    public void setPag(int pag) {
        this.pag = pag;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void Usuario() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu usuario");
        String user = leer.nextLine();
    }

    public void CargaLibro() {
        Scanner leer = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingresa el nombre del libro");
        this.titulo = leer.nextLine();
        System.out.println("");
        System.out.println("Ingresa el nombre del autor");
        this.autor = leer.nextLine();
        System.out.println("");

    }

    public void NumerPaginas() {
        this.pag = (int) (Math.random() * 100);
        this.ISBN = (int) (Math.random() * 10000000);
        System.out.println("El titulo del libro es: " + titulo);
        System.out.println("");
        System.out.println("El Autor es: " + autor);
        System.out.println("");
        System.out.println("Pagina: " + pag);
        System.out.println("");
        System.out.println("ISBN : " + ISBN);
    }

}
