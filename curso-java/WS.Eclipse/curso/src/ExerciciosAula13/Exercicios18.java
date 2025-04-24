package ExerciciosAula13;

import java.util.Scanner;

public class Exercicios18 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);			
		System.out.print(" Informe o tamanho do arquivo :");
		double arquivo = scan.nextDouble();
		System.out.print(" Informe a velocidade da internete :");
		double velocInternet = scan.nextDouble();
		
		double tempo = arquivo / velocInternet;
		
		System.out.print(" O tempo aproximado para download é : " + tempo);
		
	}

}
