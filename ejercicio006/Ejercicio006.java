/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio006;

/**
 *
 * @author leand
 */

import java.util.Scanner;

public class Ejercicio006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	
//  Programa Nespresso. Desarrolle una clase Cafetera con los atributos
//  capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
//  cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
//  menos, los siguientes métodos: 

//• Constructor predeterminado o vacío (Listo)

//• Constructor con la capacidad máxima y la cantidad actual (Listo)

//• Métodos getters y setters. (Listo)

//• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
//  máxima. (Listo)

//• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//  tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//  cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//  método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//  cuanto quedó la taza. (Listo)

//• Método vaciarCafetera(): pone la cantidad de café actual en cero. (Listo)

//• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//  recibe y se añade a la cafetera la cantidad de café indicada.
	
    Scanner Read = new Scanner(System.in);

    Cafetera cafetera = new Cafetera();
    
    int taza = 0;
    
    int cafe = 0;
    
    CafeteraService cafecito = new CafeteraService();
    
    cafecito.llenarCafetera(cafetera);

    System.out.println("Digite el tamaño de la taza ( en ml ) para llenar");
    
    taza = Read.nextInt();
    
    cafecito.servirTaza(taza, cafetera);
    
    System.out.println("Digite cuanto cafe desea agregar");
    
    cafe = Read.nextInt();
    
    cafecito.agregarCafe(cafe, cafetera);
    
    }    
    
}
