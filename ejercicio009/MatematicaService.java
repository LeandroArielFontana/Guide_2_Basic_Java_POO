package ejercicio009;

public class MatematicaService {

    public void devolverMayor(Matematica matematica) {
        if (matematica.getNum1() > matematica.getNum2()) {
            System.out.println("El numero 1 ( " + matematica.getNum1() + " ) es mas grande que el numero 2 ( " + matematica.getNum2() + " ) ");
        } else if (matematica.getNum1() < matematica.getNum2()) {
            System.out.println("El numero 1 ( " + matematica.getNum1() + " ) es mas chico que el numero 2 ( " + matematica.getNum2() + " ) ");
        } else {
            System.out.println("Los numeros son iguales");
        }
    }

    public int calcularPotencia(Matematica matematica) {
        if (matematica.getNum1() > matematica.getNum2()) {
            return ((int) Math.pow(matematica.getNum1(), matematica.getNum2()));
        } else if (matematica.getNum1() < matematica.getNum2()) {
            return ((int) Math.pow(matematica.getNum2(), matematica.getNum1()));
        } else {
            return ((int) Math.pow(matematica.getNum1(), matematica.getNum2()));
        }
    }

    public double calculaRaiz(Matematica matematica) {
        double resultado = 0;

        if (matematica.getNum1() >= matematica.getNum2()) {
            resultado = ((double) (Math.abs(Math.sqrt((matematica.getNum2() * 1.0)))));
        } else if (matematica.getNum1() < matematica.getNum2()) {
            resultado = ((double) (Math.abs(Math.sqrt((matematica.getNum1() * 1.0)))));
        }

        return resultado;
    }
}
