package curso.java.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a idade:");
		double idade = scan.nextDouble();
		
		if(idade >=18) {
			System.out.println("É maior de idade:");
		}else {
			System.out.println("Não é maior de idade:");
		}
		
		
	}

}
