package oo.composicao;

public class Motor {
	boolean Ligado = false;
	double FatorInjecao = 1;
	
	
	
	int Giros() {
		if (!Ligado) {
			return 0;
		} 
		else {
		return (int) Math.round(FatorInjecao * 3000);
	

		}
}
}