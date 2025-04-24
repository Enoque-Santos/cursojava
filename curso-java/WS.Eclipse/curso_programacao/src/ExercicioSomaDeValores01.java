import java.util.Scanner;

public class ExercicioSomaDeValores01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int primeiroValor = 0;
		int segundoValor = 0;
		int resultado = 0;
		
		System.out.println("Digite primeiro valor");
		primeiroValor = sc.nextInt();
		
		System.out.println("Digite segundo valor");
		segundoValor = sc.nextInt();
		
		resultado = primeiroValor + segundoValor;
		
		System.out.println("O resultado é :" + resultado);
		
		sc.close();
		
		
	}

}
