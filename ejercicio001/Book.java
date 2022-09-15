/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio001;

import java.util.Scanner;

/**
 *
 * @author leand
 */

public class Book {
    
//  Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
//  Autor, Número de páginas, y un constructor con todos los atributos pasados por
//  parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
//  datos al usuario y luego informar mediante otro método el número de ISBN, el título,
//  el autor del libro y el numero de páginas.
    
    private String isbn;
    
    private String tittle;
        
    private String author;
    
    private Integer pages;

    public Book(String isbn, String tittle, String author, Integer pages) {
	
	this.isbn = isbn;
	
	this.tittle = tittle;
	
	this.author = author;
	
	this.pages = pages;
    }

    public Book() {
    }

    public String getIsbn() {
	return isbn;
    }

    public void setIsbn(String isbn) {
	this.isbn = isbn;
    }

    public String getTittle() {
	return tittle;
    }

    public void setTittle(String tittle) {
	this.tittle = tittle;
    }

    public String getAuthor() {
	return author;
    }

    public void setAuthor(String author) {
	this.author = author;
    }

    public Integer getPages() {
	return pages;
    }

    public void setPages(Integer pages) {
	this.pages = pages;
    }
    
    public void createBook(Book libro){
	
    Scanner Read = new Scanner(System.in);

    System.out.println("Ponga el nombre del libro por favor");
        
    libro.setTittle(Read.nextLine());
    
    System.out.println("Coloque el codigo ISBN por favor");
    
    libro.setIsbn(Read.nextLine());

    System.out.println("Digite el nombre del autor por favor");
    
    libro.setAuthor(Read.nextLine());

    System.out.println("Digite el numero de paginas que contiene el libro");
    
    libro.setPages(Read.nextInt());
    }
    
}
