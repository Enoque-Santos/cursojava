package ExerciciosAula17;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean valida = false;
		String nome  = "", sexo = "", estadoCivil = "";
		int idade = 0; 
		double salario = 0;
		
		
		
		while (!valida) {
			System.out.println("INFORME SEU NOME :");
			nome = scan.next();
			if (nome.length() > 3) {
				valida = true;
			} else {
				System.out.println("NOME INVÁLIDO :");
			}
		}
		valida = false;
		while (!valida) {
			System.out.println("INFORME SUA IDADE :");
			idade = scan.nextInt();
			if (idade > 0 && idade < 150) {
				valida = true;
			} else {

				System.out.println("IDADE INVÁLIDA :");
			}
		}
		valida = false;
		while (!valida) {
			System.out.println("INFORME SEU SALÁRIO :");
			salario = scan.nextDouble();
			if (salario > 0) {
				valida = true;
			} else {
				System.out.println("SÁLARIO INVÁLIDO :");
			}
		}
		valida = false;
		while (!valida) {
			System.out.println("INFORME SEU SEXO (F) - Feminino, (M) - Masculino :");
			sexo = scan.next();
			if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M")) {
				valida = true;
			} else {
				System.out.println("SEXO INVÁLIDO :");
			}
		}
		valida = false;
		while (!valida) {
			System.out.println("INFORME SEU ESTADO CÍVIL (S)/(C)/(V)/(D):");
			estadoCivil = scan.next();
			switch (estadoCivil.toUpperCase()) {
			case "S":
			case "C":
			case "V":
			case "D":
				valida = true;
				break;
			default:
				System.out.println("ESTADO CÍVIL INVÁLIDO :");
			}
		}
		System.out.println("NOME : " + nome);
		System.out.println("IDADE : " + idade);
		System.out.println("SALÁRIO : " + salario);
		System.out.println("SEXO : " + sexo);
		System.out.println("ESTADO CÍVIL : " + estadoCivil);

	}

}
