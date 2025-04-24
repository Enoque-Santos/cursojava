package ExercicioAula34.labs02;

import java.util.Scanner;

import ExercicioAula35.labs.Somatorio;

public class ProgramSomatorio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num;

		
		System.out.println("Entre com um numero positivo");
		num = sc.nextInt();
		
		System.out.println(Somatorio.somatorio(num));
	}

}
