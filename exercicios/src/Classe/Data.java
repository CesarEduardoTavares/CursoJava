package Classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	
	Data() {
		dia = 1;
		mes = 2;
		ano = 1970;
	}
	Data (int diaInicial, int mesInicial, int anoInicial){
	diaInicial = dia;
	mesInicial = mes;
	anoInicial = ano;}
	
	
	
	
String obterDataFormata () {
	return String.format("%d/%d/%d", dia,mes,ano);
}
}
