package ExercicioAula34.labs01;

public class Contador {
	
	private static int contador;
	
	
	
	public Contador() {
		incrementar();
	}
	
	public static void incrementar() {
		contador++;
		
	}
	
	public static void zerar() {
		contador = 0;
	}
	
	public static int obterValor() {
		return contador;
	}
	
	
}
