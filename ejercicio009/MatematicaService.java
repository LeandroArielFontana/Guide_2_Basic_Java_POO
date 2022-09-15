/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio009;

/**
 *
 * @author Roxana
 */
public class MatematicaService {
    
    public void devolverMayor(Matematica matematica){
        
        if(matematica.getNum1() > matematica.getNum2()){
            
            System.out.println("El numero 1 ( " + matematica.getNum1() + " ) es mas grande que el numero 2 ( " + matematica.getNum2() + " ) " );
            
        }else if(matematica.getNum1() < matematica.getNum2()){
            
            System.out.println("El numero 1 ( " + matematica.getNum1() + " ) es mas chico que el numero 2 ( " + matematica.getNum2() + " ) " );
            
        }else{
            
            System.out.println("Los numeros son iguales");
            
        }
              
    }
    
    public int calcularPotencia(Matematica matematica){
        
        int resultado = 0;
        
        if(matematica.getNum1() > matematica.getNum2()){
            
          resultado = (int) Math.pow(matematica.getNum1(), matematica.getNum2());
            
        }else if(matematica.getNum1() < matematica.getNum2()){
             
            resultado = (int) Math.pow(matematica.getNum2(), matematica.getNum1());
            
        }else{
            
           resultado = (int) Math.pow(matematica.getNum1(), matematica.getNum2());
            
        }
        
        return resultado;
        
    }
    
    public double calculaRaiz(Matematica matematica){
        
        double resultado = 0;
        
        if(matematica.getNum1() >= matematica.getNum2()){
            
            resultado = (double)(Math.abs(Math.sqrt((matematica.getNum2()*1.0))));
            
        }else if(matematica.getNum1() < matematica.getNum2()){
            
            resultado = (double)(Math.abs(Math.sqrt((matematica.getNum1()*1.0))));
            
        }
        
        return resultado;
    }
    
}
