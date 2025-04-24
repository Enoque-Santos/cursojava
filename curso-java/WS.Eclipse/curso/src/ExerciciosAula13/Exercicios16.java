package ExerciciosAula13;

import java.util.Scanner;

public class Exercicios16 {

	public static void main(String[] args) {
		// litro por metro quadrado no caso 1litro para cada 3metros 
		double litro = 3;
		double valorLata = 80.00;
		double lataGrande = 18;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o tamando em metros área a ser pintada:");
		double areaQuadrado = scan.nextDouble();
		
		double metroLitro = areaQuadrado/ litro;
		
		//System.out.println(metroLitro);
		
		if(metroLitro < lataGrande) {
			System.out.println("Para essa metragem irá usar " + metroLitro 
					+ " litros e o valor será: R$ " + valorLata);
			
		}else {
			double totalLatas = 0;
			double valorTotal = valorLata * totalLatas;
			System.out.println("Para essa metragem irá usar " + metroLitro 
					+ " litros e o valor será: R$ " + valorLata);
		}
		
		

	}

}
