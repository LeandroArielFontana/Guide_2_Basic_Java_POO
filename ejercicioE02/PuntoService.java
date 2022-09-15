/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioE02;

import java.util.Scanner;

/**
 *
 * @author Roxana
 */
public class PuntoService {
    
    static Scanner Read = new Scanner (System.in);
    
    public void crearPuntos(Punto punto){
        
        System.out.println("Digite posicion en X");
        
        punto.setX(Read.nextInt());
        
        System.out.println("Digite posicion en Y");
        
        punto.setY(Read.nextInt());
        
    }
    
    public double diferenciaPuntos(Punto p1, Punto p2){
        
        double resultado = 0.0;
        
        resultado = Math.sqrt( Math.pow( (p2.getX() - p1.getX() ), 2) + Math.pow((p2.getY() - p1.getY()), 2 ));
        
        return resultado;
    }
    
}
