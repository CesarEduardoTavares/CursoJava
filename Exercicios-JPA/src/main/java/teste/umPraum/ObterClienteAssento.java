package teste.umPraum;

import Infra.DAO;
import modelo.umPraum.Assento;
import modelo.umPraum.Cliente;

public class ObterClienteAssento {

	public static void main(String[] args) {
		
		DAO<Cliente> daoCliente = new DAO<>(Cliente.class);
		
		Cliente cliente = daoCliente.obterPorId(1L);
		
		System.out.println(cliente.getAssento().getNome());
		daoCliente.fechar();
		
		DAO<Assento> daoAssento = new DAO<>(Assento.class);
		
		Assento assento = daoAssento.obterPorId(4L);
		
		System.out.println(assento.getCliente().getNome());
		
		daoAssento.fechar();
		
		
		
		
	}
	
}
