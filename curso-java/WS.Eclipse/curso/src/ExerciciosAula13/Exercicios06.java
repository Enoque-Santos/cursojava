package ExerciciosAula13;

import java.util.Scanner;

public class Exercicios06 {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);			
		System.out.print(" Digite raio :");
		double raio = scan.nextDouble();
	
		double area = Math.PI * Math.pow(raio,2);
		System.out.print(" O dobro da área do quadrado é :" + area);
		
		
	}

}
