package Operadores;



public class DesafioLogicos {
	public static void main(String[] args) {
		 // Traballho na terca True or false
		// Traballho na Quinta True or False
		// Quem trabalhou na terca e na quinta vai comprar uma tv de 50pol e Tomar soverte,
		//Quem trabalhou so um dia vai comprar uma tv de 32pol e tomar sorvete.
		//Usar regras de True ou False !, ^,|,&&
		
		boolean trabalho1 = true;
		boolean trabalho2= false ;
		
		boolean tv50 = trabalho1 && trabalho2; // aceitar os dois 
		boolean tv32 =trabalho1 ^ trabalho2; // ou um ou outro
		boolean sorvete =trabalho1 || trabalho2 ; //vai nas duas opcoes 
		
		System.out.println("Comprou a TV de 50pol " + tv50);
		System.out.println("Comprou a tv de 32pol " +tv32);
		System.out.println("Tomou Sorvete " +sorvete);  
		System.out.println("Ficou mais saudavel " +!sorvete); // negacao 
		
	}

}
