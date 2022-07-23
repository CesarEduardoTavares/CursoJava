package Lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {public static void main(String[] args) {
	
	UnaryOperator<Integer> maisDois = m -> m + 2;
	UnaryOperator<Integer> vezesDois = m -> m * 2;
	UnaryOperator<Integer> aoQuadrado = m -> m * m;
	
	int resultado1 = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0);
	System.out.println(resultado1);
	
	int resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(0);
	System.out.println(resultado2);
}

}
