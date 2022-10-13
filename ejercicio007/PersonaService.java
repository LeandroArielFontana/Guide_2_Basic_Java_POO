package ejercicio007;

import java.util.Scanner;

public class PersonaService {

    private static Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void crearPersona(Persona p1) {
        System.out.println("Digite el nombre de la persona");
        p1.setNombre(read.next());

        System.out.println("Digite la edad de la persona");
        p1.setEdad(read.nextInt());

        System.out.println("Digite el sexo de la persona ( H // M // O)");
        String sex = read.next();

        if (sex.charAt(0) == 'H' || sex.charAt(0) == 'M' || sex.charAt(0) == 'O') {
            p1.setSexo(sex.charAt(0));
        } else {
            System.out.println("Error - Mal ingresado el sexo");
        }

        System.out.println("Digite el peso ( en Kg ) de la persona");
        p1.setPeso(read.nextDouble());

        System.out.println("Digite la altura de la persona");
        p1.setAltura(read.nextDouble());
    }

    public int calcularIMC(Persona p) {
        final int pesoBajo = -1;
        final int pesoNormal = 0;
        final int pesoGrande = 1;
        double resultado;

        resultado = (p.getPeso() / Math.pow(p.getAltura(), 2));

        if (resultado < 20) {
            return pesoBajo;
        } else if (resultado >= 20 && resultado <= 25) {
            return pesoNormal;
        } else {
            return pesoGrande;
        }
    }

    public boolean esMayorDeEdad(Persona p1) {
        boolean year;

        if (p1.getEdad() >= 18) {
            year = true;
        } else {
            year = false;
        }

        return year;
    }
}
