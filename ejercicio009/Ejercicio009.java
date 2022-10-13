package ejercicio009;

/**
 * Realizar una clase llamada Matemática que tenga como atributos dos números reales
 * con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
 * un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
 * usará el Math.random para generar los dos números y se guardaran en el objeto con
 * su respectivos set. Deberá además implementar los siguientes métodos:
 * <p>
 * • Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
 * valor (Listo)
 * <p>
 * • Método calcularPotencia() para calcular la potencia del mayor valor de la clase
 * elevado al menor número. Previamente se deben redondear ambos valores. (Listo)
 * <p>
 * • Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
 * Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */

import java.util.Scanner;

public class Ejercicio009 {
    private static Scanner read = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        programa();
    }

    public static void programa() {
        MatematicaService mService = new MatematicaService();
        Matematica matematica = new Matematica();

        matematica.setNum1((int) Math.floor(Math.random() * 10));
        matematica.setNum2((int) Math.floor(Math.random() * 10));

        System.out.println(matematica.getNum1());
        System.out.println(matematica.getNum2());

        mService.devolverMayor(matematica);

        System.out.println("El resultado de la potencia es : " + mService.calcularPotencia(matematica));
        System.out.println("La raiz cuadrada del menor numero es : " + mService.calculaRaiz(matematica));
    }
}
