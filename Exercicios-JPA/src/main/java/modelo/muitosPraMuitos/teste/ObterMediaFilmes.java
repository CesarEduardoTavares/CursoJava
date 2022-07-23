package modelo.muitosPraMuitos.teste;

import Infra.DAO;
import modelo.consulta.NotaFilme;

public class ObterMediaFilmes {
	
	public static void main(String[] args) {
		
	
		
		DAO<NotaFilme> dao = new DAO<>();
		NotaFilme nota = dao.consultarUm("obterMediaGeralDosFilmes");
		
		System.out.println(nota.getMedia());
		
		dao.fechar();
	}

}
