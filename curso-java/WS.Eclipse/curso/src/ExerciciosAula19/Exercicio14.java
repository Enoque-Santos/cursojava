package ExerciciosAula19;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		/*
		 * .Criar um vetor A com 10 elementos inteiros. Implementar um programa que
		 * defina e escreva a média aritmética simples dos elementos ímpares armazenados
		 * neste vetor.
		 * 
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		int[] valorA = new int[10];
		int cont = 0;
		int posicao = 0;
		double result = 0.0;

		for (int i = 0; i < valorA.length; i++) {
			System.out.println("Entre com o valor da posição vetor A: " + i);
			valorA[i] = scan.nextInt();

			if (valorA[i] % 2 != 0) {
				cont = valorA[i] + cont;
				posicao ++;
				result = cont / posicao;
			}
		}
		System.out.println(" A média aritmética simples dos elementos ímpares armazenados são : " + result);

	}

}
