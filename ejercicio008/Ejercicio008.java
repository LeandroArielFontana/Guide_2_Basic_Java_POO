/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio008;

/**
 *
 * @author leand
 */

import java.util.Scanner;

public class Ejercicio008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//	Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
//	String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
//	una frase que puede ser una palabra o varias palabras separadas por un espacio en
//	blanco y a través de los métodos set, se guardará la frase y la longitud de manera
//	automática según la longitud de la frase ingresada. Deberá además implementar los
//	siguientes métodos:

//• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
//frase ingresada. (Listo)

//• Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
//por pantalla. (Listo)

//	Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".

//• Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
//ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
//frase, por ejemplo: 

//	Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces. (Listo)

//• Método compararLongitud(String frase), deberá comparar la longitud de la frase
//que compone la clase con otra nueva frase ingresada por el usuario. (Listo)

//• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
//con una nueva frase ingresada por el usuario y mostrar la frase resultante. 

//• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y
//mostrar la frase resultante.

//• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
//ingresa el usuario y devuelve verdadero si la contiene y falso si no.
   
    Scanner Read = new Scanner(System.in).useDelimiter("\n");

    CadenaService cService = new CadenaService();
    
    Cadena frase = new Cadena();
    
    String letra;
    
    String word = "";
    
    String word2 = "";
    
    String word3 = "";
    
    System.out.println("Digite por favor una frase o una palabra");
    
    word = Read.next();
    
    frase.setFrase(word);
    
    frase.setLongitud(word.length());
    
//   System.out.println(cService.mostrarVocales(frase));
    
//    System.out.println(cService.invertirFrase(frase));

//    System.out.println("Digite la letra que desea buscar y ver cuantas veces se repite en la frase");
//    
//    letra = Read.next();
//    
//    System.out.println("La letra : " + letra + " se repite " + cService.vecesRepetido(frase, letra) + " veces" );
//    
//    System.out.println("Digite una frase para comparar cual es mas larga");
//    
//    word2 = Read.next();
//    
//    cService.compararLongitud(frase, word2);
    
    System.out.println("Digite una frase para unificar con la primera");
    
    word3 = Read.next();
    
    System.out.println("La unificacion es : " + cService.unirFrases(frase, word3));
    }
    
}
