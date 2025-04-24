import java.util.Locale;
import java.util.Scanner;

public class ExercicioNumeroFunc04 {

	public static void main(String[] args) {
		/**
		 * 
		 * Fazer um programa que leia o número de um funcionário, seu número de horas
		 * trabalhadas, o valor que recebe por hora e calcula o salário desse
		 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
		 * casas decimais.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numeroFunc;
		double horas = 0.0;
		double valorHora = 0.0;

		double salario = 0.0;

		System.out.println("Digite o número do funcionario : ");
		numeroFunc = sc.nextInt();

		System.out.println("Digite a quantidade de horas trabalhadas : ");
		horas = sc.nextDouble();

		System.out.println("Digite a valor da hora trabalhadaa : ");
		valorHora = sc.nextDouble();

		salario = horas * valorHora;

		System.out.println("Numero do funcionario : " + numeroFunc);
		System.out.printf("Valor do salario do funcionario é : U$ %.2f ", salario);

		sc.close();

	}

}
