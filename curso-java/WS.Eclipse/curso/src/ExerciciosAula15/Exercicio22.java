package ExerciciosAula15;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe número : ");
		int numero1 = scan.nextInt();
		
		if ( numero1 % 2 == 0) {
		    System.out.println("Número é par. ");
		}else {
			System.out.println("Número é impar. ");
		}

	}

}
