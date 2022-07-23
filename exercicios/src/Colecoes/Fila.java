package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {public static void main(String[] args) {
	
	Queue<String> fila = new LinkedList<>();
	
	
	//Offer e add = Adicionam elementos na lista
	// A diferenca eh o comportamento quando a fila esta cheia!
	fila.add("Ana");
	fila.offer("Bia");
	fila.add("Carlos");
	fila.offer("Daniel");
	fila.add("Rafaela");
	fila.offer("Gui");
	System.out.println(fila.peek());
	System.out.println(fila.peek());
	System.out.println(fila.element());
}


}
