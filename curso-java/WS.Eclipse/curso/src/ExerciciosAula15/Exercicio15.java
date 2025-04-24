package ExerciciosAula15;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe primeiro lado :");
		double primeiroLado = scan.nextDouble();
		
		System.out.println("Informe segundo lado :");
		double segundoLado = scan.nextDouble();
				
		System.out.println("Informe terceiro lado :");
		double terceiroLado = scan.nextDouble();
		
		boolean triangulo = (primeiroLado < segundoLado + terceiroLado) 
				&& (segundoLado < primeiroLado + terceiroLado)
				&& (terceiroLado < primeiroLado + segundoLado);
		
		if ( triangulo == true) {
			boolean equilatero = (primeiroLado == segundoLado) && (segundoLado == terceiroLado);
			boolean isosceles = (primeiroLado == segundoLado) || (segundoLado == terceiroLado) 
					|| (primeiroLado == terceiroLado);
			
			boolean escaleno = (primeiroLado != segundoLado) && (segundoLado != terceiroLado) 
					&&(primeiroLado != terceiroLado);
			
			if ( equilatero == true) {
				System.out.println("TRIÂNGULO EQUILATERO : Três lados iguais;");
			}else if ( isosceles == true) {
				System.out.println("TRIÂNGULO ISÓSCELES : Quaisquer dois lados iguais;");
			}else if ( escaleno == true) {
				System.out.println("TRIÂNGULO ESCALENO : Três lados diferentes;");
			}	
			
		}else {
			System.out.println("NÃO E UM TRIÂNCULO");
		}
				
	}

}
