package application;

import java.util.Locale;
import java.util.Scanner;

import util.CalculatorDollar;

public class ProgramDollar {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("What is the dollar price? ");
		double priceDollar = sc.nextDouble();
		
		System.out.println("How many dollars will bought?");
		double qtdDollar  = sc.nextDouble();
		
		double resultIOF = CalculatorDollar.calculatorDollar(priceDollar, qtdDollar);
		
		System.out.printf("Amount to be paid is reais = $ %.2f ", resultIOF);
		
		

	}

}
