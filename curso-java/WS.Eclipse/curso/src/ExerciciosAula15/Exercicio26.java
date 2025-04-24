package ExerciciosAula15;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {

		double litros = 0;
		double desconto = 0;
		double valorComb = 0;
		double precoGasolina = 2.5;
		double precoAlcool = 1.9;

		Scanner scan = new Scanner(System.in);
		System.out.println("TIPOCOMBUSTÍVEL ÁLCOOL(A) / GASOLINA(G) : ");
		String tipoCombustivel = scan.next();

		if (tipoCombustivel.equalsIgnoreCase("A") || tipoCombustivel.equalsIgnoreCase("G")) {

			System.out.println("QUANTOS LITROS DESEJA COLOCAR : ");
			litros = scan.nextDouble();

			if (tipoCombustivel.equals("A")) {
				
				if (litros <= 20) {
					desconto = 0.03;

				} else {
					desconto =0.05;
				}
				valorComb = precoAlcool * litros; 
			} else if (tipoCombustivel.equals("G")) {
				if (litros <= 20) {
					desconto = 0.04;

				} else {
					desconto = 0.06;
				}
				valorComb = precoAlcool * litros; 
			}
			double result = valorComb * desconto ;
			
			double resultFinal = valorComb - result;

		//	System.out.println(resultFinal);

			System.out.println("Preço FInal R$ " + resultFinal);

		}else {
			System.out.println("TIPO DE COMBUSTÍVEL ERRADO");

		}
		
	}
}
