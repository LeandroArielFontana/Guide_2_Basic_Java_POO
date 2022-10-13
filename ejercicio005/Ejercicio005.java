package ejercicio005;

/**
 * Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
 * atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
 * operaciones asociadas a dicha clase son:
 * <p>
 * • Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés. (listo)
 * <p>
 * • Agregar los métodos getters y setters correspondientes (Listo)
 * <p>
 * • Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario. (Listo)
 * <p>
 * • Método ingresar(double ingreso): el método recibe una cantidad de dinero a
 * ingresar y se la sumara a saldo actual. (Listo)
 * <p>
 * • Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
 * se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
 * pondrá el saldo actual en 0. (Listo)
 * <p>
 * • Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
 * que el usuario no saque más del 20%. (Listo)
 * <p>
 * • Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta. (Listo)
 * <p>
 * • Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */

import java.util.Scanner;

public class Ejercicio005 {
    private static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        bank();
    }

    public static void bank() {
        BankAccountService bankAccountService = new BankAccountService();
        BankAccount cuenta = new BankAccount();
        bankAccountService.createBankAccount(cuenta);

        switch (menu()) {
            case 1:
                entrada(bankAccountService, cuenta);
                break;
            case 2:
                retiro(bankAccountService, cuenta);
                break;
            case 3:
                extraccionRapida(bankAccountService, cuenta);
                break;
            case 4:
                consulta(bankAccountService, cuenta);
                break;
            case 5:
                dataBase(bankAccountService, cuenta);
                break;
        }
    }

    public static Integer menu() {
        System.out.println("Digite por favor la opcion a la que desea ingresar");
        System.out.println("\b1 - Ingresar Dinero");
        System.out.println("\b2 - Extraer Dinero ");
        System.out.println("\b3 - Extraccion Rapida");
        System.out.println("\b4 - Consultar Saldo");
        System.out.println("\b5 - Consultar Datos");
        return read.nextInt();
    }

    public static void entrada(BankAccountService bankAccountService, BankAccount cuenta) {
        System.out.println("Digite el saldo a ingresar");
        System.out.println(bankAccountService.entry(read.nextDouble(), cuenta));
    }

    public static void retiro(BankAccountService bankAccountService, BankAccount cuenta) {
        System.out.println("Digite el saldo a retirar");
        System.out.println(bankAccountService.extraction(read.nextDouble(), cuenta));
    }

    public static void extraccionRapida(BankAccountService bankAccountService, BankAccount cuenta) {
        System.out.println("Digite el saldo a extraer ( Recuerde que solo un 20 % del total )");
        bankAccountService.fastExtraction(read.nextDouble(), cuenta);
    }

    public static void consulta(BankAccountService bankAccountService, BankAccount cuenta) {
        System.out.println("Su saldo es: " + bankAccountService.consult(cuenta));
    }

    public static void dataBase(BankAccountService bankAccountService, BankAccount cuenta) {
        System.out.println("CARGANDO...");
        bankAccountService.data(cuenta);
    }
}
