package Operadores;

public class DesafioAritmeticos {
public static void main(String[] args) {
	
double numA = Math.pow(6*(3+2), 2);
double denA = 3*2;
double numb = (1-5)*(2-7); 
double denb =2;
double superA =numA/denA;
double superB = Math.pow(numb/denb, 2);
double superior =Math.pow (superA- superB,3);
double inferior=Math.pow(10, 3);
double Resultado = superior / inferior ;
System.out.println("O resultado e "+ Resultado);


}}

