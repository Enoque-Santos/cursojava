package ExerciciosAula15;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe preço do primeiro produto : R$");
		double preco1 = scan.nextDouble();
		System.out.println("Informe preço do segundo produto :  R$");
		double preco2 = scan.nextDouble();
		System.out.println("Informe preço do terceiro produto : R$");
		double preco3 = scan.nextDouble();
 
		// mostra o menor preço
		if (preco1 < preco3 && preco1 < preco2) {
			System.out.println("Primeiro produto e mais barato : R$" + preco1);
		} else if (preco3 > preco2) {
			System.out.println("Segundo produto e mais barato :  R$" + preco2);
		} else {
			System.out.println("Terceiro produto e mais barato : R$" + preco3);
		}
	}

}
