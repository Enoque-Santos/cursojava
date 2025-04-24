package ExerciciosAula15;

import java.util.Scanner;

public class Exercicio2 {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe primeiro número : ");
		int num1 = scan.nextInt();

		if (num1 >= 0) {
			System.out.println("Número informado é positivo : " + num1);
		} else {
			System.out.println("Número informado é negativo :" + num1);
		}
	}

}
