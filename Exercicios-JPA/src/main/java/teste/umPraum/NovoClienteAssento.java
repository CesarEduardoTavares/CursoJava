package teste.umPraum;

import Infra.DAO;
import modelo.umPraum.Assento;
import modelo.umPraum.Cliente;

public class NovoClienteAssento {

	public static void main(String[] args) {
		
		Assento assento = new Assento ("45T");
		Cliente cliente = new Cliente ("Gustav", assento);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirT()
		.incluir(assento)
		.incluir(cliente)
		.fecharT()
		.fechar();
		
		
	}
	
	
	
}
