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
public class CafeteraService {
    
    public void llenarCafetera(Cafetera cafetera){
	
	System.out.println("Cargando cafetera...");
	
	cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
	
	System.out.println("Cafetera llena!");
	
    }
    
    public void servirTaza(Integer taza, Cafetera cafetera){
	
	if (taza <= cafetera.getCantidadActual()){
	    
	    System.out.println("Llenando..");
	    
	    cafetera.setCantidadActual(cafetera.getCantidadActual() - taza);
	    
	    System.out.println("Taza llena!");
	    
	}else{
	    
	    System.out.println("De los " + taza + "ml solo se pudieron llenar " + (taza - cafetera.getCantidadActual()) + "ml");
	    
	}
	
    }
    
    public void vaciarCafetera(Cafetera cafetera){
	
	cafetera.setCantidadActual(0);
	
    }
    
    public void agregarCafe(Integer cafe, Cafetera cafetera){
	
	if (cafe + cafetera.getCantidadActual() >= 200){
	    
	    System.out.println("No se puede agregar mas cafe porque excederia el tope de la cafetera");
	}else if (cafe + cafetera.getCantidadActual() <= 200){
	    
	    System.out.println("Llenando...");
	    
	    System.out.println("Cafetera llena!");
	    
	}
	
	
    }
}
