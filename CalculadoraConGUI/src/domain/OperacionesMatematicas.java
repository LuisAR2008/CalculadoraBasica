package domain;

public class OperacionesMatematicas {
	
	public OperacionesMatematicas() {
		
	}


	public double sumar(double num1, double num2) {
		
		return num1+num2;
		
	}
	
	public double restar(double num1, double num2) {
		
		return num1-num2;
		
	}
	
	public double multiplicar(double num1, double num2) {
		
		
		return num1*num2;
		
	}
	
	public double dividir(double num1, double num2) {
		
		
		if (num1 == 0) {
			throw new ArithmeticException("Imposible Dividor entre Cero");
			
		}
		return num1/num2;
		
		
		
	
	}
	
	

}
