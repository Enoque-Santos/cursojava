package ExerciciosAula17;

public class LoopFor {

	public static void main(String[] args) {
	    // para incremento 
		// for normal
		/*for( int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		// para decremento
		// for normal
		for( int i = 5; i > 0 ; i--) {
			System.out.println(i);
		}
		// usar dois valores no for vai para quando i for < que j
		for( int i = 0, j = 10; i < j ; i++ , j -- ) {
			System.out.println("i e igual a " + i + " J e igual a " + j);
		}
		*/
		// for com partes ausentes.
		/*int i = 0;
		for( ; i < 10; ) {
			System.out.println(i);
			i +=2;
		}*/
		
		// for de soma 
		
		int soma = 0;
		
		for( int i = 1; i< 5; soma+= i++) {
			System.out.println(soma);
		}
			
	}

}
