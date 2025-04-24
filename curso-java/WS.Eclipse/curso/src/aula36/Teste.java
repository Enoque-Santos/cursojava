package aula36;

public class Teste {

	public static void main(String[] args) {

		Contato contato = new Contato();

		contato.setNome("Enoque");
	

		// criar objeto endereco

		Endereco end = new Endereco();

		end.setNomeRua("rua Game of thrones");
		end.setNumero("n/a");
		end.setComplemento("-");
		end.setCidade("kings Landing");
		end.setEstado("Westeros");
		end.setCep("9999999");

		contato.setEndereco(end);
		// relaconamento tem-um telefone

		Telefone tel1 = new Telefone();
		tel1.setTipo("Celular");
		tel1.setDdd("11");
		tel1.setNumero("99999-9999");
		
		Telefone tel2 = new Telefone();
		tel2.setTipo("Casa");
		tel2.setDdd("11");
		tel2.setNumero("88888-8888");
		
		Telefone [] telefones =  new Telefone[2];		
		telefones[0] = tel1;
		telefones[1] = tel2;		
		contato.setTelefones(telefones);

		// teste saida no console
		System.out.println(contato.getNome());
		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		//if (contato != null && contato.getTelefone() != null) {
		//	System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
		//}
		if (contato != null && contato.getTelefones() != null) {
			for(Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}
		
	}

}
