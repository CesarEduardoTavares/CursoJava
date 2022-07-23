package fundamentos;

public class Temperatura {
	
			
	public static void main(String[] args) {
		// (F - 32 ) X 5/9 = C
		final double Ajuste = 32;
		final double Fator = 5/9.0;
		double fahrenheit=86 ;
		double Celsius = (fahrenheit- Ajuste) * Fator;
		
		
		System.out.println("o resultado eh " + Celsius +  " °C");
		
		 fahrenheit = 40;
		 Celsius = (fahrenheit- Ajuste) * Fator;
				
				System.out.println(" resultado final " + Celsius + "°C");
		
				
	}

}
