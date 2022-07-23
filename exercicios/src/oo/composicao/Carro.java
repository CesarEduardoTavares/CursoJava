package oo.composicao;

public class Carro {
	
	Motor motor = new Motor();
	void acelerar() {
		if (motor.FatorInjecao < 2.6) { 
		motor.FatorInjecao += 0.4 ;
	}}
	void frear () {
		if (motor.FatorInjecao > 0.5) {
		motor.FatorInjecao -= 0.4;
	}}
	void Ligar () {
		motor.Ligado = true ;
	}
	void Desligar () {
		motor.Ligado = false;
	}
	boolean estaLigado () {
		return motor.Ligado;
	}
	}
	
	
	
	
	
	
	


