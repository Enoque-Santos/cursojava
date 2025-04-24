import java.util.Locale;
import java.util.Scanner;

public class ExercicioCodPeca05 {

	public static void main(String[] args) {

		/**
		 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
		 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
		 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		 * 
		 * 
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codPeca1, codPeca2, numePeca1, numePeca2;
		double valorPeca1, valorPeca2, valorPagar, valorPagarPeca1, ValorPagarPeca2;

		System.out.println("Informe codigo da primeira peça :");
		codPeca1 = sc.nextInt();

		System.out.println("Informe numero peças :");
		numePeca1 = sc.nextInt();

		System.out.println("Informe valor unitario :");
		valorPeca1 = sc.nextDouble();

		System.out.println("Informe codigo da segunda peça :");
		codPeca2 = sc.nextInt();

		System.out.println("Informe numero peças :");
		numePeca2 = sc.nextInt();

		System.out.println("Informe valor unitario :");
		valorPeca2 = sc.nextDouble();

		valorPagarPeca1 = numePeca1 * valorPeca1;
		ValorPagarPeca2 = numePeca2 * valorPeca2;

		valorPagar = valorPagarPeca1 + ValorPagarPeca2;

		System.out.printf("Valor a ser pago pelo cliente é R$ %.2f" , valorPagar);

		sc.close();

	}

}
