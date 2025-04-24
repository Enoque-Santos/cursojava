package ExerciciosAula13;

import java.util.Scanner;

public class Exercicios11 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		double num3Real = 0;
		double resultDobro = 0;
		double resultTriplo = 0;
		double resultadoElevado = 0;
		
		Scanner scan =new Scanner(System.in);			
		System.out.print(" Digite um numero inteiro :");
		num1 = scan.nextInt();
		
		System.out.print(" Digite segundo numero inteiro :");
		num2 = scan.nextInt();
		
		System.out.print(" Digite um numero real :");
		num3Real = scan.nextInt();
		 
		resultDobro = (num1 * 2)*(num2/2) ;
		resultTriplo = num1 * 3 + num3Real;
		resultadoElevado = Math.pow(num3Real, 3) ;
		
		System.out.println(resultDobro );
		System.out.println(resultTriplo);
		System.out.println(resultadoElevado);
	}

}
