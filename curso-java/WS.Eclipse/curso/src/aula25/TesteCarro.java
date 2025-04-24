package aula25;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "fiat";
		van.modelo = "Ducato";
		van.numPassageiro = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		van.exibirAutonomia();	
		double autonomia = van.obterAutonomia();
		
		double qtdeCombustivel10 = van.calcularCombustivel(10);
		double qtdeCombustivel15 = van.calcularCombustivel(15);
		
		System.out.println("Autonomia do carro é: " + autonomia);
		System.out.println("Autonomia do carro é: " + van.obterAutonomia());
		
		System.out.println("qtdeCombustivel10 " + qtdeCombustivel10);
		System.out.println("qtdeCombustivel15 " + qtdeCombustivel15);
		
	}

}
