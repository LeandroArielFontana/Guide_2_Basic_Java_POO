/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio007;

/**
 *
 * @author leand
 */

import java.util.Scanner;

public class PersonaService {
 
    public void crearPersona(Persona p1){
	
	Scanner Read = new Scanner(System.in).useDelimiter("\n");
	
	System.out.println("Digite el nombre de la persona");
	
	p1.setNombre(Read.next());
	
	System.out.println("Digite la edad de la persona");
	
	p1.setEdad(Read.nextInt());

	System.out.println("Digite el sexo de la persona ( H // M // O)");
	
	String sex = Read.next();
	
	if (sex.charAt(0) == 'H' || sex.charAt(0) == 'M' || sex.charAt(0) == 'O'){
	    
	   p1.setSexo(sex.charAt(0));
	    
	}else{
	    
	    System.out.println("Error - Mal ingresado el sexo");
	    
	}
	
	System.out.println("Digite el peso ( en Kg ) de la persona");
	
	p1.setPeso(Read.nextDouble());
	
	System.out.println("Digite la altura de la persona");
	
	p1.setAltura(Read.nextDouble());
	
    }
    
    public int calcularIMC(Persona p){
	
	final int pesoBajo = -1;
	
	final int pesoNormal = 0;
	
	final int pesoGrande = 1;
		
	double resultado;
	
	resultado = (p.getPeso() / Math.pow(p.getAltura(),2));
	
	if(resultado < 20){
	    
	    return pesoBajo;
	    
	}else if (resultado >= 20 && resultado <= 25){
	    
	    return pesoNormal;
	
	}else{
	    
	    return pesoGrande;
	    
	}
	
    }
    
    public boolean esMayorDeEdad(Persona p1){
	
	boolean Year = true;
	
	if(p1.getEdad() >= 18){
	    
	    Year = true;
	    
	}else{
	    
	    Year = false;
	    
	}
	
	return Year;
	
    }
}
