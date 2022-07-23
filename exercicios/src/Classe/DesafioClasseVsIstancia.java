package Classe;

public class DesafioClasseVsIstancia {public static void main(String[] args) {
	
	DesafioClasseVsIstancia1 p1 = new DesafioClasseVsIstancia1("Notebook",4356.89);
	
	
	var p2 =new DesafioClasseVsIstancia1();
	p2.nome ="Caneta Preta";
	p2.preco = 12.56;
	DesafioClasseVsIstancia1.desconto = 0.50;
	
	System.out.println(p1.nome + " " + p1.PrecoComDesconto());
	System.out.println(p2.nome + " " + p2.PrecoComDesconto());
	
	double precoFinal1 = p1.PrecoComDesconto();
	double precoFinal2 = p2.PrecoComDesconto(0.1);
	double Carrinho = (precoFinal1 + precoFinal2)/2;
	
System.out.printf("Valor do Carrinho = R$%.2f ",Carrinho);
}

}
