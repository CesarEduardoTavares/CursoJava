package Classe;

public class Datateste {public static void main(String[] args) {
	
	
	Data d1 = new Data();
	//d1.dia = 7;
	//d1.mes = 11;
	//d1.ano = 2021;
	
	
	var d2 = new Data(31,12,2020);
	//d2.dia =31;
	//d2.mes = 12;
	//d2.ano =2020;
	
	
	
	
	
	System.out.println(d1.obterDataFormata());
	System.out.println(d2.obterDataFormata());
	
	//System.out.printf("%d/%d/%d\n", d1.dia,d1.mes,d1.ano);
	//System.out.printf("%d/%d/%d", d2.dia,d2.mes,d2.ano);
	
	
	
	
	
}

}
