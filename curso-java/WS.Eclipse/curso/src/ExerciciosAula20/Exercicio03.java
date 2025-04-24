package ExerciciosAula20;

import java.util.Random;

public class Exercicio03 {

	public static void main(String[] args) {
	
		/*
		 * Capture do teclado valores para preenchimento de uma matriz M 
			3x3. Após a captura imprima a matriz criada e encontre a 
			quantidade de números pares, a quantidade de números ímpares
		 */
		
		int[][] numerosAleatorios = new int[3][3];

		Random numeroRandom = new Random();

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(100);
			}
		}
		
	}
}
