/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio005;

/**
 *
 * @author leandro
 */

import java.util.Scanner;

public class BankAccountService {
    
    public void createBankAccount(BankAccount Account1){
	
	Scanner Read = new Scanner(System.in);
	
	System.out.println("Digite un numero de cuenta por favor");
	
	Account1.setAccountNumber(Read.nextInt());
	
	System.out.println("Digite su DNI por favor");
	
	Account1.setDniNumber(Read.nextInt());
	
	System.out.println("Digite el saldo para crear la cuenta");
	
	Account1.setCurrentBalance(Read.nextDouble());
    }
    
    public Double entry(Double Entry, BankAccount cuenta){
	
	cuenta.setCurrentBalance(Entry + cuenta.getCurrentBalance());
	
	return cuenta.getCurrentBalance();
    }
    
    public Double extraction(Double Extraction, BankAccount cuenta){
	
	cuenta.setCurrentBalance(cuenta.getCurrentBalance() - Extraction);
	
	return cuenta.getCurrentBalance();
	
    }
    
    public void fastExtraction(Double fastExtraction, BankAccount cuenta){
	
	if (fastExtraction <= (cuenta.getCurrentBalance() * 0.20)){
	    
	    cuenta.setCurrentBalance(cuenta.getCurrentBalance() - fastExtraction);
	    
	    System.out.println("Su saldo actual es : " + cuenta.getCurrentBalance());
	    	    
	}else{
	    
	    System.out.println("Usted ha ingresado mas del 20% de su cuenta, por lo tanto no puede retirar dinero");
	    
	}
	
    }
    
    public Double consult(BankAccount cuenta){
	
	double consulta = cuenta.getCurrentBalance();
	
	return consulta;
	
    }
    
    public void data(BankAccount cuenta){
	
	System.out.println("Su numero de cuenta es : " + cuenta.getAccountNumber());
	
	System.out.println("");
	
	System.out.println("Su DNI es : " + cuenta.getDniNumber());
	
	System.out.println("");

	System.out.println("Su saldo actual es de : $ " + cuenta.getCurrentBalance());
	
    }
    
}
