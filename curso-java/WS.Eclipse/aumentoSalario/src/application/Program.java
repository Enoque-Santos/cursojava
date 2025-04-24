package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		// Quantos funcionários serão cadastrados?

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.println("How many employees will be registered?");
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id:");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name:");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Salary:");
			Double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));
			
			
			//Employee emp = new Employee(id, nome, salary);

			//list.add(emp);

		}
		
		System.out.println("Enter the employee id that will have salary increase :");
		int idSalary = sc.nextInt();
		
		//Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		Integer pos = position(list, idSalary);
		if(pos == null) {
			System.out.println("This id does not exist!");
		}else {
			System.out.println("Enter the percentage:");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for(Employee emp: list) {
			System.out.println(emp);
		}
		

	}

	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}

		}
		return null;
	}
	public static boolean hasId(List<Employee> list, int id) {
		// lambda
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
