package ExerciciosAula15;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		String porcent5 = "5%";
		String porcent10 = "10%";
		String porcent11 = "11%";
		String porcent20 = "20%";
		 
		double irSalario = 0;
		double inssSalario = 0;
		double fgtsSalario = 0;
		double desconto = 0;
		double salarioLiquido = 0;
		

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o valor da sua hora trabalhada :");
		double horaTrabalhada = scan.nextDouble();

		System.out.println("Informe quantidade de horas trabalhadas :");
		double qntdTrabalhada = scan.nextDouble();

		double salario = horaTrabalhada * qntdTrabalhada;
		irSalario = (salario * 5)/100;
		inssSalario = (salario * 10)/100;
		fgtsSalario = (salario * 11)/100;
		//double descontosindicato = (salario * 3)/100;
		desconto = (irSalario + inssSalario );
		salarioLiquido  = salario - desconto;
		
		
		if(salario <=0){
			irSalario = 0;
		}else if(salario > 900 && salario <= 1500) {
				irSalario = 5;
		}else if(salario > 1500 && salario <=2500){
				irSalario = 10;
		}else if(salario > 2500 ) {
				irSalario = 20;
		}	
		System.out.println("Salário Bruto: (" + horaTrabalhada + " * " + qntdTrabalhada
				+ ")                       : R$ " + salario);
		System.out.println("(-)  IR " + irSalario + "                                        : R$ " + irSalario);
		System.out.println("(-)  INSS " + porcent10 + "                                     : R$ " + inssSalario);
		System.out.println("FGTS      " + porcent11 + "                                     : R$ " + fgtsSalario);
		System.out.println("Total de desconto                                 : R$ " + desconto);
		System.out.println("Salário Liquido                                   : R$ " + salarioLiquido);
		
		
		/*
		 * 
		 		
		if (salario > 900 && salario <= 1500) {
			System.out.println("Salário Bruto: (" + horaTrabalhada + " * " + qntdTrabalhada
					+ ")                       : R$ " + salario);
			System.out.println("(-)  IR " + porcent5 + "                                        : R$ " + irSalario);
			System.out.println("(-)  INSS " + porcent10 + "                                     : R$ " + inssSalario);
			System.out.println("FGTS      " + porcent11 + "                                     : R$ " + fgtsSalario);
			System.out.println("Total de desconto                                 : R$ " + desconto);
			System.out.println("Salário Liquido                                   : R$ " + salarioLiquido);
		} else if (salario > 1500 && salario <= 2500) {
			System.out.println("Salário Bruto (" + qntdTrabalhada + " * " + horaTrabalhada
					+ ")                       : R$ " + salario);
			System.out.println("(-)  IR " + porcent10 + "                                        : R$ " + irSalario);
			System.out.println("(-)  INSS " + porcent10 + "                                     : R$ " + inssSalario);
			System.out.println("FGTS      " + porcent11 + "                                     : R$ " + fgtsSalario);
			System.out.println("Total de desconto                                 : R$ " + desconto);
			System.out.println("Salário Liquido                                   : R$ " + salarioLiquido);
		} else if (salario > 2500) {
			System.out.println("Salário Bruto (" + qntdTrabalhada + " * " + horaTrabalhada
					+ ")                       : R$ " + salario);
			System.out.println("(-)  IR " + porcent20 + "                                        : R$ " + irSalario);
			System.out.println("(-)  INSS " + porcent10 + "                                     : R$ " + inssSalario);
			System.out.println("FGTS      " + porcent11 + "                                     : R$ " + fgtsSalario);
			System.out.println("Total de desconto                                 : R$ " + desconto);
			System.out.println("Salário Liquido                                   : R$ " + salarioLiquido);
		*/
		
	}
}
