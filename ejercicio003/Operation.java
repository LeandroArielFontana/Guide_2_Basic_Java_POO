package ejercicio003;

import java.util.Scanner;

public class Operation {

    private Integer numberOne;
    private Integer numberTwo;

    public Operation(Integer numberOne, Integer number2) {
        this.numberOne = numberOne;
        this.numberTwo = number2;
    }

    public Operation() {
    }

    public Integer getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(Integer numberOne) {
        this.numberOne = numberOne;
    }

    public Integer getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(Integer numberTwo) {
        this.numberTwo = numberTwo;
    }

    public void createOperation() {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite el 1er Numero");
        this.numberOne = read.nextInt();

        System.out.println("Digite el 2do Numero");
        this.numberTwo = read.nextInt();
    }

    public Double addition() {
        return (double)(numberOne + numberTwo);
    }

    public Double sustraction() {
        return (double)(numberOne - numberTwo);
    }

    public Double multiplication() {
        if (numberOne != 0 || numberTwo != 0) {
            return (double) (numberOne * numberTwo);
        } else {
            return 0.0;
        }
    }

    public void division() {
        if (numberOne != 0 || numberTwo != 0) {
            System.out.println("El resultado de la division es : " + (numberOne / numberTwo));
        } else {
            System.out.println("El resultado es 0 ya que uno de los 2 numeros es 0");
        }
    }
}
