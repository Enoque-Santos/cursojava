package ExerciciosAula15;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int centenas = 0;
		int cinquenta = 0;
		int dezenas = 0;
		int unidades = 0;
		int cinco = 0;

		System.out.println("Informe o valor do saque: ");
		int numero = scan.nextInt();
		System.out.println("Notas disponíveis 1, 5, 10, 50 e 100 reiais : ");
		if (numero > 10 && numero <= 600) {
			if (numero > 0) {
				centenas = numero / 100;
				int modCentenas = numero % 100;

				cinquenta = modCentenas / 50;
				int modCinquenta = modCentenas % 50;

				dezenas = modCinquenta / 10;
				int modDezenas = modCinquenta % 10;

				cinco = modDezenas / 5;
				int modCinco = modDezenas % 5;

				unidades = modCinco / 1;
				int modUnidades = modCinco % 1;

				if (centenas != 0 && cinquenta != 0 && dezenas != 0 && cinco != 0 && unidades != 0) {
					System.out.println("Quantidades de notas : " + centenas + " CEM, " + cinquenta + " CINQUENTA, "
							+ dezenas + " DEZ, " + cinco + " CINCO, " + unidades + " UM ");
				} else if (centenas == 0 && cinquenta != 0 && dezenas != 0 && cinco != 0 && unidades != 0) {
					System.out.println("Quantidades de notas : " + cinquenta + " CINQUENTA, " + dezenas + " DEZ, "
							+ cinco + " CINCO, " + unidades + " UM ");
				} else if (centenas != 0 && cinquenta == 0 && dezenas != 0 && cinco != 0 && unidades != 0) {
					System.out.println("Quantidades de notas : " + centenas + " CEM, " + dezenas + " DEZ, " + cinco
							+ " CINCO, " + unidades + " UM ");
				} else if (centenas != 0 && cinquenta != 0 && dezenas == 0 && cinco != 0 && unidades != 0) {
					System.out.println("Quantidades de notas : " + centenas + " CEM, " + cinquenta + " CINQUENTA, "
							+ cinco + " CINCO, " + unidades + " UM ");
				} else if (centenas != 0 && cinquenta != 0 && dezenas != 0 && cinco == 0 && unidades != 0) {
					System.out.println("Quantidades de notas : " + centenas + " CEM, " + cinquenta + " CINQUENTA, "
							+ dezenas + " DEZ, " + unidades + " UM ");
				} else if (centenas != 0 && cinquenta != 0 && dezenas != 0 && cinco != 0 && unidades == 0) {
					System.out.println("Quantidades de notas : " + centenas + " CEM, " + cinquenta + " CINQUENTA, "
							+ dezenas + " DEZ, " + cinco + " CINCO, ");
				}

				/*
				 * if (centenas != 0 && cinquenta != 0) {
				 * System.out.println("Quantidades de notas : " + centenas + " CEM, " +
				 * cinquenta + " CINQUENTA"); } else if (cinquenta != 0 && dezenas != 0) {
				 * System.out.println("Quantidades de notas : " + dezenas + " DEZ, " + unidades
				 * + " UM "); } else if (cinco != 0 && unidades != 0) {
				 * System.out.println("Quantidades de notas : " + cinco + "CINCO, " + unidades +
				 * " UM "); } else { System.out.println("Quantidades de notas : "+ unidades +
				 * " UM "); }
				 */
			} else {
				System.out.println("VALOR INDISPONÍVEL");
			}
		}
	}
}
