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
public class Cafetera {
    
    private Integer capacidadMaxima = 200;
    
    private Integer cantidadActual;

    public Cafetera(Integer capacidadMaxima, Integer cantidadActual) {
	
	this.capacidadMaxima = capacidadMaxima;
	
	this.cantidadActual = cantidadActual;
    }

    public Cafetera() {
    }

    public Integer getCapacidadMaxima() {
	return capacidadMaxima;
    }

    public void setCapacidadMaxima(Integer capacidadMaxima) {
	this.capacidadMaxima = capacidadMaxima;
    }

    public Integer getCantidadActual() {
	return cantidadActual;
    }

    public void setCantidadActual(Integer cantidadActual) {
	this.cantidadActual = cantidadActual;
    }
    
    
}
