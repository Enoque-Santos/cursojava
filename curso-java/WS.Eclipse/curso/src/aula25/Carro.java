package aula25;

public class Carro {
	// aula 24
	String marca;
	String modelo;
	int numPassageiro;
	double capCombustivel;
	double consumoCombustivel;

	// aula 25
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " KM ");

	}

	// aula 26
	double obterAutonomia() {

		System.out.println("Método obterAutonomia foi chamado");
		return capCombustivel * consumoCombustivel;
	}

	// aula 27
	double calcularCombustivel(double km) {

		double obterCombustivel = km / consumoCombustivel;

		return obterCombustivel;
	}

}
