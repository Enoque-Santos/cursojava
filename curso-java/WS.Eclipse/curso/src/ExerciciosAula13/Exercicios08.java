package ExerciciosAula13;

import java.util.Scanner;

public class Exercicios08 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);			
		System.out.print(" Quanto você ganha por hora :");
		double porHora = scan.nextDouble();
		System.out.print(" Total de horas trabalhada :");
		double trabalhoHora = scan.nextDouble();
		double salario = trabalhoHora * porHora;
		
		System.out.print(" Total do salário no mês referido : " + salario);
		
		
		

	}

}
