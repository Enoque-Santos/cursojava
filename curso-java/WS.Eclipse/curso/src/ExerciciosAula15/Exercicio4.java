package ExerciciosAula15;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe uma letra:");
		String letra = scan.next();
		
		if(letra.length() >1) {
			System.out.println("Não é uma letra valida");
		}else {
			switch(letra.toUpperCase()){
			case "A":
			case "E":	 
			case "I":
			case "O":
			case "U":System.out.println("Letra digitada e uma vogal"); break;	
			default : System.out.println("Letra digitada consoante");
			}
		}
	}
}	

