package ExerciciosAula15;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		

		System.out.println("Informe primeira nota: ");
		double numero1 = scan.nextDouble();

		System.out.println("Informe segunda nota: ");
		double numero2 = scan.nextDouble();

		System.out.println("Informe terceira nota: ");
		double numero3 = scan.nextDouble();

		double media = (numero1 + numero2 + numero3)/3;
		
		if(media == 10) {
			System.out.println("APROVADO COM DISTINÇÃO COM MÉDIA: " + media);
		}else if( media >= 7) {
			System.out.println("APROVADO COM MÉDIA : " + media);
		}else {
			System.out.println("REPROVADO COM MÉDIA : " + media);
		}
	    
	}

}
