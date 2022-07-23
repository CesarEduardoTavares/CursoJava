package Classe;



public class DesafioClasseVsIstancia1 {
	
	
	String nome;
	Double preco;
	static double desconto =0.25;
	
	DesafioClasseVsIstancia1() {
		}
	DesafioClasseVsIstancia1 (String nomeinicial, double precoinicial ){
		nome =nomeinicial;
		preco = precoinicial;
	}
	
	double PrecoComDesconto () {
		return preco *(1-desconto);
	}
	double PrecoComDesconto (double descontodoGerente) {
		return preco * (1 - desconto + descontodoGerente);
	}
	
	

}
