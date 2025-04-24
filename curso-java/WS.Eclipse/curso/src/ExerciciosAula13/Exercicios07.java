package ExerciciosAula13;

import java.util.Scanner;

public class Exercicios07{

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);			
		System.out.print(" Digite altura :");
		double altura = scan.nextDouble();
		System.out.print(" Digite largura :");
		double largura = scan.nextDouble();
		
		//double quadrado = (altura * largura)*2;
		double quadrado = Math.pow(altura, largura)*2;
		System.out.print(" O doblo da área do quadrado é :" + quadrado);
		
		
	}
}
