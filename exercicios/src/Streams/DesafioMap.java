package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	public static void main(String[] args) {
		
//		1. Numero para string binaria...
//		2. Inverter a string ... 110 =>"011"
//		3. Converter e volta para o inteiro => "011 => 3"
//		4. Interger.
	//	
		
	List<Integer>nums =Arrays.asList(1,2,3,4,5,6,7,8,9)	;
	
	UnaryOperator<String> inverter = S->new StringBuilder(S).reverse().toString();	
	
	Function<String, Integer> binarioParaInt =
			S -> Integer.parseInt(S,2);
		
		
	nums.stream()
	.map(Integer::toBinaryString)
	.map(inverter)
	.map(binarioParaInt)
	.forEach(System.out::println);
	
	}


	
	
	
}
