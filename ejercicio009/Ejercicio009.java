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

import java.util.Scanner;

public class Ejercicio009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//Realizar una clase llamada Matemática que tenga como atributos dos números reales
//con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
//un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
//usará el Math.random para generar los dos números y se guardaran en el objeto con
//su respectivos set. Deberá además implementar los siguientes métodos:

//• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
//valor (Listo)

//• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
//elevado al menor número. Previamente se deben redondear ambos valores. (Listo)

//• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

    Programa();

    }
    
    public static void Programa(){
    
    Scanner Read = new Scanner(System.in).useDelimiter("\n");
    
    MatematicaService mService = new MatematicaService();
    
    Matematica matematica = new Matematica();

    matematica.setNum1((int)Math.floor(Math.random() * 10));

    matematica.setNum2((int)Math.floor(Math.random() * 10));

        System.out.println(matematica.getNum1());
        
        System.out.println(matematica.getNum2());
        
        mService.devolverMayor(matematica);

        System.out.println("El resultado de la potencia es : " + mService.calcularPotencia(matematica) );
    
        System.out.println("La raiz cuadrada del menor numero es : " + mService.calculaRaiz(matematica));

    }
    
}
