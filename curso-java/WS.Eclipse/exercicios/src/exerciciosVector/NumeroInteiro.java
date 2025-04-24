package exerciciosVector;

import java.util.Scanner;

public class NumeroInteiro {

	public static void main(String[] args) {

		/*
		 * faça um programa que leia um número inteiro positivo N (máximo = 10) e depois
		 * N números inteiros e armazene-os em um vetor. Em seguida, mostrar na tela
		 * todos os números negativos lidos.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros vai digitar?");
		int number = sc.nextInt();

		sc.nextLine();

		int[] vect = new int[number];

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um numero:");
			vect[i] = sc.nextInt();

		}
		System.out.println("NUMEROS NEGATIVOS");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}

		sc.close();

	}

}
