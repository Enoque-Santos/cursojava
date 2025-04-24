package ExerciciosAula13;

import java.util.Scanner;

public class Exercicios12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print(" Digite sua altura :");
		double altura  = scan.nextDouble();
		
		double pesoIdeal = (72.7 * altura ) - 58; 
		System.out.println("O peso ideal para sua altura é : " + pesoIdeal) ;
	 
		
	}
		
}


