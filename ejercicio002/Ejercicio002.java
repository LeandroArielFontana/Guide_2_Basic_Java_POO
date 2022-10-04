package ejercicio002;

/**
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
 * de tipo real. A continuación, se deben crear los siguientes métodos:
 * a) Método constructor que inicialice el radio pasado como parámetro.
 * b) Métodos get y set para el atributo radio de la clase Circunferencia.
 * c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
 * del objeto.
 * d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
 * e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */

import java.util.Scanner;

public class Ejercicio002 {

    public static void main(String[] args) {
        Circumference circumferenceTest = new Circumference();
        Circumference circumference = new Circumference();
        circumferenceTest.createCircumference(circumference);
        System.out.println("El area es de: " + circumference.showArea(circumference.getRadio()));
        System.out.println("El perimetro es de: " + circumference.showPerimeter(circumference.getRadio()));
    }
}
