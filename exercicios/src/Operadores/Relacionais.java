package Operadores;

public class Relacionais {public static void main(String[] args) {
	   
	int a = 97;
	int b = 'a';
	System.out.println( a==b);
	
	System.out.println( 3 > 4);
	System.out.println( 3 >= 3);
	System.out.println( 3 < 7);
	System.out.println( 30 <= 7);
	System.out.println( 30 != 7);
	
	double Nota =7.3;
	boolean Bomcomportamento = true;
	boolean passouPorMedia = Nota >= 7;
	boolean temDesconto = Bomcomportamento && passouPorMedia ;
	
	System.out.println(" Tem desconto " + temDesconto );
	
}

}
