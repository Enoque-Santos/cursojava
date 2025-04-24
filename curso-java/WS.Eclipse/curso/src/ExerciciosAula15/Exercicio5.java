package ExerciciosAula15;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe primeira nota :");
		double nota1 = scan.nextDouble();

		System.out.println("Informe segunda nota :");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2)/2; 
		
		if(media >= 7 && media < 10) {
			System.out.println("APROVADO : " + media);
		}else if( media < 7 ){
			System.out.println("REPROVADO : " + media );
		}else {
			System.out.println("APROVADO COM DISTINÇÃO : " + media );
		}
		
	}

}
