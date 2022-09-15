/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio002;

/**
 *
 * @author leand
 */
public class Circumference {
    
    private Double radio;

    public Circumference(Double radio) {
	
	this.radio = radio;
	
    }

    public Double getRadio() {
	return radio;
    }

    public void setRadio(Double radio) {
	this.radio = radio;
    }
    
    public void createCircumference(Double radio){
	
	this.radio = radio;
	
    }
    
    public Double Area(Double radio){
	
	double Area = 0.0;
	
	Area = Math.PI * radio;
	
	return Area;
	
    }
    
    public Double Perimeter(Double radio){
	
	double Perimeter = 0.0;
	
	Perimeter = Math.PI * 2 * radio;
	
	return Perimeter;
	
    }
    
}
