package oo.pessoaPolimorfismo;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.65);
		
		Arroz ingrediente1 =new Arroz(0.25);
		Feijao ingrediente2 =new Feijao (0.100);
		
		
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		
		
		System.out.println(convidado.getPeso());
		
		Sorvete ingrediente3 =new Sorvete (0.25);
		convidado.comer(ingrediente3);
		
		System.out.println(convidado.getPeso());
	}

}
