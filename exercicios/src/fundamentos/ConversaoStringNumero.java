package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
public static void main(String[] args) {
	String valor1= JOptionPane.showInputDialog("Digite o primerio numero: ");
	String valor2=JOptionPane.showInputDialog("Digite o segundo numero: ");
System.out.println(valor1+valor2);	// a plataforma nao faz a soma dos valores, ela apenas junta.

double numero1= Double.parseDouble(valor1) ;
double numero2= Double.parseDouble(valor2) ; // Duplicar Linha ( Crtl + Alt + Down)
double soma= numero1 + numero2 ;
System.out.println("A soma e "+ soma);
System.out.println("A media e "+ soma / 2);

	
	
	
	
	
}
}
