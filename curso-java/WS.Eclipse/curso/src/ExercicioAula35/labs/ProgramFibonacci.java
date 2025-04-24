package ExercicioAula35.labs;

import java.util.Scanner;

public class ProgramFibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("Entre com um numero positivo");
		num = sc.nextInt();

		for(int i= 0; i<num; i++) {
			System.out.print(SequenciaFibonacci.fibonacci(i)+ " ");
		}
	}

}
