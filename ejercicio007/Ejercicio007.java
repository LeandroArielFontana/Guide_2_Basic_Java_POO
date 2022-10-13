/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio007;

/**
 * Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
 * sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
 * otro atributo, puede hacerlo. Los métodos que se implementarán son:
 * <p>
 * • Un constructor por defecto. (Listo)
 * <p>
 * • Un constructor con todos los atributos como parámetro. (Listo)
 * <p>
 * • Métodos getters y setters de cada atributo. (Listo)
 * <p>
 * • Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
 * al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
 * Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
 * O. Si no es correcto se deberá mostrar un mensaje  (Listo)
 * <p>
 * • Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
 * kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
 * función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
 * (incluidos), significa que el peso está por debajo de su peso ideal y la función
 * devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
 * significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda
 * hacer uso de constantes para devolver estos valores. (Listo)
 * <p>
 * • Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
 * devuelve un booleano. (Listo)
 * <p>
 * A continuación, en la clase main hacer lo siguiente:
 * Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
 * los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
 * tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
 * persona es mayor de edad. (Listo)
 * <p>
 * Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
 * en distintas variables, para después en el main, calcular un porcentaje de esas 4
 * personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
 * encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
 * cuantos menores. (Listo)
 */
public class Ejercicio007 {

    public static void main(String[] args) {
        programa();
    }

    public static void mayorDeEdad(PersonaService pService, Persona p) {
        if (pService.esMayorDeEdad(p) == true) {
            System.out.println(" es mayor de edad");
        } else {
            System.out.println(" no es mayor de edad");
        }
    }

    public static void pesaje(PersonaService pService, Persona p, double sobrepeso, double pesoNormal, double bajoPeso) {
        switch (pService.calcularIMC(p)) {
            case -1:
                System.out.println("La persona esta por debajo de su peso ideal");
                bajoPeso++;
                break;
            case 0:
                System.out.println("La persona esta en su peso ideal");
                pesoNormal++;
                break;
            case 1:
                System.out.println("La persona esta con sobrepeso");
                sobrepeso++;
                break;
        }
    }

    public static void cuentaPeso(double sobrepeso, double pesoNormal, double bajoPeso) {
        double normal = 0;
        double bajo = 0;
        double alto = 0;

        normal = (double) pesoNormal / 4;
        bajo = (double) bajoPeso / 4;
        alto = (double) sobrepeso / 4;

        System.out.println("El porcentaje de las personas con bajo peso es de: " + bajo + "%");
        System.out.println("El porcentaje de las personas con peso normal es de: " + normal + "%");
        System.out.println("El porcentaje de las personas con sobrepeso es de: " + alto + "%");
    }

    public static void programa() {

        PersonaService pService = new PersonaService();
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();

        int mayorEdad = 0;
        int menorEdad = 0;
        double sobrepeso = 0.0;
        double pesoNormal = 0.0;
        double bajoPeso = 0.0;
        double resultadoMayor = 0.0;
        double resultadoMenor = 0.0;
        double resultadoSobrepeso = 0.0;
        double resultadoPesoBajo = 0.0;
        double resultadoPesoNormal = 0.0;

        System.out.println("-------PERSONA 1-------");
        pService.crearPersona(p1);

        System.out.println("-------PERSONA 2-------");
        pService.crearPersona(p2);

        System.out.println("-------PERSONA 3-------");
        pService.crearPersona(p3);

        System.out.println("-------PERSONA 4-------");
        pService.crearPersona(p4);

        System.out.println("----------");
        System.out.print(p1.getNombre());
        mayorDeEdad(pService, p1);

        System.out.println("----------");

        System.out.print(p2.getNombre());
        mayorDeEdad(pService, p2);

        System.out.println("----------");
        System.out.print(p3.getNombre());
        mayorDeEdad(pService, p3);

        System.out.println("----------");
        System.out.print(p4.getNombre());
        mayorDeEdad(pService, p4);

        System.out.println("----------");

        if (p1.getEdad() >= 18) {
            mayorEdad += 1;
        } else {
            menorEdad += 1;
        }

        if (p2.getEdad() >= 18) {
            mayorEdad += 1;
        } else {
            menorEdad += 1;
        }

        if (p3.getEdad() >= 18) {
            mayorEdad += 1;
        } else {
            menorEdad += 1;
        }

        if (p4.getEdad() >= 18) {
            mayorEdad += 1;
        } else {
            menorEdad += 1;
        }

        resultadoMayor = ((mayorEdad * 100) / 4);
        resultadoMenor = ((menorEdad * 100) / 4);

        System.out.println("El porcentaje de personas mayores es de: " + resultadoMayor + "%");
        System.out.println("El porcentaje de personas mayores es de: " + resultadoMenor + "%");

        System.out.println("----------");

        pesaje(pService, p1, sobrepeso, pesoNormal, bajoPeso);
        pesaje(pService, p2, sobrepeso, pesoNormal, bajoPeso);
        pesaje(pService, p3, sobrepeso, pesoNormal, bajoPeso);
        pesaje(pService, p4, sobrepeso, pesoNormal, bajoPeso);

        switch (pService.calcularIMC(p1)) {
            case -1:
                bajoPeso += 1;
                break;
            case 0:
                pesoNormal += 1;
                break;
            case 1:
                sobrepeso += 1;
                break;
        }

        switch (pService.calcularIMC(p2)) {
            case -1:
                bajoPeso += 1;
                break;
            case 0:
                pesoNormal += 1;
                break;
            case 1:
                sobrepeso += 1;
                break;
        }

        switch (pService.calcularIMC(p3)) {
            case -1:
                bajoPeso += 1;
                break;
            case 0:
                pesoNormal += 1;
                break;
            case 1:
                sobrepeso += 1;
                break;
        }

        switch (pService.calcularIMC(p4)) {
            case -1:
                bajoPeso += 1;
                break;
            case 0:
                pesoNormal += 1;
                break;
            case 1:
                sobrepeso += 1;
                break;
        }

        resultadoPesoBajo = (bajoPeso * 100) / 4;
        resultadoPesoNormal = (pesoNormal * 100) / 4;
        resultadoSobrepeso = (sobrepeso * 100) / 4;

        System.out.println("----------");
        System.out.println("El porcentaje de las personas con peso bajo es de: " + resultadoPesoBajo + "%");
        System.out.println("El porcentaje de las personas con peso nromal es de: " + resultadoPesoNormal + "%");
        System.out.println("El porcentaje de las personas con sobrepeso es de: " + resultadoSobrepeso + "%");
    }
}
