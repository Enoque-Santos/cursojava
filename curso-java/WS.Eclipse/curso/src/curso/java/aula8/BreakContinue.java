package curso.java.aula8;

import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {
		int num = 0;
		int max = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("INFORME UM NÚMERO :");
		num = scan.nextInt();

		System.out.println("ENTRE COM UM LIMITE :");
		max = scan.nextInt();

		/*for (int i = num; i <= max; i++) {

			if (i % 7 == 0) {
				System.out.println("O VALOR DE I : " + i);
				break;
			}
		}*/
		for (int i = num; i <= max; i++) {

			if (i % 7 == 0) {
				continue;
			}
			System.out.println("O VALOR DE I : " + i);
		}
	}

}
