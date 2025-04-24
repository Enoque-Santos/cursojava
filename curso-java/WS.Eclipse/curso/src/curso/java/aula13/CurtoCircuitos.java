package curso.java.aula13;

public class CurtoCircuitos {

	public static void main(String[] args) {
		
		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1 = falso & verdadeiro;
		// aqui ele nao avalia a segunda expressao ou seja o verdadeiro pq ja 
		// entende por motivos da expressao falso mais o && que vai dar falso
		boolean resultado2 = falso && verdadeiro;
		
		System.out.println(resultado1);
		System.out.println(resultado2);
		
	}

}
