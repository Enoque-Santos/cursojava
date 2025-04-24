package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rent[] rent = new Rent[10];

		System.out.println("Quantos quartos serão alugados?");
		int numeros = sc.nextInt();

		for (int i = 0; i < numeros; i++) {
			System.out.println("Aluguel #" + (i + 1));
			sc.nextLine();

			System.out.println("Nome:");
			String nome = sc.nextLine();

			System.out.println("Email:");
			String email = sc.nextLine();

			System.out.println("Quarto:");
			int quartos = sc.nextInt();

			rent[quartos] = new Rent(nome, email);
		}
		System.out.println();
		System.out.println("Busy Rooms: ");
		for (int i = 0; i < rent.length; i++) {
			if (rent[i] != null) {
				System.out.print(i + ": " + rent[i]);

			}

		}

		sc.close();

	}

}
