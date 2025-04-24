package aula24;

public class Exerci03LivroLivraria {

	public static void main(String[] args) {
		
		LivroLivraria livro = new LivroLivraria();

		livro.autor = "Eduardo";
		livro.genero = "Aventura";
		livro.nome = "Filhos do Eden";
		livro.paginas = 600;
		livro.anoLancamento = 2015;
		livro.preco = 63.69;
	
		
		System.out.println(livro.autor);
		System.out.println(livro.nome);
			

	}

}
