package ExerciciosAula15;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe número : ");
		double numero = scan.nextDouble();
		
		double numeroArr = Math.floor(numero);
		
		if ( numeroArr != numero) {
		    System.out.println("Decimal. " + numero);
		}else {
			System.out.println("Inteiro. " + numero);
		}
		
	}

}
