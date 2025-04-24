package ExercicioAula34.labs02;

import java.util.Scanner;

public class ProgramFactorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;

		do {
			System.out.println("Entre com um numero positivo");
			num = sc.nextInt();

			if (num < 0) {
				System.out.println("numero invalido");

			}
		} while (num < 0);
		System.out.println(Calculadora.fatorial(num));

	}

}
