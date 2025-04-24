package curso.java.aula16;

import java.util.Scanner;
public class LoopWhile {

	public static void main(String[] args) {
		int i = 1;//contador 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o maximo :");
		int max = scan.nextInt();
		
		while(i <= max) {
			System.out.println("O valor de i : " + i);
			i++;
		}
		System.out.println("O valor de i : " + i);
		do {
			i++;
			System.out.println("O valor de i : " + i);
		}while( i < 30);
			System.out.println("O valor de i : " + i);
	}
}	

	
