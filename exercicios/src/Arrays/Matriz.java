package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {public static void main(String[] args) {
	
	
	Scanner entrada = new Scanner(System.in);
	System.out.print("Quantos Aluno : ");
    int qtdeAlunos = entrada.nextInt();
    System.out.print("Quantas notas por aluno? ");
    int qtdeNotas = entrada.nextInt();
	double [][] NotasDaTurma = new double [qtdeAlunos] [qtdeNotas];
	double total = 0;
	for (int a = 0; a < NotasDaTurma.length; a++) {
		for (int n = 0; n < NotasDaTurma[a].length; n++) {
			System.out.printf("Informe a nota %d do aluno %d: " , n +1, a +1 );
			NotasDaTurma [a][n] = entrada.nextDouble();
			total += NotasDaTurma[a][n];
			
		}
	}
	double media = total / (qtdeAlunos*qtdeNotas);
	System.out.println("Media da turma e : " + media);
	for (double[] NotasDoAluno: NotasDaTurma) {
		System.out.println(Arrays.toString(NotasDoAluno));
	}
		
	
	entrada.close();

}
}
