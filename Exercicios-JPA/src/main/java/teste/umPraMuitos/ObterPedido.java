package teste.umPraMuitos;


import Infra.DAO;
import modelo.umPraMuitos.ItemPedido;
import modelo.umPraMuitos.Pedido;

public class ObterPedido {
	
public static void main(String[] args) {
	
	
	DAO<Pedido> dao = new DAO<>(Pedido.class);
	
	Pedido pedido = dao.obterPorId(1L);
	
	for (ItemPedido Item: pedido.getItens()) {
		System.out.println(Item.getQuantidade());
		System.out.println(Item.getProduto().getNome());
	}
	
	dao.fechar();
	
}
}
