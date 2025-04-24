package ExerciciosAula15;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int centenas = 0;
		int dezenas =  0;
		int unidades = 0;
		
		System.out.println("Informe um número inteiro: ");
		int numeroInt = scan.nextInt();
		
		if(numeroInt <= 1000 && numeroInt > 0 ) {
			centenas =  numeroInt / 100;
			int modCentenas =  numeroInt % 100;
			dezenas = modCentenas / 10;
			int modDezenas =  modCentenas % 10;
			unidades = modDezenas / 1;
			int modUnidades = modDezenas % 1 ;
			
			if(centenas != 0 ) {
				System.out.println(numeroInt + " = " + centenas + " Centenas, " + dezenas + " Dezenas e " + unidades + " Unidades");
			}else if(centenas == 0 && dezenas != 0) {
				System.out.println(numeroInt + " = "  + dezenas + " Dezenas e " + unidades + " Unidades");
			}else if (centenas == 0 && dezenas == 0){
				System.out.println(numeroInt + " = " + unidades + " Unidades");
			}
		}else {
			System.out.println("NÚMERO INVÁLIDO");
		}
	}	

}
