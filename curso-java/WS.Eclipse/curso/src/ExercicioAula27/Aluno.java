package ExercicioAula27;

public class Aluno {

	String nome;

	String curso;
	String disciplina1;
	String disciplina2;
	String disciplina3;
	int matricula;
	double nota1;
	double nota2;
	double nota3;
	double media;
	String status;

	void aprovarMateria(double nota1, double nota2, double nota3) {
		if (nota1 >= 7 && nota1 <= 10) {
			System.out.println("MATERIA : " + disciplina1);
			System.out.println("APROVADO NOTA: " + nota1);
		} else if (nota1 < 7 && nota1 > 0) {
			System.out.println("MATERIA : " + disciplina1);
			System.out.println("REPROVADO NOTA: " + nota1);
		}
		if (nota2 >= 7 && nota2 <= 10) {
			System.out.println("MATERIA : " + disciplina2);
			System.out.println("APROVADO NOTA: " + nota2);
		} else if (nota2 < 7 && nota2 > 0) {
			System.out.println("MATERIA : " + disciplina2);
			System.out.println("REPROVADO NOTA: " + nota2);
		}
		if (nota3 >= 7 && nota3 <= 10) {
			System.out.println("MATERIA : " + disciplina3);
			System.out.println("APROVADO NOTA: " + nota3);
		} else if (nota3 < 7 && nota3 > 0) {
			System.out.println("MATERIA : " + disciplina3);
			System.out.println("REPROVADO NOTA: " + nota3);
		}

	}

	double calcularMédia(double nota1, double nota2, double nota3) {
		return media = nota1 + nota2 + nota3 / 3;
	}
}
