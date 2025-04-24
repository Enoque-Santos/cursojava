package ExerciciosAula15;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o seu sexo (M) - Masculino, (F) - Feminino:");
		String sexo = scan.nextLine();
		
		
		switch(sexo.toUpperCase()){ 
		
		case "M": System.out.println("Masculino"); break;
		case "F": System.out.println("Feminino"); break;
		default : System.out.println("Sexo invalido");
		
		}
		
	}

}
