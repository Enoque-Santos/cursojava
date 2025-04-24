package ExerciciosAula15;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe primeiro número : ");
		int num1 = scan.nextInt();

		System.out.println("Informe segundo número : ");
		int num2 = scan.nextInt();

		if (num1 > num2) {
			System.out.println("Primeiro número informado é maior: " + num1);
		} else if (num2 > num1) {
			System.out.println("Segundo número informado é maior: " + num2);
		} else {
			System.out.println("Os números são iguas: " + num1 + " = " + num2);
		}
	}

}
