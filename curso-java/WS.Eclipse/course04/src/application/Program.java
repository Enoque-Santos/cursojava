package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.println("Informe nome :");
		emp.name = sc.nextLine();
		System.out.println("Informe salario :");
		emp.grossSalary = sc.nextDouble();
		System.out.println("Informe taxa :");
		emp.tax = sc.nextDouble();
		
		System.out.println();		
		System.out.println(emp);
		
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		double porcentage = sc.nextDouble();
		emp.increase(porcentage);
		
		System.out.println();
		System.out.println("Update data: " + emp);
	
		
		
		
	}

}
