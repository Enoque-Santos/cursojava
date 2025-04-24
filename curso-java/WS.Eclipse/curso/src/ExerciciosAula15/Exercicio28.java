package ExerciciosAula15;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat();
		
		double valor = 0;
		double valorDescont = 0;
		double preco = 0;
		double precoPAGAR = 0;
		
		System.out.println("INFORME TIPO DA CARNE  (FD) - FILE DUPLO, (AL) - ALCATRA, (PI) - PICANHA :");
		String tipoCarne = scan.next();

		System.out.println("INFORME A QUANTIDADE EM (KG):");
		double kilos = scan.nextDouble();

		System.out.println("A COMPRA E NO CARTÃO TABAJARA (S) - SIM , (N) - NÃO:");
		String cartao = scan.next();
		
		if(tipoCarne.equalsIgnoreCase("FD")) {
			if(kilos<=5) {
				preco = 4.90;
			}else if (kilos > 5) {
				preco = 5.80;
			}
		}else if(tipoCarne.equalsIgnoreCase("AL")) {
			if(kilos<=5) {
				preco = 5.90;
			}else if (kilos > 5) {
				preco = 6.80;
			}
			
		}else if(tipoCarne.equalsIgnoreCase("PI")) {
			if(kilos<=5) {
				preco = 6.90;
			}else if (kilos > 5) {
				preco = 7.80;
			}
		}else {
			System.out.println("TIPO DE CARNE FORA DA PROMOÇÃO:");
		}
		valor = preco * kilos;
		
		if(cartao.equalsIgnoreCase("S")) {
			valorDescont = valor * 0.05;
			precoPAGAR = valor - valorDescont;
	 	}
		df.applyPattern("0.00");
		System.out.println("TIPO DE CARNE :                    " + tipoCarne );
		System.out.println("QUANTIDADE DE CARNE EM KILOS : KL. " +kilos);
		System.out.println("PREÇO TOTAL :                  R$. " +valor);
		System.out.println("TIPO DE PAGAMENTO CARTÃO :(S)/(N). " +cartao);
		System.out.println("VALOR DO DESCONTO :            R$. " +df.format(valorDescont));
		System.out.println("VALOR TOTAL A PAGAR  :         R$. " +precoPAGAR);
		
		
		
	 			
	}

}
