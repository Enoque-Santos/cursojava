package exerciciosVector;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int pessoas;
		double maiorAltura = 0.0;
		double menorAltura = 0.0;
		double media = 0.0;
		int homens = 0;
		int indice = 0;
		double result = 0.0;

		System.out.println("QUANTOS PESSOAS DIGITADAS?");
		pessoas = sc.nextInt();

		char[] genero = new char[pessoas];
		double[] alturaVect = new double[pessoas];
	

		for (int i = 0; i < pessoas; i++) {
			indice += 1;
			System.out.printf("Altura da " + indice + "a pessoa: ");
			alturaVect[i] = sc.nextDouble();

			System.out.printf("Genero da " + indice + "a pessoa: ");
			genero[i] = sc.next().charAt(0);
			

		}

		for (int i = 1; i < pessoas; i++) {
			if (genero[i]=='M') {
				homens++;

			}

		}
		maiorAltura = alturaVect[0];
		menorAltura = alturaVect[0];
		for (int i = 1; i < pessoas; i++) {
			if (alturaVect[i] > maiorAltura) {
				maiorAltura = alturaVect[i];
				indice = i;
			}
			if (alturaVect[i] < menorAltura) {
				menorAltura = alturaVect[i];
				indice = i;
			}
		}

		for (int i = 0; i < pessoas; i++) {
			media = media + alturaVect[i];
		}
		result = media / pessoas;

		System.out.printf("Menor altura:  %.2f\n ",menorAltura);
		System.out.printf("Maior altura:  %.2f\n",maiorAltura);
		System.out.printf("Media das alturas das mulheres: %.2f\n" ,result);
		System.out.printf("Numero de homens:  %d\n",homens);
		sc.close();

	}

}
