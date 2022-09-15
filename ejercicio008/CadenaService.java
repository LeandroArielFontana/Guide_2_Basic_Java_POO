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
public class CadenaService {
    
    public int mostrarVocales(Cadena frase){
	
	int Count = 0;
	
	String palabra = frase.getFrase().toUpperCase();
	
	for (int i = 0; i < palabra.length(); i++) {
	    
	    if(palabra.charAt(i) == 'A' || palabra.charAt(i) == 'E' || palabra.charAt(i) == 'I' || palabra.charAt(i) == 'O' || palabra.charAt(i) == 'U') {
		
		Count++;
		
	    }
	    
	}
	
	return Count;

    }
    
    public String invertirFrase(Cadena frase){
	
	String Aux = "";
	
	String palabra = frase.getFrase();
	
	for (int i = (frase.getFrase().length() - 1); i >= 0; i--) {
	    
	    Aux += palabra.charAt(i);
	    
	}
	
	return Aux;
	
    }
    
    public int vecesRepetido(Cadena frase, String letra){
	
	int Count = 0;
	
	String palabra = frase.getFrase().toUpperCase();
	
	for (int i = 0; i < palabra.length(); i++) {
	    
	    if(palabra.charAt(i) == letra.toUpperCase().charAt(0)) {
		
		Count++;
		
	    }
	    
	}
	
	return Count;
	
    }
    
    public void compararLongitud(Cadena frase, String word2){
	
	if (frase.getFrase().length() < word2.length()){
	    
	    System.out.println("La ultima frase ingresada es mas grande que la del objeto");
	    
	} else if(frase.getFrase().length() > word2.length()){
	     
	    System.out.println("La ultima frase ingresada es mas chica que la del objeto");
	    
	}else{
	    
	    System.out.println("La ultima frase ingresada tiene el mismo tamaño que la del objeto ");
	    
	}
	
    }
    
    public String unirFrases(Cadena frase, String word3){
	
	String finalWord = "";
	
	finalWord = frase.getFrase() + word3;
	
	return finalWord;
	
	
    }
    
}
