package ExerciciosAula13;

import java.util.Scanner;

public class Exercicios03 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);			
		System.out.print(" Digite seu primeiro número :");
		int primeiroNumero = scan.nextInt();
		System.out.print(" Digite seu segundo número :");
		int segundoNumero = scan.nextInt();
		
		int soma = primeiroNumero + segundoNumero;
		System.out.print(" A soma dos números informados são :" + soma);
				

	}

}
