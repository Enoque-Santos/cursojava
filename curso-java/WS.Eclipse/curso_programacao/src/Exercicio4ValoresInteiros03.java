import java.util.Scanner;

public class Exercicio4ValoresInteiros03 {

	public static void main(String[] args) {
		
		int a , b , c , d , diferenca;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite primeiro valor");
		a = sc.nextInt();
		System.out.println("Digite segundo valor");
		b = sc.nextInt();
		System.out.println("Digite terceiro valor");
		c = sc.nextInt();
		System.out.println("Digite quarto valor");
		d = sc.nextInt();
		
		diferenca = (a * b - c * d);
		
		System.out.println(" O calculo da diferença do produto de A e B pelo produto de C e D = " + diferenca);
		
		sc.close();
		
		

	}

}
