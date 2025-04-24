package ExerciciosAula15;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Em que turno você estuda : "
				+ " (M) - Matutino,  (V) - Vespertino, (N) - Noturno");
		String turno = scan.next();
	
		if(turno.length() > 1) {
			System.out.println("INVALIDO - DIGITE (M) - Matutino,  "
					+ "(V) - Vespertino, (N) - Noturno");
		}else {
			switch (turno.toUpperCase()) {
			case "M":System.out.println("BOM DIA");break;
			case "V":System.out.println("BOA TARDE");break;	
			case "N":System.out.println("BOA NOITE");break;
			default : System.out.println("VALOR INVÁLIDO");break;
			}
		}

	}

}
