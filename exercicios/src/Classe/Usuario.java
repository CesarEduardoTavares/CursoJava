package Classe;

public class Usuario {

	String Nome;
	String Email ;
	
	public boolean equals(Object objeto) {
		Usuario outro  = (Usuario) objeto;
		boolean nomeIgual = outro.Nome.equals(this.Nome);
		boolean EmailIgual = outro.Email.equals(this.Email);
		return nomeIgual && EmailIgual;
		
		
		}}
		
