import java.util.Scanner;

public class Aula04Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("INFORME UM VALOR");
		int x = sc.nextInt();

		for (int y = 1; y <= x; y++) {
			if (y % 2 != 0) {
				System.out.println(y);
			}
		}
		sc.close();
	}

}
