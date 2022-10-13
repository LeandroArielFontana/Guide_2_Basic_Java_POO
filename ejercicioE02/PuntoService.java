package ejercicioE02;

import java.util.Scanner;

public class PuntoService {
    
    private static Scanner read = new Scanner (System.in);
    
    public void crearPuntos(Punto punto){
        System.out.println("Digite posicion en X");
        punto.setX(read.nextInt());
        
        System.out.println("Digite posicion en Y");
        punto.setY(read.nextInt());
    }
    
    public double diferenciaPuntos(Punto p1, Punto p2){
        return Math.sqrt( Math.pow( (p2.getX() - p1.getX() ), 2) + Math.pow((p2.getY() - p1.getY()), 2 ));
    }
    
}
