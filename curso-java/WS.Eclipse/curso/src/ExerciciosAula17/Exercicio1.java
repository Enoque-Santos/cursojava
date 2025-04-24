package ExerciciosAula17;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		boolean notaValida = false;
		
		while(!notaValida) {
			
			System.out.println("DIGITE UMA NOTA EM 0 E 10 :");
			double nota = scan.nextDouble();
			
			if(nota>= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("VOCÊ DIGITOU A NOTA : " + nota);
			}else {
				System.out.println("NOTA INVÁLIDA: " + nota );
			}
		}	
		
	}

}
