package ExerciciosAula20;

import java.util.Random;

public class Exercicio02 {

	public static void main(String[] args) {

		/*
		 * Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0-9. Após isso
		 * indique qual é o maior e o menor valor da linha 5 e qual é o maior e o menor
		 * valor da coluna 7
		 */
		int[][] numerosAleatorios = new int[10][10];

		Random numeroRandom = new Random();

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(100);
			}
		}
		// confirmar valores
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				System.out.print(numerosAleatorios[i][j] + " ");

			}

			System.out.println(" ");
		}
		int maiorL = 0;
		int menorL = 101;
		int linha5 = 4;

		for (int j = 0; j < numerosAleatorios[linha5].length; j++) {
			if (numerosAleatorios[linha5][j] > maiorL) {
				maiorL = numerosAleatorios[linha5][j];
			}
			if (numerosAleatorios[linha5][j] < menorL) {
				menorL = numerosAleatorios[linha5][j];
			}

		}
		System.out.println("  ");
		System.out.println(" Maior Linha " + maiorL);
		System.out.println(" Menor Linha " + menorL);

		int maiorC = 0;
		int menorC = 101;
		int coluna7 = 7;

		for (int j = 0; j < numerosAleatorios.length; j++) {
			if (numerosAleatorios[j][coluna7] > maiorC) {
				maiorC = numerosAleatorios[j][coluna7];
			}
			if (numerosAleatorios[j][coluna7] < menorC) {
				menorC = numerosAleatorios[j][coluna7];
			}

		}

		System.out.println("  ");
		System.out.println(" Maior Coluna " + maiorC);
		System.out.println(" Menor Coluna " + menorC);

	}

}
