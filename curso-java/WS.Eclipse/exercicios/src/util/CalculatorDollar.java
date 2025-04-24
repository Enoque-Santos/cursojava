package util;

public class CalculatorDollar {

	public static int IOF = 6;

	public static double calculatorDollar(double priceDollar, double qtdDollar) {
		
		double result = priceDollar * qtdDollar;
	
		result += result * IOF / 100;
		
		return result;

	}

}
