package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.println("ENTER PRODUCT DATA");
		System.out.print("NAME: ");
		String name = sc.nextLine();
		System.out.print("PRICE: ");
		double price = sc.nextDouble();
		System.out.print("QUANTITY IN STOCK: ");
		int quantity = sc.nextInt();

		Product product = new Product(name, price, quantity);
		
		System.out.println();
		System.out.println("Produtc data " + product);

		System.out.println();
		System.out.println("Enter the number of products to be added in stock:");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println("Update data " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock:");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println("Update data " + product);

		sc.close();

	}

}
