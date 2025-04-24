package ExerciciosAula17;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		int paisA = 80000;
		int paisB = 200000;
		double taxaPaisA = 0.03;
		double taxaPaisB = 0.015;
		double anos = 0;

		Scanner scan = new Scanner(System.in);

		while (paisA < paisB) {

			paisA += paisA * taxaPaisA;
			paisB += paisB * taxaPaisB;
			anos++;

		}

		System.out.println("PAIS A ULTREPASSOU O B EM : " + anos + " anos");
		System.out.println("PORCENTAGEM PAIS A : " + paisA);
		System.out.println("PORCENTAGEM PAIS B : " + paisB);

	}

}
