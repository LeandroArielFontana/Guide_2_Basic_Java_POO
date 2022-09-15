/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio004;

import java.util.Scanner;

/**
 *
 * @author leandro
 */

public class Rectangle {
    
    private Integer base;
    
    private Integer height;
    
    public void createRectangle(){
	
	Scanner Read = new Scanner (System.in);
	
	System.out.println("Digite la base del rectangulo");
	
	this.base = Read.nextInt();
	
	System.out.println("Digite la altura del rectangulo");
	
	this.height = Read.nextInt();
	
    }
    
    public Integer surface(){
	
	int Surface = 0;
	
	Surface = base * height;
	
	return Surface;
	
    }
    
    public Integer perimeter(){
	
	int Perimeter = 0;
	
	Perimeter = ( 2 * base ) + ( 2 * height );
	
	return Perimeter;
	
    }

    public Rectangle(Integer base, Integer height) {
	this.base = base;
	this.height = height;
    }

    public Rectangle() {
    }

    public Integer getBase() {
	return base;
    }

    public void setBase(Integer base) {
	this.base = base;
    }

    public Integer getHeight() {
	return height;
    }

    public void setHeight(Integer height) {
	this.height = height;
    }
    
    public void show(){
	
	for (int i = 0; i < base; i++) {
	    
	    for (int j = 0; j < height; j++) {
		
		if(i == 0 || j == 0 || i == (base - 1) || j == (height - 1)){
		    
		    System.out.print("* ");
		    
		}else{
		    
		    System.out.print("  ");
		    
		}
		
	    }
	    
	    System.out.println("");
	    
	}
	
    }
    
}
