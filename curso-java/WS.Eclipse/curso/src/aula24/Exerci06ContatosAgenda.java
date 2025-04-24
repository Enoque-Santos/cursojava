package aula24;

public class Exerci06ContatosAgenda {
	
	public static void main (String [] args) {
	
		/**
		String [] telefones;
		String nome;
		String email;
		String endereco;
		*/
		
		ContatoAgenda contato1 = new ContatoAgenda();
		
		contato1.nome = "Enoque";
		contato1.email = "enoquesantoz@gmai.com";
		contato1.endereco = "rua Maximo";
		
		contato1.telefones = new String[5];
		contato1.telefones[0] = "99999-9999";
		contato1.telefones[1] = "99999-9998";
		contato1.telefones[2] = "99999-9997";
		contato1.telefones[3] = "99999-9996";
	}

}
