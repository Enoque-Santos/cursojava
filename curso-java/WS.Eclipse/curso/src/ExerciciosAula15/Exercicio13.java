package ExerciciosAula15;

import java.util.Scanner;

import curso.java.aula15.SwitchCase;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe dia da semana :");
		int semana = scan.nextInt();
		switch (semana) {
		case 1:
			System.out.println("Domigo");	break;
		case 2:
			System.out.println("Segunda - feira");	break;
		case 3:
			System.out.println("Terça - feira"); break;
		case 4:
			System.out.println("Quarta - feira"); break;
		case 5:
			System.out.println("Quinta - feira"); break;
		case 6:
			System.out.println("Sexta - feira"); break;
		case 7:
			System.out.println("Sabado");	break;
		default:
			System.out.println("VALOR INVÁLIDO");
		}
	}

}
