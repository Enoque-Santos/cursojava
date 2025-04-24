package ExerciciosAula15;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

		
		/*
		 * 
		 * Primeira situação: Se o ano de 2015 ou 2016 for uma divisão exata em relação
		 * a 4, deveremos verificar, em seguida, se não é divisível por 100. Se não for,
		 * o ano será bissexto;
		 * 
		 * Segunda situação: Se o ano de 2015 ou 2016 não for divisível por 4, então
		 * deveremos verificar se ele é divisível por 400. Se também não for divisível,
		 * o ano de 2015 não será bissexto;
		 * 
		 * Terceira situação: Se o ano de 2015 ou 2016 não for divisível por 4, então
		 * devemos verificar se ele é divisível por 400. Caso seja, o ano de 2015 é
		 * bissexto.
		 */
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o ano : ");

		int ano = scan.nextInt();
		 
		if (ano % 4 == 0) {
			if (ano % 100 != 0) {
				System.out.println("Ano " + ano + " é bissexto");
			} else {
				System.out.println("Ano " + ano + " não é bissexto");
			}

		} else if (ano % 400 != 0) {
			System.out.println("Ano " + ano + " não é bissexto");
		} else if (ano % 4 != 0) {
			if (ano % 400 == 0) {
				System.out.println("Ano " + ano + " é bissexto");
			}
		}
	}

}
