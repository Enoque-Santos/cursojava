package ExerciciosAula17;

import java.util.Scanner;
public class Exercicio7 {

	public static void main(String[] args) {
		
		boolean valida = false;
		Double result = 0.0;
		String  legenda = "";
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("DIGITE PRIMEIRO NÚMERO :");
		double num1 = scan.nextDouble();

		System.out.println("DIGITE SEGUNDO NÚMERO :");
		double num2 = scan.nextDouble();


		/*
		 * System.out.println("DIGITE TERCEIRO NÚMERO :");
		double num3 = scan.nextDouble();

		System.out.println("DIGITE QUARTO NÚMERO :");
		double num4 = scan.nextDouble();

		System.out.println("DIGITE QUINTO NÚMERO :");
		double num5 = scan.nextDouble();
		
	    while (!valida) {
		 
			if(num1 > num2 && num1 > num3 && num1 > num4 && 
					num1 > num5) {
				result = num1;
				legenda = " E O PRIMEIRO";
				
			}else if(num2 > num1 && num2 > num3 && num2 > num4 &&
					num2 > num5) {
				result = num2;
				legenda = " E O SEGUNDO";
				
			}else if(num5 > num2 && num5 > num3 && num5 > num4 &&
					num5 > num1) {
				result = num5;
				legenda = " E O QUINTO";
				
			}else if(num3 > num1 && num3 > num2 && num3 > num4 &&
					num3 > num5) {
				result = num3;
				legenda = " E O TERCEIRO";
				
			}else if(num4 > num1 && num4 > num2 && num4 > num3 &&
					num4 > num5) {
				result = num4;
				legenda = " E O QUARTO3";
			}
		
			System.out.println("O MAIOR NUMERO É : " + result + legenda);
			*/
		    System.out.println("O MAIOR NUMERO É : " + Math.max(num1, num2) );
		    
		    System.out.println("O MAIOR NUMERO É : " + Math.pow(num1, num2));
			valida = true;
	}		
				
}

