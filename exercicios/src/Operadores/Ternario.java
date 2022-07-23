package Operadores;

public class Ternario {
	public static void main(String[] args) {
		double media = 5.6;
		String ResultadoParcial = media >= 5.0 ? "Recuperacao" : "Reprovado " ;
		String ResultadoFinal = media >= 7.0 ? "Aprovado" : ResultadoParcial;	
		System.out.println("O aluno esta " + ResultadoFinal);
		
		double Nota =7.3;
		boolean Bomcomportamento = true;
		boolean passouPorMedia = Nota >= 7;
		boolean temDesconto = Bomcomportamento && passouPorMedia ;
		String resultado = temDesconto ? "sim" : "nao";
		System.out.println(" Tem desconto " + resultado );
	}

}
