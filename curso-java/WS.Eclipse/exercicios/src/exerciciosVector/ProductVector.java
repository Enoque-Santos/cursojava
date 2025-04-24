package exerciciosVector;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProductVector {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		Product [] vect =  new Product [n];
		double sum = 0.0;
		
		for (int i =0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
			sum += vect[i].getPrice();
			
		}
		double avr = sum /vect.length;
		
		System.out.printf("AVERAGE " + String.format("%.2f", avr));
		
		sc.close();

	}

}
