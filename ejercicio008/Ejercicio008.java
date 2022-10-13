package ejercicio008;

/**
 * Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
 * String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
 * una frase que puede ser una palabra o varias palabras separadas por un espacio en
 * blanco y a través de los métodos set, se guardará la frase y la longitud de manera
 * automática según la longitud de la frase ingresada. Deberá además implementar los
 * siguientes métodos:
 * <p>
 * • Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
 * frase ingresada. (Listo)
 * <p>
 * • Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
 * por pantalla. (Listo)
 * <p>
 * Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
 * <p>
 * • Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
 * ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
 * frase, por ejemplo:
 * <p>
 * Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces. (Listo)
 * <p>
 * • Método compararLongitud(String frase), deberá comparar la longitud de la frase
 * que compone la clase con otra nueva frase ingresada por el usuario. (Listo)
 * <p>
 * • Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
 * con una nueva frase ingresada por el usuario y mostrar la frase resultante.
 * <p>
 * • Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
 * encuentren en la frase, por algún otro carácter seleccionado por el usuario y
 * mostrar la frase resultante.
 * <p>
 * • Método contiene(String letra), deberá comprobar si la frase contiene una letra que
 * ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */

import java.util.Scanner;

public class Ejercicio008 {

    private static Scanner read = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        CadenaService cService = new CadenaService();
        Cadena frase = new Cadena();

        String letra;
        String word = "";
        String word2 = "";
        String word3 = "";

        System.out.println("Digite por favor una frase o una palabra");
        word = read.next();

        frase.setFrase(word);
        frase.setLongitud(word.length());

//    System.out.println(cService.mostrarVocales(frase));
//    System.out.println(cService.invertirFrase(frase));
//    System.out.println("Digite la letra que desea buscar y ver cuantas veces se repite en la frase");
//    letra = read.next();
//    System.out.println("La letra : " + letra + " se repite " + cService.vecesRepetido(frase, letra) + " veces" );
//    System.out.println("Digite una frase para comparar cual es mas larga");
//    
//    word2 = read.next();
//    cService.compararLongitud(frase, word2);

        System.out.println("Digite una frase para unificar con la primera");
        word3 = read.next();

        System.out.println("La unificacion es : " + cService.unirFrases(frase, word3));
    }
}
