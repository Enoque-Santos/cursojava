package exerciciosVector;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("QUANTOS ALUNOS SERAM DIGITADOS?");
		int number = sc.nextInt();

		double[] vect1 = new double[number];
		double[] vect2 = new double[number];
		String[] nome = new String[number];
		double media = 0.0;

		for (int i = 0; i < nome.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota %da aluno:\n", i + 1);
			nome[i] = sc.next();
			vect1[i] = sc.nextDouble();
			vect2[i] = sc.nextDouble();
		}
		System.out.println("ALUNOS APROVADOS:");

		for (int i = 0; i < number; i++) {
			media = (vect1[i] + vect2[i]) / 2;
			if (media >= 6) {
				System.out.println(nome[i]);
			}
		}

	}

}
