import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Locale.setDefault(Locale.US);
		
		//System.out.println("Olá Mundo");
		//System.out.println("Bom dia");
		
		int y = 32;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		/*
		 * %f = ponto flutuante
		 * %d = inteiro
		 * %s = texto
		 * %n = quebra de linha
		 */
		
		
		
		
		System.out.println(y);
		
		double x = 10.35784;
		
		System.out.printf("%.2f\n",x);
		System.out.printf("%.4f\n",x);
		
		System.out.println("RESULTADO  = " + x + " METROS");
		System.out.printf("RESULTADO  =  %.2f METROS %n", x);
		System.out.printf("%s tem %d ano e ganha R$ %.2f reais%n", nome, idade , renda);
		
	}

}
