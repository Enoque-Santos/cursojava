package ExerciciosAula15;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double valor = 0;
		double valorDescont = 0;
		double valorTotal = 0;
		double preco = 0;
		
		System.out.println("Digite a quantos kilos de fruta :");
		double kilos = scan.nextDouble();

		System.out.println("Digite qual fruta (MO)- Morango, (MA) - MAÇA :");
		String fruta = scan.next();;
		
		if(fruta.equalsIgnoreCase("MO")){
			if(kilos <= 5 ) {
				preco = 2.50;
			}else {
				preco = 2.20;
			}
			
		}else if(fruta.equalsIgnoreCase("MA")){
			if(kilos <= 5 ) {
				preco = 1.80;
			}else {
				preco = 1.50;
			}			
			
		}else {
			System.out.println(" DIGITE A FRUTA CORRETA");
		}
		
		valorTotal = kilos * preco;
		
		if(kilos > 8  || valor > 25){
			
			valorDescont = (valorTotal * 0.10);
			double ValorPagar = valorTotal - valorDescont;
			
			System.out.println("Preço Final R$ " + ValorPagar);
		}else {
			System.out.println("Preço FInal R$ " + valorTotal);
		}
/*
 * totalDeconto = total * percentualDesconto;

		double precoPAGAR = total - totalDeconto;
 */
	}

}
