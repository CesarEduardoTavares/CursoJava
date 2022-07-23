package Controle;

import java.util.Scanner;

public class DesafioWhile {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	int QuantidadeDenotas = 0;
	double Nota = 0;
	double Total = 0;
	
	
	while ( Nota != -1 ){
	
	System.out.println("Informe a nota (ou -1 para sair): ");
	Nota =entrada.nextDouble();
	if (Nota <= 10  && Nota >= 0) { 
	Total += Nota ;
	QuantidadeDenotas++;
     }else if (Nota != -1) {
		
	
		System.out.println("Nota invalida !!! ;D");
	     
     }}
		
	
		
	
// Calcular a media
	double media = Total / QuantidadeDenotas ; 
	System.out.println("Media = " + media);
     


	entrada.close();
	
	}}
	
	
	
	
	
	
	


