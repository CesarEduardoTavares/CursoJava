package Controle;

import java.util.Scanner;

public class desafioDaSemana { public static void main(String[] args) {
	
	
	
	
	// quarta -->4
	//Domingo --> 1
	// terca --> 3 ...
	
	Scanner entrada = new Scanner(System.in);
	System.out.print("Digite o nome do dia: ");
	String dia  = entrada.next();
	//if (dia == "domingo")
	//{System.out.println(1);
	//if (dia.equalsIgnoreCase("domingo")) { }//equalsignoreCase significa pra nao fazer diferenca em minusculo ou maiusculo
		
	if ("domingo".equalsIgnoreCase(dia)) {System.out.println(1);}else if ("segunda".equalsIgnoreCase(dia)) {System.out.println(2);}
	else if ("terca".equalsIgnoreCase(dia)) {System.out.println(3);}
	else if ("quarta".equalsIgnoreCase(dia)) {System.out.println(4);}
	else if ("quinta".equalsIgnoreCase(dia)) {System.out.println(5);}
	else if ("sexta".equalsIgnoreCase(dia)) {System.out.println(6);}
	else if ("sabado".equalsIgnoreCase(dia)) {System.out.println(7);}
	 else { System.out.println("Dia invalido");
	
		
	
		
	
	 
		
	
		
	
	
	
	
	
	
	
	
	entrada.close();
	
	}}}
	
	
	
	
	
	
	



