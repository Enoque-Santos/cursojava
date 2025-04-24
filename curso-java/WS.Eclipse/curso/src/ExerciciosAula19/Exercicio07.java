package ExerciciosAula19;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		/*
		 *Criar dois vetores A e B cada um com 10 elementos inteiros. Construir 
			um vetor C, onde cada elemento de C é a subtração dos respectivos 
			elementos em A e B, ou seja:
			C[i] = A[i] – B[i] 
		 * 
		 */
		Scanner scan = new Scanner(System.in);

		int[] valorA = new int[10];
		int[] valorB = new int[valorA.length];
		int[] valorC = new int [valorB.length];
		

		for (int i = 0; i < valorA.length; i++) {
			System.out.println("Entre com o valor da posição vetor A: " + i);
			valorA[i] = scan.nextInt();
			
		}
		for (int i = 0; i < valorB.length; i++) {
			System.out.println("Entre com o valor da posição vetor B: " + i);
			valorB[i] = scan.nextInt();
			
		}	
		
		for (int i = 0; i < valorC.length; i++) {			
			valorC[i] = valorA[i] - valorB[i];
			
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
		System.out.print("Valor do vetor C : ");
		for (int i = 0; i < valorC.length; i++) {
			System.out.print(valorC[i] + " ");
		}

		System.out.println(" ");
	}


}
