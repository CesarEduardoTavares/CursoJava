package teste.umPraum;

import Infra.DAO;
import modelo.umPraum.Assento;
import modelo.umPraum.Cliente;

public class NovoClienteAssento2 {
	
	public static void main(String[] args) {
		
		
		Assento assento = new Assento("7D");
		Cliente cliente = new Cliente("Yan", assento);
		
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		dao.incluirAtomico(cliente);
		
	}

}
