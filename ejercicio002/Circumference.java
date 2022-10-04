package ejercicio002;

import java.util.Scanner;

public class Circumference {
    private Double radio;
    private Scanner read = new Scanner(System.in);

    public Circumference(Double radio) {
        this.radio = radio;
    }

    public Circumference() {
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public void createCircumference(Circumference circumference) {
        System.out.println("Digite el radio de la circunferencia");
        circumference.setRadio(read.nextDouble());
    }

    public Double showArea(Double radio) {
        return Math.PI * radio;
    }

    public Double showPerimeter(Double radio) {
        return Math.PI * 2 * radio;
    }
}
