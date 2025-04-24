package ExerciciosAula19;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		/*
		 * Criar um vetor A com 10 elementos inteiros. Implementar um programa 
			que defina e escreva a quantidade de elementos armazenados neste 
			vetor que são pares.
		 * 
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		int[] valorA = new int[10];
		int cont = 0;
		
		for (int i = 0; i < valorA.length; i++) {
			System.out.println("Entre com o valor da posição vetor A: " + i);
			valorA[i] = scan.nextInt();
			if(valorA[i] % 2 == 0) {
				cont ++;			
			}
			
		}
		System.out.println("A quantidade de operadores que são pares: " +cont);
		

	}

}
