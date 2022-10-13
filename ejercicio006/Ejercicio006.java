package ejercicio006;

/**
 * Programa Nespresso. Desarrolle una clase Cafetera con los atributos
 * capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
 * cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
 * menos, los siguientes métodos:
 * <p>
 * • Constructor predeterminado o vacío (Listo)
 * <p>
 * • Constructor con la capacidad máxima y la cantidad actual (Listo)
 * <p>
 * • Métodos getters y setters. (Listo)
 * <p>
 * • Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
 * máxima. (Listo)
 * <p>
 * • Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
 * tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
 * cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
 * método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
 * cuanto quedó la taza. (Listo)
 * <p>
 * • Método vaciarCafetera(): pone la cantidad de café actual en cero. (Listo)
 * <p>
 * • Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
 * recibe y se añade a la cafetera la cantidad de café indicada.
 */

import java.util.Scanner;

public class Ejercicio006 {

    private static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        Cafetera cafetera = new Cafetera();

        CafeteraService cafecito = new CafeteraService();
        cafecito.llenarCafetera(cafetera);

        System.out.println("Digite el tamaño de la taza ( en ml ) para llenar");
        cafecito.servirTaza(read.nextInt(), cafetera);

        System.out.println("Digite cuanto cafe desea agregar");
        cafecito.agregarCafe(read.nextInt(), cafetera);
    }
}
