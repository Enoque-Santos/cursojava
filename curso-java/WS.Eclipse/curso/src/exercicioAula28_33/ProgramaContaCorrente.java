package exercicioAula28_33;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaContaCorrente {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		boolean isValida = true;

		Scanner sc = new Scanner(System.in);
		ContaCorrente conta = new ContaCorrente();

		System.out.println("INFORME NUMERO DA AGENCIA:");
		conta.setAgencia(sc.nextInt());

		System.out.println("INFORME NUMERO DA CONTA:");
		conta.setConta(sc.nextInt());
		while (isValida) {
			System.out.println("INFORME A OPERAÇÃO");
			System.out.println("1 -- SALDO:");
			System.out.println("2 -- SAQUE:");
			System.out.println("3 -- DEPOSITAR:");
			conta.setOperacao(sc.nextInt());

			if (conta.getOperacao() == 1) {
				conta.consultar();

			} else if (conta.getOperacao() == 2) {
				System.out.println("INFORME VALOR DO SAQUE");
				double valor = sc.nextDouble();
				conta.sacar(valor);
			} else if (conta.getOperacao() == 3) {
				System.out.println("INFORME VALOR DO DEPOSITO");
				double valor = sc.nextDouble();
				conta.depositar(valor);
			}

			System.out.println("DESEJA FAZER OUTRA OPERAÇÃO S/N");
			String operacao = sc.next();
			System.out.println();
			if (operacao.equals("N")) {
				System.out.println(conta.toString());
				isValida = false;
			} else {
				System.out.println(conta.toString());
			}

		}
		System.out.println();

	}

}
