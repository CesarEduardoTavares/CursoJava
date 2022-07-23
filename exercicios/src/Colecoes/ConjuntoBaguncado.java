package Colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto  = new HashSet();
		conjunto.add (1.2);                  // double
		conjunto.add (true);                 // Boolean
		conjunto.add("Teste");               //String
		conjunto.add(1);                     // Inteiro - int
		conjunto.add('x');                    //caracter
		
		System.out.println("Tamanho e : " + conjunto.size());
		
		conjunto.add("teste"); 
		
		System.out.println("Tamanho e : " + conjunto.size());
		
		System.out.println(conjunto.remove ("Teste"));
		System.out.println(conjunto.remove ("teste"));
		System.out.println(conjunto.remove ('x'));
		
		System.out.println("Tamanho e : " + conjunto.size());
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains("teste"));
		System.out.println(conjunto.contains('x'));
		
		
	}

}
