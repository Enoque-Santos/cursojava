package exerciciosVector;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("QUANTOS VALORES VAI TER CADA VECTOR?");
		int number = sc.nextInt();
		
		int[] vectA = new int [number]; 
		int[] vectB = new int [number]; 
		int[] result = new int[number];
		
		System.out.println("DIGITE OS VALORES DO VECTOR A:");		
		for( int i= 0; i<vectA.length; i++) {
			vectA[i] = sc.nextInt();
		}
		System.out.println("DIGITE OS VALORES DO VECTOR B:");		
		for( int i= 0; i<vectB.length; i++) {
			vectB[i] = sc.nextInt();
		}
		
		System.out.println("VECTOR RESULTANTE:");		
		for( int i= 0; i<number; i++) {
			result[i] = vectA[i] + vectB[i]; 
		}
		for( int i= 0; i<number; i++) {
			System.out.println(result[i]);
			 
		}
		

	}

}
