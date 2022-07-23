package fundamentos;


import java.util.Locale;
import java.util.Scanner;

public class DesafioCalculadora { public static void main(String[] args) {
	
	// Fazer uma calculadora
	//ler numero 1
	// Ler numero 2
	// + ,- , *, ou / ou %
	// Nao opera numero com casa flutuante com ponto. Virgula vai.
	
	Scanner entrada = new Scanner(System.in) ;
	
	System.out.print(" Digite um numero ");
	 double num1 = entrada.nextDouble();
	 System.out.print(" Digite outro numero ");
	 double  num2 = entrada.nextDouble();
	 System.out.print(" Qual a operacao ? ");
	 String op = entrada.next();
	 
	 
	 
	 
	 double resultado ="+".equals(op)? num1 + num2 : 0 ;
	 resultado ="-".equals(op)? num1 - num2 : resultado ;
	 resultado ="*".equals(op)? num1 * num2 : resultado ;
	 resultado ="/".equals(op)? num1 / num2 : resultado ;
	 resultado ="%".equals(op)? num1 % num2 : resultado ;
	 System.out.printf(" %.2f  %s  %.2f = %.2f",num1 , op , num2 , resultado);
	 System.out.println("O valor e "+ resultado);

	
	 Locale.setDefault(new Locale("en", "US"));
	 
	
	
	
	
	entrada.close();
	
	
	
	
	
	
}

}
