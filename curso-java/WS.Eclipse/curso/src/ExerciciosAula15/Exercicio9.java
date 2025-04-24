package ExerciciosAula15;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe primeiro número :");
		int num1 = scan.nextInt();
		System.out.println("Informe segundo número :");
		int num2 = scan.nextInt();
		System.out.println("Informe terceiro número :");
		int num3 = scan.nextInt();
			//3,2,1
		if(num1 <= num2 && num1 <= num3 && num2 <= num3){
			System.out.println(num3 + " , " + num2 + " , " + num1);	
			//1,3,2
		}else if(num2 <= num1 && num2 <= num3 && num3 <=num1) {
			System.out.println(num1 + " , " + num3 + " , " + num2);
			//2,1,3 
		}else if(num1 <= num2 && num3 <= num2 && num3 <=num1) {
			System.out.println(num2 + " , " + num1 + " , " + num3);
			//1,2,3
		}else if(num3 <= num2 && num3 <= num1 && num2 <=num1) {
			System.out.println(num1 + " , " + num2 + " , " + num3);
			//3,1,2
		}else if(num2 <= num3 && num2 <= num1 && num1 <=num3) {
			System.out.println(num3 + " , " + num1 + " , " + num2);
			//2,3,1
		}else if(num1 <= num3 && num1 <= num2 && num3 <= num2) {
			System.out.println(num2 + " , " + num3 + " , " + num1);
		}			
	}
}