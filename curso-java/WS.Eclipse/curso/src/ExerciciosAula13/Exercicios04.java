package ExerciciosAula13;

import java.util.Scanner;

public class Exercicios04 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);			
		System.out.print(" Digite a primeiro nota :");
		double nota1 = scan.nextDouble();
		System.out.print(" Digite a segundo nota :");
		double nota2 = scan.nextDouble();
	    System.out.print(" Digite a terceira nota :");
		double nota3 = scan.nextDouble();
		System.out.print(" Digite a quarta nota :");
		double nota4 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4 )/4; 
		System.out.print(" A média do bimestre é : " + media);

	}

}
