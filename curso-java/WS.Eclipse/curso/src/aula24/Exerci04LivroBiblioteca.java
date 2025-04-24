package aula24;

import java.util.Date;

public class Exerci04LivroBiblioteca {

	public static void main(String[] args) {
		LivroDeBiblioteca livro = new LivroDeBiblioteca();

		livro.autor = "Eduardo";
		livro.genero = "Aventura";
		livro.nome = "Filhos do Eden";
		livro.paginas = 600;
		livro.anoLancamento = 2015;
		livro.dataEntrega = new Date();
		livro.leitor = "loiane";
	
		
		System.out.println(livro.autor);
		System.out.println(livro.nome);

	}

}
