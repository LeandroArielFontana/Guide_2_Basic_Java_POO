package ejercicio003;

public class Ejercicio003 {

    public static void main(String[] args) {
        Operation operation = new Operation();
        operation.createOperation();

        System.out.println("La sumatoria es: " + operation.addition());
        System.out.println("La resta es: " + operation.sustraction());
        System.out.println("La multiplicacion es: " + operation.multiplication());
        operation.division();
    }

}
