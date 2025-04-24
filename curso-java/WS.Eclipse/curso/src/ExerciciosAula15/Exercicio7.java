package ExerciciosAula15;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe primeiro número :");
		int num1 = scan.nextInt();
		System.out.println("Informe segundo número :");
		int num2 = scan.nextInt();
		System.out.println("Informe terceiro número :");
		int num3 = scan.nextInt();
		 
		//mostra o maior
		if(num1 >= num3) {
			System.out.println("Primeiro número e maior : " + num1);
		}else if(num3 <= num2) {
			System.out.println("Segundo número e maior : " + num2);
		}else {
			System.out.println("Terceiro número e maior : " + num3);
		}
		// mostra o menor
		if(num1 <= num3 && num1 <= num2) {
			System.out.println("Primeiro número e menor : " + num1);
		}else if(num3 >= num2) {
			System.out.println("Segundo número e menor : " + num2);
		}else {
			System.out.println("Terceiro número e menor : " + num3);
		}


	}

}
