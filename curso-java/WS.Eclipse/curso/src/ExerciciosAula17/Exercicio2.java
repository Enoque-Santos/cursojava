package ExerciciosAula17;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean validaSenha = false;
		String senha;
		String nome;
		
		while(!validaSenha) {
			
			System.out.println("INFORME SEU NOME :");
			nome = scan.next();
		
			System.out.println("INFORME SUA SENHA :");
			senha = scan.next();
		
			if(nome.equalsIgnoreCase(senha)) {
				System.out.println("SENHA IGUAL AO NOME, INFORMAR UMA SENHA VÁLIDA :");
			}else if (!nome.equalsIgnoreCase(senha)) {
				validaSenha = true;
				System.out.println("SENHA VÁLIDA: ");
			}
			
		}
		
	}

}
