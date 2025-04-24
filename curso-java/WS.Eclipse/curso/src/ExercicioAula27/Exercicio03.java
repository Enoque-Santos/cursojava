package ExercicioAula27;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Aluno disc = new Aluno();

		System.out.println("INFORME PRIMEIRA DISCIPLINA:");
		disc.disciplina1 = sc.nextLine();
		System.out.println("INFORME SEGUNDA DISCIPLINA:");
		disc.disciplina2 = sc.nextLine();
		System.out.println("INFORME TERCEIRA DISCIPLINA:");
		disc.disciplina3 = sc.nextLine();

		System.out.println("INFORME NOTA DA PRIMEIRA DISCIPLINA:");
		disc.nota1 = sc.nextDouble();
		System.out.println("INFORME NOTA DA SEGUNDA DISCIPLINA:");
		disc.nota2 = sc.nextDouble();
		System.out.println("INFORME NOTA DA TERCEIRA DISCIPLINA:");
		disc.nota3 = sc.nextDouble();

		disc.aprovarMateria(disc.nota1, disc.nota2, disc.nota3);

	}

}
