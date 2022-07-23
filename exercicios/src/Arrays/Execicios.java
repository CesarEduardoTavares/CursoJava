package Arrays;

import java.util.Arrays;

public class Execicios {public static void main(String[] args) {
	
	
	double [] notaAlunoA = new double [4];
	System.out.println(Arrays.toString(notaAlunoA));

	notaAlunoA[0]= 7.9;
	notaAlunoA[1]= 8;
	notaAlunoA[2]= 6.7;
	notaAlunoA[3]= 9.7;
	
	System.out.println(Arrays.toString(notaAlunoA));
	System.out.println(notaAlunoA[0]);
	System.out.println(notaAlunoA[notaAlunoA.length -1]);
	System.out.println(notaAlunoA[3]);
	
	double TotalAlunoA =0;
	for(int i = 0 ; i < notaAlunoA.length ; i++) {
		TotalAlunoA += notaAlunoA[i];
		}
	System.out.println(TotalAlunoA / notaAlunoA.length);
	
	final double notaAmarzenada = 5.9;
	double [] notaAlunoB = {6.9,8.9,notaAmarzenada,10};
	double TotalAlunoB = 0;
	for ( int i = 0 ; i < notaAlunoB.length ; i++) {
		TotalAlunoB += notaAlunoB[i];	
	}
	System.out.println(TotalAlunoB / notaAlunoB.length);
}
}
