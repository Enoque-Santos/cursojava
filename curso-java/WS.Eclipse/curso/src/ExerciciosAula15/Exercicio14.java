package ExerciciosAula15;

import java.util.Scanner;
 
public class Exercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Informe primeira nota :");
		double primeiraNota = scan.nextDouble();
		
		System.out.println("Informe segunda nota :");
		double segundaNota = scan.nextDouble();
		String conceito = "";
		double media = (primeiraNota + segundaNota)/2;
		
		if(media >= 9 && media <= 10) {
			conceito = "A";
		}else if(media >= 7.5 && media < 9) {
			conceito = "B";
		}else if(media >= 6 && media < 7.5) {
			conceito = "C";
		}else if(media >= 4 && media < 6) {
			conceito = "D";
		}else if(media >=0 && media <4){
			conceito = "E";
		}
		
		System.out.println("Média de Aproveitamento             Conceito");
		System.out.println("Média : " + media + "                        " +  conceito);
		System.out.println("Notas 1 : " + primeiraNota);
		System.out.println("Notas 2 : " + segundaNota);
		
		switch(conceito) {
		case "A":
		case "B":	
		case "C":System.out.println("APROVADO");break;
		case "D":
		case "E":System.out.println("REPROVADO");break;
		}
		
		
	   /*		
		}else if(media >= 4 && media < 6) {
			conceito= "D";			
			System.out.println("Média de Aproveitamento             Conceito");
			System.out.println("Média : " + media + "                        " +  conceito + " - REPROVADO");
			System.out.println("Notas 1 : " + primeiraNota);
			System.out.println("Notas 2 : " + segundaNota);
			
		}else if(media >=6  && media <7.5) {
			conceito= "C";			
			System.out.println("Média de Aproveitamento             Conceito");
			System.out.println("Média : " + media + "                        " +  conceito + " - APROVADO");
			System.out.println("Notas 1 : " + primeiraNota);
			System.out.println("Notas 2 : " + segundaNota);
			
		}else if(media >= 7.5 && media < 9) {
			conceito= "B";			
			System.out.println("Média de Aproveitamento             Conceito");
			System.out.println("Média : " + media + "                        " +  conceito + " - APROVADO");
			System.out.println("Notas 1 : " + primeiraNota);
			System.out.println("Notas 2 : " + segundaNota);
			
		}else {
			conceito= "A";			
			System.out.println("Média de Aproveitamento             Conceito");
			System.out.println("Média : " + media + "                        " +  conceito + " - APROVADO");
			System.out.println("Notas 1 : " + primeiraNota);
			System.out.println("Notas 2 : " + segundaNota);
		*/
	}

}
