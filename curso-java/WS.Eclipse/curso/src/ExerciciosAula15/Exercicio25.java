package ExerciciosAula15;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		
		int cont = 0;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("TELEFONOU PARA VÍTIMA  (S / N) ?");
		String pergunta1 = scan.next();
		
		System.out.println("ESTEVE NO LOCAL DO CRIME (S / N) ? ");
		String pergunta2 = scan.next();
		
		System.out.println("MORA PERTO DA VÍTIMA (S / N) ? ");
		String pergunta3 = scan.next();
		
		System.out.println("DEVIA PARA A VÍTIMA (S / N) ? ");
		String pergunta4 = scan.next();
		
		System.out.println("JÁ TRABALHOU COM A VÍTIMA (S / N) ? : ");
		String pergunta5 = scan.next();
		
		
		if(pergunta1.equals("S")){
			cont  = +1;
		}
		if(pergunta2 .equals("S")){
			cont  = cont+1;
		}	
		if(pergunta3 .equals("S")){
			cont  = cont+1;
		}
		if(pergunta4 .equals("S")){
			cont  = cont +1;
		}
		if(pergunta5 .equals("S")){
			cont  = cont +1;
		
		}
	   	switch(cont) {
		case 2: System.out.println("SUSPEITA");break;
		case 3: 
		case 4: System.out.println("CUMPLÍCE");break;
		case 5: System.out.println("ASSASSINO");break;
		default : System.out.println("INOCENTE");
		}
		

	}

}
