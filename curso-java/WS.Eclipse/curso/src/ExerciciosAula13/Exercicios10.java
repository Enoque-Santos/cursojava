package ExerciciosAula13;

import java.util.Scanner;

public class Exercicios10 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);			
		System.out.print(" Digite temperatura em graus Celsius :");
		double grauC = scan.nextInt();
		
		double grauF = grauC *1.8+32;
		System.out.print(" Temperatura em graus Farenheit é :" + grauF);
	}

}
