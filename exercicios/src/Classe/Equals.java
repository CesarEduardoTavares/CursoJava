package Classe;

public class Equals {
	public static void main(String[] args) {
		
		
		Usuario u1 = new Usuario ();
		u1.Nome = "Pedro Silva";
		u1.Email = "pedro.silva@ezemail.com.br";
		
		Usuario u2 = new Usuario ();
		u2.Nome = "Pedro Silva";
		u2.Email = "pedro.silva@ezemail.com.br";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals (u2));
		
	}
// O HashCode vai ser abordado em outra aula !! Certo :)
}
