package ExerciciosAula13;

import java.util.Scanner;

public class Exercicios15 {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);			
		System.out.print(" Quanto você ganha por hora :");
		double porHora = scan.nextDouble();
		System.out.print(" Total de horas trabalhada :");
		double trabalhoHora = scan.nextDouble();
		double salario = trabalhoHora * porHora;
		
		double ir = (salario * 11)/100; 
		double inss = (salario * 8)/100; 
		double sindicato = (salario * 5)/100; 
		double descontos =  ir + inss + sindicato;
		double salarioLiquido = salario - ir - inss - sindicato;
		
		System.out.println(" Total do salário no mês referido : ");
		System.out.println(" Salario Bruto   : R$: " + salario );
		System.out.println(" IR              : R$: " + ir);
		System.out.println(" INSS            : R$: " + inss);
		System.out.println(" Sindicato       : R$: " + sindicato);
		System.out.println(" Descontos       : R$: " + descontos);
		System.out.println(" Salario Liquido : R$: " + salarioLiquido );
		
	}

}
