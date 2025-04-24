package ExerciciosAula13;

import java.util.Scanner;

public class Exercicios09 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);			
		System.out.print(" Digite temperatura em graus Farenheit :") ;
		double grauF = scan.nextInt();
		
		double grauC = (5*(grauF - 32)/9);
		System.out.print(" Temperatura em graus Celsius é :" + grauC);
		
		
	}

}
