package ExerciciosAula15;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double resultado = 0;
		String negPosit = "";
		String parImpar = "";
		String IntDec = "";

		System.out.println("Informe primeiro número : ");
		double numero1 = scan.nextDouble();

		System.out.println("Informe segundo número : ");
		double numero2 = scan.nextDouble();

		System.out.println("Qual a operação que deseja realizar : ");
		String operacao = scan.next();
		boolean valida = true;
		
		switch(operacao){
			case "+":	resultado = numero1 + numero2;break;
			case "-":	resultado = numero1 - numero2;break;
			case "*":	resultado = numero1 * numero2;break;
			case "/":	resultado = numero1 / numero2;break;
			default: 
			System.out.println("OPERAÇÂO INVALIDA");
			valida = false ;
		
		}
		System.out.println(resultado);
		if(valida) {
				
			if (resultado % 2 == 0) {
				parImpar = "PAR";
			} else {
				parImpar = "IMPAR";
			}
			if (resultado < 0) {
				negPosit = "NEGATIVO";
			} else {
				negPosit = "POSITIVO";
			}
			//System.out.println(resultado);
			double resultDecInt = Math.floor(resultado);
			//System.out.println(resultDecInt);
			if (resultDecInt != resultado) {
				IntDec = "DECIMAL";
			} else {
				IntDec = "INTEIRO";
			}
	 
			System.out.println("RESULTADO DA OPERAÇÃO: " + parImpar );
			System.out.println("RESULTADO DA OPERAÇÃO: " + negPosit );
			System.out.println("RESULTADO DA OPERAÇÃO: " + IntDec );
		}
	}	
}
