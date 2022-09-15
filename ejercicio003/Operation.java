/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio003;

/**
 *
 * @author leand
 */

import java.util.Scanner;

public class Operation {
    
    private Integer number1;
    
    private Integer number2;

    public Operation(Integer number1, Integer number2) {
	
	this.number1 = number1;
	
	this.number2 = number2;

    }

    public Operation() {
    }

    public Integer getNumber1() {
	return number1;
    }

    public void setNumber1(Integer number1) {
	this.number1 = number1;
    }

    public Integer getNumber2() {
	return number2;
    }

    public void setNumber2(Integer number2) {
	this.number2 = number2;
    }
    
    public void createOperation(){
	
	Scanner Read = new Scanner (System.in);
	
	System.out.println("Digite el 1er Numero");
	
	this.number1 = Read.nextInt();
	
	System.out.println("Digite el 2do Numero");
	
	this.number2 = Read.nextInt();

    }
    
    public Double addition(){
	
	double Add = 0.0;
	
	Add = number1 + number2;
	
	return Add;
	
    }
    
    public Double sustraction(){
	
	double Sustraction = 0.0;
	
	Sustraction = number1 + number2;
	
	return Sustraction;
		
    }
    
    public Double mult(){
	
	if ((int)number1 != 0 || (int)number2 != 0){
	    
	    double Mult = 0.0;

	    Mult = number1 * number2;

	    return Mult;
	    
	}else{
	    
	    return 0.0 ;
	    
	}
    
    }
    
    public void division(){
	
	if ((int)number1 != 0 || (int)number2 != 0){
	    
	    double Division = 0.0;

	    Division = number1 * number2;

	    System.out.println("El resultado de la division es : " + Division);
	    
	}else{
	    
	    System.out.println("El resultado es 0 ya que uno de los 2 numeros es 0");
	    
	}
	    
	
    }
    
}
