package ExerciciosAula19;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		/*
		 * Criar um vetor A com 8 elementos inteiros. Construir um vetor B de 
			mesmo tipo e tamanho e com os elementos do vetor A multiplicados 
			por 2, ou seja: B[i] = A[i] * 2
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int [] valorA = new int[8];
		int [] valorB = new int[valorA.length];
		

		for( int i=0; i<valorA.length; i++) {
			System.out.println("Entre com o valor da posição: " + i);
			valorA[i] = scan.nextInt();
			valorB[i] = valorA[i]*2;
		}
		
		System.out.print("Valor do vetor A : ");
		for(int i= 0; i < valorA.length; i++) {
			System.out.print(valorA[i] + " " );
		}
		
		System.out.println(" ");
		
		
		System.out.print("Valor do vetor B : ");
		for(int i= 0; i < valorB.length; i++) {
			System.out.print(valorB[i] + " ");
		}
		
		System.out.println(" ");
		
	}

}
