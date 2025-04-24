package ExerciciosAula15;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
	/*	double por20 = 0.20;
		double por15 = 0.15;
		double por10 = 0.10;
		double por5 = 0.05;
		double aumento = 0;
		double valorTotalSalario = 0;
		*/
		int percentual = 0;
		double aumento = 0;
		double salarioAjustado = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe salário :");
		
		double salario = scan.nextDouble();

		if (salario <= 280) {
			percentual = 20;
		}else if (salario > 280 && salario < 700) {
			percentual = 15;
		} else if (salario >= 700 && salario < 1500) {
			percentual = 10;
		}else {
			percentual = 5;
		}
		
		aumento =(salario / 100) * percentual;
		salarioAjustado = salario + aumento;
		
		System.out.println("Salario: R$" + salario);
		System.out.println("Porcentual : " + percentual);
		System.out.println("Valor do aumento : R$" + aumento);
		System.out.println("Valor do salario, após aumento :  R$" + salarioAjustado);
		
		/*if (salario <= 280) {
			aumento = (salario * por20);
			valorTotalSalario = aumento + salario;
			System.out.println("Salario antes do reajuste :       R$" + salario);
			System.out.println("Porcentual de aumento aplicado  : 20%");
			System.out.println("Valor do aumento :                R$" + aumento);
			System.out.println("Valor do salario, após aumento :  R$" + valorTotalSalario);
		} else if (salario > 280 && salario < 700) {
			aumento = (salario * por15); 
			valorTotalSalario = aumento + salario;
			System.out.println("Salario antes do reajuste :       R$" + salario);
			System.out.println("Porcentual de aumento aplicado  : 15%");
			System.out.println("Valor do aumento :                R$" + aumento);
			System.out.println("Valor do salario, após aumento :  R$" + valorTotalSalario);
		} else if (salario >= 700 && salario < 1500) {
			aumento = (salario * por10);
			valorTotalSalario = aumento + salario;
			System.out.println("Salario antes do reajuste :       R$" + salario);
			System.out.println("Porcentual de aumento aplicado  : 10%");
			System.out.println("Valor do aumento :                R$" + aumento);
			System.out.println("Valor do salario, após aumento :  R$" + valorTotalSalario);
		} else {
			aumento = (salario * por5);
			valorTotalSalario = aumento + salario;
			System.out.println("Salario antes do reajuste :       R$" + salario);
			System.out.println("Porcentual de aumento aplicado  : 5%");
			System.out.println("Valor do aumento :                R$" + aumento);
			System.out.println("Valor do salario, após aumento :  R$" + valorTotalSalario);
		}*/
		

	}

}
