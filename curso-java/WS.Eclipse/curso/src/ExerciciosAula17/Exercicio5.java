package ExerciciosAula17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		double paisA = 0;
		double paisB = 0;
		double taxaPaisA = 0;
		double taxaPaisB = 0;
		double anos = 0;
		boolean valida = false;
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		
		while (!valida) {
			System.out.println("INFORME A POPULAÇÃO PAIS A :");
			paisA = scan.nextDouble();
			if (paisA > 0) {
				valida = true;
			} else {
				System.out.println("POPULAÇÃO MAIOR QUE 0 :");
			}
		}
		valida = false;
				
		while (!valida) {
			System.out.println("INFORME A POPULAÇÃO PAIS B :");
			paisB = scan.nextDouble();
			if (paisB > 0) {
				valida = true;
			} else {
				System.out.println("POPULAÇÃO MAIOR QUE 0 :");
			}
		}
		valida = false;
		
		while (!valida) {
			System.out.println("INFORME A TAXA DA POPULAÇÃO PAIS A :");
			taxaPaisA = scan.nextDouble();
			if (taxaPaisA > 0) {
				valida = true;
			} else {
				System.out.println("POPULAÇÃO MAIOR QUE 0 :");
			}
		}
		
		valida = false;
		
		while (!valida) {
			System.out.println("INFORME A TAXA DA POPULAÇÃO PAIS B :");
			taxaPaisB = scan.nextDouble();
			if (taxaPaisB > 0) {
				valida = true;
			} else {
				System.out.println("POPULAÇÃO MAIOR QUE 0 :");
			}
		}
		
		while (paisA < paisB) {

			paisA += (taxaPaisA/100)*paisA;
			paisB += (taxaPaisB/100)*paisB;
			anos++;

		}
		df.applyPattern("0000");
		System.out.println("PAIS A ULTREPASSOU O B EM : " + anos + " anos");
		System.out.println("PORCENTAGEM PAIS A : " + df.format(paisA));
		System.out.println("PORCENTAGEM PAIS B : " + df.format(paisB));

	}
}
