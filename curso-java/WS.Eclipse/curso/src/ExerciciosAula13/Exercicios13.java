package ExerciciosAula13;

import java.util.Scanner;

public class Exercicios13 {

	public static void main(String[] args) {
		
		double peso = 0;

		Scanner scan = new Scanner(System.in);
		System.out.print(" Digite sua altura :");
		double altura  = scan.nextDouble();
		
		System.out.print(" Digite (M) masculino - (F) Feminino :");
		String sexo = scan.nextLine();
		
		if(sexo != "" && sexo == "M") {
		   peso = (72.7 * altura)-58;
		}else if(sexo != "" && sexo == "F"){
		   peso = (62.1*altura) - 44.7;
		}
		if(peso != 0) {
			System.out.print(" Digite seu peso :");
			double pesoPessoa  = scan.nextDouble();
			if(peso != pesoPessoa) {
				if(pesoPessoa> peso) {
					System.out.print(" Você esta acima do peso :");
				}else {
					System.out.print(" Você esta abaixo do peso :");
				}
			}else {
				System.out.print(" Você esta dentro do peso :");
			}
		}
	}

}
