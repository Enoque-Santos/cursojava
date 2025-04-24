package ExerciciosAula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		/*
		 * Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo
		 * tamanho, sendo que cada elemento do vetor B deverá ser a raiz quadrada do
		 * respectivo elemento de A, ou seja: B[i] = sqrt(A[i]).
		 */
		Scanner scan = new Scanner(System.in);

		int[] valorA = new int[15];
		double[] valorB = new double[valorA.length];
		
		DecimalFormat df = new DecimalFormat("###,###.###");

		for (int i = 0; i < valorA.length; i++) {
			System.out.println("Entre com o valor da posição: " + i);
			valorA[i] = scan.nextInt();
			valorB[i] = Math.sqrt(valorA[i]) ;
		}

		System.out.print("Valor do vetor A : ");
		for (int i = 0; i < valorA.length; i++) {
			System.out.print(valorA[i] + " ");
		}

		System.out.println(" ");

		System.out.print("Valor do vetor B : ");
		for (int i = 0; i < valorB.length; i++) {
			System.out.print(df.format(valorB[i]) + " ");
		}

		System.out.println(" ");

	}

}
