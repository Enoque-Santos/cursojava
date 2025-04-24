import java.util.Scanner;

public class Aula04Exercicio02 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("INFORME N");
		int n = sc.nextInt();
		
		int in = 0;
		int out = 0;
		
		for(int i= 0; n>i; i++) {
				
			System.out.println("INFORME X");
			int x = sc.nextInt();
			
			if(x>=10 && x<=20) {
				in++;
			}else {
				out++;
			}
			
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		
		
		
		sc.close();
	}

}
