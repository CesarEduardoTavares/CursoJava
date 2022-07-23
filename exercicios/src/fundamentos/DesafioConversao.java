package fundamentos;


import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println(" Digite seu salario de Janeiro ");
	 String Janeiro = entrada.nextLine().replace (",",".");
	 System.out.println(" Digite seu salario de Fevereiro ");
	 String  Fevereiro = entrada.nextLine().replace (",",".");
	 System.out.println(" Digite seu salario de Marco ");
	 String  Marco = entrada.nextLine().replace (",","."); 
	 double numero1= Double.parseDouble(Janeiro) ;
	 double numero2= Double.parseDouble(Fevereiro) ;
	 double numero3= Double.parseDouble(Marco) ;
	 double soma= numero1 + numero2 + numero3;
	 
	 System.out.println("A soma e "+ soma);
	 System.out.println("A media e "+ soma / 3);
	
	 Locale.setDefault(new Locale("en", "US"));
	 
	 // double numero1=double.parse
	 
	 
	 entrada.close();
}}

