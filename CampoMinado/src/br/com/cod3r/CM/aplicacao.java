package br.com.cod3r.CM;

import br.com.cod3r.CM.Modelo.Tabuleiro;
import br.com.cod3r.CM.Visao.TabuleiroConsole;

public class aplicacao {
public static void main(String[] args) {
	
	Tabuleiro tabuleiro = new Tabuleiro (6,6,6);
	new TabuleiroConsole(tabuleiro);
//	tabuleiro.abrir(3,3);
//	tabuleiro.alternarMacacao(4, 4);
//	tabuleiro.alternarMacacao(4, 5);
//	
//	System.out.println(tabuleiro);
//	
}
}
