package br.com.cod3r.app.financeiro;

//import java.lang.reflect.Field;
import java.util.ServiceLoader;

import br.com.cod3r.app.Calculadora;
//import br.com.cod3r.app.calculo.Calculadoraimpl;
//import br.com.cod3r.app.calculo.interno.OperacoesAritimeticas;

public class Teste {

	public static void main(String[] args) {

		Calculadora calc = ServiceLoader.load(Calculadora.class).findFirst().get();

		System.out.println(calc.soma(2, 3, 4));

//		Calc c1 = new Calcimpl1();
//		Calc c2 = new Calcimpl2();
//		
//		System.out.println(c1.soma(1,2,3));
//		System.out.println(c2.soma(1,2,3));

//		Calculadoraimpl calc = new Calculadoraimpl();
//
//		System.out.println(calc.soma(2, 3, 4));

//		OperacoesAritimeticas op = new OperacoesAritimeticas();
//		System.out.println(op.soma(4,5,6));

//		System.out.println(Calculadoraimpl.class.getName());
//		
//		System.out.println(Calculadoraimpl.class.getDeclaredFields()[0].getName());
//		
//		try {
//			Field fieldId = Calculadoraimpl.class.getDeclaredFields()[0];
//			fieldId.setAccessible(true);
//			fieldId.set(calc, "def");
//			fieldId.setAccessible(false);
//			System.out.println(calc.getId());
//			
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}

}
