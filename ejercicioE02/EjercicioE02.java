/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioE02;

/**
 *
 * @author Roxana
 */
public class EjercicioE02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//  Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
//  atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
//  usando un método crearPuntos() que le pide al usuario los dos números y los ingresa
//  en los atributos del objeto. Después, a través de otro método calcular y devolver la
//  distancia que existe entre los dos puntos que existen en la clase Puntos.

    PuntoService pService = new PuntoService();

    Punto p1 = new Punto();

    Punto p2 = new Punto();
    
    pService.crearPuntos(p1);
    
    pService.crearPuntos(p2);
    
        System.out.println("La distancia sera de : " + pService.diferenciaPuntos(p1, p2));
    
    
    }
    
}
