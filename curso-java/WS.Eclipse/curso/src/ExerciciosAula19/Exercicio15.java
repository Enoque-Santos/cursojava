package ExerciciosAula19;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		/*
		 * .Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que
		 * defina o percentual de elementos pares e ímpares, respectivamente,
		 * armazenados neste vetor
		 * 
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		int[] valorA = new int[10];
	
		int impar = 0;
		int par  = 0;
		int porcentPar = 0;
		int porcentImpar = 0;

		for (int i = 0; i < valorA.length; i++) {
			System.out.println("Entre com o valor da posição vetor A: " + i);
			valorA[i] = scan.nextInt();

			if (valorA[i] % 2 == 0) {
				par ++;
				porcentPar = par * 100 / valorA.length;
			}
			if (valorA[i] % 2 != 0) {
				impar ++;
				porcentImpar = impar * 100 / valorA.length;
			}

		}

		System.out.println(porcentPar);
		System.out.println(porcentImpar);

	}

}
