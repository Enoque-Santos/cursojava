package pratica;

import java.util.Scanner;

public class Pratica {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
	
	
		System.out.println("Digite nome");		
		String nome = scan.next();
		
		
		System.out.println("Digite idade");		
		int idade = scan.nextInt();
		
		System.out.println("Digite data de nascimento");
		
		double dataNasc = scan.nextDouble();
		System.out.println("Seus dados são : "+ "\n" + nome+ "\n" + idade +"\n" + dataNasc );
		
	}

}
