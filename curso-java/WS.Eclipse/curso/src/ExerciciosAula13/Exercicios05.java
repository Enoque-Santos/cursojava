package ExerciciosAula13;


import java.util.Scanner;

public class Exercicios05 {

	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);			
		System.out.print(" Digite quantos metros :");
		double metros = scan.nextDouble();
		
		double convert = metros*100;
		
		System.out.print(" Apos a conevrsão você tem :" + convert + "cm");

	}

}
