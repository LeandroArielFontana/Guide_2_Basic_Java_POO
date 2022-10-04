package ejercicio001;

/**
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
 * Autor, Número de páginas, y un constructor con todos los atributos pasados por
 * parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
 * datos al usuario y luego informar mediante otro método el número de ISBN, el título,
 * el autor del libro y el número de páginas.
 */

import java.util.Scanner;


public class Ejercicio001 {
    public static void main(String[] args) {
        Book libroPrueba = new Book();
        Book libro = new Book();
        libroPrueba.createBook(libro);
        showInfo(libro);
    }

    private static void showInfo(Book book){
        System.out.println(" ");
        System.out.println("El nombre del libro es : " + book.getTittle());
        System.out.println("El código ISBN es : " + book.getIsbn());
        System.out.println("El nombre del autor es :  " + book.getAuthor());
        System.out.println("El Nro de paginas que contiene el libro es de : " + book.getPages() + " paginas");
    }
}
