package Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {public static void main(String[] args) {
	Map<Integer , String> Usuarios = new HashMap<>();
	
	
	Usuarios.put (1,"Roberto");
	Usuarios.put (20,"Ricardo");
	Usuarios.put (3,"Rafaela");
	Usuarios.put (4,"Rebeca");
	System.out.println(Usuarios.size());
	System.out.println(Usuarios.isEmpty());
	
	System.out.println(Usuarios.keySet());
	System.out.println(Usuarios.values());
	System.out.println(Usuarios.entrySet());
	
	System.out.println(Usuarios.containsKey(20));
	System.out.println(Usuarios.containsValue("Rebeca"));
	
	System.out.println(Usuarios.get(20));
	
	for (int chave: Usuarios.keySet()) {
		System.out.println(chave);
	}
		for (String valor: Usuarios.values()) {
			System.out.println(valor);
	}
		for (Entry<Integer , String> registro : Usuarios.entrySet()) {
			System.out.print(registro.getKey()+"---> ");
			System.out.println(registro.getValue());
			
		}
	
	
	
}

}
