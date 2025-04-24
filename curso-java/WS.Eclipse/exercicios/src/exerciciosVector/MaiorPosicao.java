package exerciciosVector;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double maior  = Integer.MIN_VALUE;
		int posicao = 0;
		
		System.out.println("Quantos numeros vai digitar?");
		int number = sc.nextInt();

				
		double[] vect = new double[number];

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um numero:");
			vect[i] = sc.nextInt();
		}
		
		maior = vect[0];
		posicao = 0;
		
		for(int i=1;i < number;i++) {
			if(vect[i]>maior) {
				maior = vect[i];
				posicao = i;
			}

		}
		System.out.printf("MAIOR VALOR = %.1f\n", maior);
		System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posicao);

		sc.close();
		

	}

}
