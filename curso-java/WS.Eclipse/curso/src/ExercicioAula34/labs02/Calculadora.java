package ExercicioAula34.labs02;

public class Calculadora {

	private static double result = 0.0;

	public static double soma(double num1, double num2) {
		result = num1 + num2;

		return result;
	}

	public static double subtrair(double num1, double num2) {
		result = num1 - num2;

		return result;
	}

	public static double dividir(double num1, double num2) {
		result = num1 / num2;
		return result;
	}

	public static double potencia(double num1, double n) {
		result = Math.pow(num1, n);
		return result;
	}
	
	public static double obterValor() {
		return result;
	}
	
	public static int fatorial(int num) {
		
		if(num == 0) {
			return 1;
		}
		int total = 1;
		for(int i = num ; i > 1; i--) {
			total *= i;
		}
		return total;
		
	}
	
	

}
