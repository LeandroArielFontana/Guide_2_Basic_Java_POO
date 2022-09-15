/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio008;

/**
 *
 * @author leandro
 */

public class Cadena {
    
    private String frase;
    
    private Integer longitud;

    public Cadena() {
    }

    public Cadena(String frase, Integer longitud) {
	
	this.frase = frase;
	
	this.longitud = longitud;
	
    }

    public String getFrase() {
	return frase;
    }

    public void setFrase(String frase) {
	this.frase = frase;
    }

    public Integer getLongitud() {
	return longitud;
    }

    public void setLongitud(Integer longitud) {
	this.longitud = longitud;
    }
    
    
    
}
