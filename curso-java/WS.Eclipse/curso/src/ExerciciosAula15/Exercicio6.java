package ExerciciosAula15;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe primeiro número :");
		int num1 = scan.nextInt();
		System.out.println("Informe segundo número :");
		int num2 = scan.nextInt();
		System.out.println("Informe terceiro número :");
		int num3 = scan.nextInt();
		 
		if(num1 >= num3 && num1 >= num2) {
			System.out.println("Primeiro número e maior : " + num1);
		}else if(num3 <= num2) {
			System.out.println("Segundo número e maior : " + num2);
		}else {
			System.out.println("Terceiro número e maior : " + num3);
		}
		
	}

}
