package ExercicioAula34.labs02;

public class ProgramaCalculadora {

	public static void main(String[] args) {

		imprimirValor(Calculadora.dividir(10, 2));

		imprimirValor(Calculadora.soma(10, 2));

		imprimirValor(Calculadora.subtrair(10, 2));

		imprimirValor(Calculadora.potencia(10, 2));

	}

	public static void imprimirValor(double num) {
		System.out.println(Calculadora.obterValor());
	}
}
