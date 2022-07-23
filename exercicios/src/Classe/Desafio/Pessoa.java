package Classe.Desafio;

public class Pessoa {
	
	String nome;
	Double peso;
	Pessoa (String nome,double peso){
		this.nome = nome;
		this.peso = peso;
		
	}
	void comer (Comida Comida) {
		if (Comida != null){
			this.peso += Comida.peso;
		}
	}
	String apresenta () {
		return "Ola,sou o " + nome + " e tenho "+ peso + " Kilos ";
	}

}
