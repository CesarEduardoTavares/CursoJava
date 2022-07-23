package fundamentos;

public class Tipostring {
public static void main(String[] args) {
	
	System.out.println("Ola Pessoal".charAt(2));
	String s ="Boa Tarde".toUpperCase();
	s = "Bom dia";
	System.out.println(s.concat("!!!"));
	System.out.println(s+ "!!!");

	var Nome = "Pedro";
	var Sobrenome = "Santos";
	var Idade = "33";
	var Salario = "R$" + 12345.987;
	System.out.println("Nome: "+Nome + "\nSobrenome: " + Sobrenome + "\nIdade: " + Idade + "\nSalario: "+ Salario + "\n\n" );
	
	
	//System.out.printf(" O Senhor %s %s tem %d anos e ganha R$%.2f.", Nome ,Sobrenome ,Idade ,Salario) ;
	
	
}}
