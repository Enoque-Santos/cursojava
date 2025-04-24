package exerciciosVector;

import java.util.Locale;
import java.util.Scanner;

public class NumerosInteiros {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int number = 0;
		int par = 0;

		System.out.println("QUANTOS NUMEROS VOCE VAI DIGITAR?");
		number = sc.nextInt();
		
		int[] vect = new int[number];

		for (int i = 0; i < vect.length; i++) {

			System.out.println("DIGITE UM NUMERO");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS PARES:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				System.out.print(vect[i] + " ");
				par++;
			}

		}
		System.out.println();
		System.out.println("QUANTIDADES DE PARES = " + par);

	}

}
