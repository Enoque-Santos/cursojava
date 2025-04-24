package ExerciciosAula15;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		double raiz1 = 0;
	    double raiz2 =0;			
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe A :");
		double a= scan.nextDouble();
		if(a!=0) {
			System.out.println("Informe B :");
			double b = scan.nextDouble();
					
			System.out.println("Informe C :");
			double c = scan.nextDouble();
			// calculo do delta
			double delta = Math.pow(b, 2) - (4*a*c);	
			System.out.println(delta);
			if(delta > 0 ) {
				   raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
				   raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
				   System.out.println("Existem duas raizes: x1 = " + raiz1 
				        + " e x2 = " + raiz2);
				 
			}else {
				System.out.println("A raiz não possui raizes reais");
			}
		}else {
			System.out.println("O valor de A igual a 0, a equação não é de 2o grau");
		}
	}

}
