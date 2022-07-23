package modelo.muitosPraMuitos.teste;

import Infra.DAO;
import modelo.muitosPraMuitos.Ator;
import modelo.muitosPraMuitos.Filme;

public class NovoFilmeAtor {
	public static void main(String[] args) {

		Filme filmeA = new Filme("Star Wars Ep 4", 8.9);
		Filme filmeB = new Filme("O Fugitivo", 8.1);

		Ator atorA = new Ator("Harison Ford");
		Ator atrizB = new Ator("Carrie Fisher");

		filmeA.adiconarAtor(atorA);
		filmeA.adiconarAtor(atrizB);

		filmeB.adiconarAtor(atorA);

		DAO<Filme> dao = new DAO<>();
		dao.incluirAtomico(filmeA);

	}

}
