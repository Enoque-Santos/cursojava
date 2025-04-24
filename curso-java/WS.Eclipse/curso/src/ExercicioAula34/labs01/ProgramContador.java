package ExercicioAula34.labs01;

public class ProgramContador {

	public static void main(String[] args) {
	
		
		Contador.incrementar();
		imprimirValor();
		Contador.zerar();
		imprimirValor();
		Contador.incrementar();
		Contador.incrementar();
		imprimirValor();

	}
	
	public static void imprimirValor() {
		System.out.println(Contador.obterValor());
	}
	
	

}
