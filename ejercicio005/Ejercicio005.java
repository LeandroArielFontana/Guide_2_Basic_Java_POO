/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio005;

/**
 *
 * @author leand
 */

import java.util.Scanner;

public class Ejercicio005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	
//  Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
//  atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
//  operaciones asociadas a dicha clase son:

//• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés. (listo)

//• Agregar los métodos getters y setters correspondientes (Listo)

//• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario. (Listo)

//• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
//ingresar y se la sumara a saldo actual. (Listo)

//• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
//se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
//pondrá el saldo actual en 0. (Listo)

//• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
//que el usuario no saque más del 20%. (Listo)

//• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta. (Listo)

//• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    
    bank();

    }
    
    public static void bank(){
    
    Scanner Read = new Scanner (System.in);
    
    BankAccountService bankAccountService = new BankAccountService();
    
    BankAccount cuenta = new BankAccount();
    
    bankAccountService.createBankAccount(cuenta);
    
	switch(menu()){

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
    
    public static Integer menu(){
	
	Scanner Read = new Scanner(System.in);
	
	System.out.println("Digite por favor la opcion a la que desea ingresar");
	
	System.out.println("\b1 - Ingresar Dinero");
	
	System.out.println("\b2 - Extraer Dinero ");
    
	System.out.println("\b3 - Extraccion Rapida");
	
	System.out.println("\b4 - Consultar Saldo");
	
	System.out.println("\b5 - Consultar Datos");
	
	int Opcion = Read.nextInt();
	
	return Opcion;
	
    }
        
    public static void entrada(BankAccountService bankAccountService, BankAccount cuenta){

    Scanner Read = new Scanner(System.in);	
	
    System.out.println("Digite el saldo a ingresar");
    
    double ingreso = Read.nextDouble();					
    
    System.out.println(bankAccountService.entry(ingreso, cuenta));
	
    }
    
    public static void retiro(BankAccountService bankAccountService, BankAccount cuenta){

    Scanner Read = new Scanner(System.in);
	
    System.out.println("Digite el saldo a retirar");
    
    double extraccion = Read.nextDouble();
    
    System.out.println(bankAccountService.extraction(extraccion, cuenta));
	
    }
    
    public static void extraccionRapida(BankAccountService bankAccountService, BankAccount cuenta){
	
    Scanner Read = new Scanner(System.in);
	
    System.out.println("Digite el saldo a extraer ( Recuerde que solo un 20 % del total )");
    
    double fastExtraction = Read.nextDouble();
    
    bankAccountService.fastExtraction(fastExtraction, cuenta);
	
    }
    
    public static void consulta(BankAccountService bankAccountService, BankAccount cuenta){
	
    System.out.println("Su saldo es: " + bankAccountService.consult(cuenta));
	
    }
    
    public static void dataBase(BankAccountService bankAccountService, BankAccount cuenta){
	
    System.out.println("CARGANDO...");
    
    bankAccountService.data(cuenta);
	
    }
    
}
