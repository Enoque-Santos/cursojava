package ExerciciosAula19;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		/*
		 * Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo
		 * tipo e tamanho, sendo que cada elemento do vetor B deverá ser o quadrado do
		 * respectivo elemento de A, ou seja: B[i] = A[i] * A[I].
		 */

		Scanner scan = new Scanner(System.in);

		int[] valorA = new int[15];
		int[] valorB = new int[valorA.length];

		for (int i = 0; i < valorA.length; i++) {
			System.out.println("Entre com o valor da posição: " + i);
			valorA[i] = scan.nextInt();
			valorB[i] = valorA[i] * valorA[i] ;
		}

		System.out.print("Valor do vetor A : ");
		for (int i = 0; i < valorA.length; i++) {
			System.out.print(valorA[i] + " ");
		}

		System.out.println(" ");

		System.out.print("Valor do vetor B : ");
		for (int i = 0; i < valorB.length; i++) {
			System.out.print(valorB[i] + " ");
		}

		System.out.println(" ");

	}

}
