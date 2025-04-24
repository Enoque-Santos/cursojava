package exerciciosVector;

import java.util.Locale;
import java.util.Scanner;

public class Vector {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double [] vect =  new double [n];
		double sum = 0.0;
		for (int i =0; i<n; i++) {
			vect[i] = sc.nextDouble();
			sum += vect[i];
			
		}
		double avr = sum / n;
		System.out.printf("AVERAGE " + String.format("%.2f", avr));
		
		
		
		
		
		
		sc.close();

	}

}
