package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informacoes de funcionario 
		
		//Tipos numericos 
		byte anosDeEmpresa =23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados =3_134_845_223L;
		
		// Tipos Numericos reais 
		
		float salario =11_445_44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipos Booleano 
		
		boolean estadeferias = false ;//true 
		 // Tipo caractere 
		char status = 'A' ; // ativo 
		
		
		// Dias de Empresa 
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de Viagens 
		
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por Real 
		
		System.out.println(pontosAcumulados / vendasAcumuladas );
		
		System.out.println(id + ":Ganha->" + salario);
		System.out.println("Ferias -->"+ estadeferias);
		System.out.println("Status:" + status);

	}
}
