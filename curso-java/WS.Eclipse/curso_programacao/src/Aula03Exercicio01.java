import java.util.Scanner;

public class Aula03Exercicio01 {

	public static void main(String[] args) {

		/**
		 * Escreva um programa que repita a leitura de uma senha até que ela seja
		 * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
		 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
		 * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
		 * correta é o valor 2002.
		 * 
		 * 
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		int senhaValida = 2002;
		boolean valida = true;

		while (valida) {
			System.out.println("INFORME A SENHA");
			int senha = sc.nextInt();

			if (senha != senhaValida) {
				System.out.println("SENHA INVALIDA");
			} else {
				System.out.println("ACESSO PERMITIDO");
				valida = false;
			}

		}

	}

}
