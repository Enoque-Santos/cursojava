package ExerciciosAula19;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		/*
		 * Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo
		 * tipo e tamanho, sendo que cada elemento do vetor B deverá ser o respectivo
		 * elemento de A multiplicado por sua posição (ou índice), ou seja: B[i] = A[i]
		 * * i
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		int[] valorA = new int[10];
		int[] valorB = new int[valorA.length];

		for (int i = 0; i < valorA.length; i++) {
			System.out.println("Entre com o valor da posição: " + i);
			valorA[i] = scan.nextInt();
			valorB[i] = valorA[i] * valorA[i] * i;
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
