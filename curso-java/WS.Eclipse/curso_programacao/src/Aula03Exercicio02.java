import java.util.Scanner;

public class Aula03Exercicio02 {

	public static void main(String[] args) {

		/**
		 * 
		 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
		 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
		 * quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
		 * uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
		 * alguma).
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		boolean valida = true;

		System.out.println("INFORME PRIMEIRO VALOR");
		int x = sc.nextInt();

		System.out.println("INFORME SEGUNDO VALOR");
		int y = sc.nextInt();

		while (x != 0 && y != 0) {

			if (x > 0 && y > 0) {
				System.out.println("PRIMEIRO");
			} else if (x < 0 && y > 0) {
				System.out.println("SEGUNDO");
			} else if (x < 0 && y < 0) {
				System.out.println("TERCEIRO");
			} else {
				System.out.println("QUARTO");

			}
			System.out.println("INFORME PRIMEIRO VALOR");
			x = sc.nextInt();

			System.out.println("INFORME SEGUNDO VALOR");
			y = sc.nextInt();
		}
	}

}
