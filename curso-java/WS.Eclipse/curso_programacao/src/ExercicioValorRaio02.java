import java.util.Locale;
import java.util.Scanner;

public class ExercicioValorRaio02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double raioValor = 0.0;
		double pi = 3.14159;
		double area = 0.0;

		System.out.println("Digite valor do raio");
		raioValor = sc.nextDouble();

		area = pi * Math.pow(raioValor, 2.0);

		// Locale.setDefault(Locale.US);
		// System.out.printf("US decimal point: %.3f \n", measure);

		System.out.printf("Valor da área deste círculo : %.4f ", area);

		sc.close();

	}

}
