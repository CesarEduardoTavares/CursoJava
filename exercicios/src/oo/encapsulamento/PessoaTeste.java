package oo.encapsulamento;

public class PessoaTeste {
	public static void main(String[] args) {
		
	Pessoa p1 = new Pessoa("Pedro ", "Amoedo",-45);
	 p1.setIdade(50);  // altera
	
	System.out.println(p1.getIdade()); // ler
	System.out.println(p1); // chamando toString
		System.out.println(p1.getNomeCompleto());
		
	
	}

}
