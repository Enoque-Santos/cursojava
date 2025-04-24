import java.util.Scanner;

public class Aula03Exercicio03 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		System.out.println("INFORMA COMBUSTIVEL 1 - ALCOOL, 2 - GASOLINA, 3 - DIESEL");
		int combustivel = sc.nextInt();
		
		while(combustivel != 4) {
			
			if(combustivel == 1) {
				alcool++;
			}else if(combustivel == 2) {
				gasolina++;
			}else if(combustivel == 3) {
				diesel++;
			}
			System.out.println("INFORMA COMBUSTIVEL 1 - ALCOOL, 2 - GASOLINA, 3 - DIESEL");
			combustivel = sc.nextInt();
			
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool " + alcool );
		System.out.println("Gasolina " + gasolina);
		System.out.println("Diesel " + diesel);
		sc.close();
						
	}

}
