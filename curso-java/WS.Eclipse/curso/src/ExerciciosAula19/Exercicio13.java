package ExerciciosAula19;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		/*
		 * .Criar um vetor A com 10 elementos inteiros. Implementar um programa que
		 * determine a soma dos elementos armazenados neste vetor que são múltiplos de 5
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		int[] valorA = new int[10];
		int cont = 0;
		int result = 0;

		for (int i = 0; i < valorA.length; i++) {
			System.out.println("Entre com o valor da posição vetor A: " + i);
			valorA[i] = scan.nextInt();
			// cont = valorA[i] + cont;

			if (valorA[i] % 5 == 0) {
				cont = valorA[i];

				result = result + cont;
			}
			
		}
		System.out.println("A SOMA DE DOS NUMEROS MULTIPLOS DE  5 SÃO : " + result);

	}

}
