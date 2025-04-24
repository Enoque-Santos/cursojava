package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;

	public double netSalary() {
		return grossSalary - tax;
	}

	public void increase(double porcentage) {
		grossSalary += grossSalary * porcentage/ 100;
	}
	
	public String toString() {
		return "EMPLOYEE: " + name +
			   ", $ "+ String.format("%.2f",  netSalary());
			
	}
}
