package oo.composicao;

public class CarroTeste {
	public static void main(String[] args) {
		
		Carro c1 =new Carro ();
		System.out.println(c1.estaLigado());
		
		c1.Ligar();
		System.out.println(c1.estaLigado());
		System.out.println(c1.motor.Giros());
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		System.out.println(c1.motor.Giros());
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();

		
		//Faltou encapsulamento!!!
		//c1.motor.FatorInjecao = -30;
		
		

		System.out.println(c1.motor.Giros());
	
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
