package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle retangle = new Rectangle();

		System.out.println(" Enter rectangle width and height:");
		System.out.print("HEIGHT:");
		retangle.height = sc.nextDouble();
		System.out.print("WIDTH:");
		retangle.width = sc.nextDouble();

		System.out.println(retangle);

	}

}
