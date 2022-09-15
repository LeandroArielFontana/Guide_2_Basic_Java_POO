/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio001;

/**
 *
 * @author leand
 */

import java.util.Scanner;



public class Ejercicio001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	
//  Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
//  Autor, Número de páginas, y un constructor con todos los atributos pasados por
//  parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
//  datos al usuario y luego informar mediante otro método el número de ISBN, el título,
//  el autor del libro y el numero de páginas.

    Book libro1 = new Book();
    
    Book libro = new Book();
    
    libro1.createBook(libro);
    
    System.out.println(" ");
    
    System.out.println("El nombre del libro es : " + libro.getTittle());
    
    System.out.println("El codigo ISBN es : " + libro.getIsbn());
    
    System.out.println("El nombre del autor es :  " + libro.getAuthor());
    
    System.out.println("El Nro de paginas que contiene el libro es de : " + libro.getPages() + " paginas");
    
    }
    
}
