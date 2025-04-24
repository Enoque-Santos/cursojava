package ExerciciosAula19;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		/*
		 * 1. Criar um vetor A com 5 elementos inteiros. Construir um vetor B de 
				mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou 
				seja, B[i] = A[i].
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int [] valorA = new int[4];
		int [] valorB = new int[valorA.length];
		
		for( int i=0; i<valorA.length; i++) {
			System.out.println("Entre com o valor da posição: " + i);
			valorA[i] = scan.nextInt();
			valorB[i] = valorA[i];
		}
		
		System.out.println("Valor do vetor A : ");
		for(int i= 0; i < valorA.length; i++) {
			System.out.println(valorA[i]);
		}
		System.out.println(" ");
		
		
		System.out.println("Valor do vetor B : ");
		for(int i= 0; i < valorB.length; i++) {
			System.out.println(valorB[i]);
		}
		System.out.println(" ");
	}

}
