package ExercicioAula36.labs;

import java.util.Scanner;

public class ProgramAgenda {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o nome da Agenda:");
		Agenda agenda = new Agenda();
		agenda.setNomeAgenda(sc.nextLine());

		System.out.println("Informe 3 contatos");
	
		Contato[] contatos = new Contato[3];

		for (int i = 0; i < 3; i++) {
			Contato contato = new Contato();
			System.out.println("Nome:");
			contato.setNome(sc.next());
			System.out.println("Email");
			contato.setEmail(sc.next());

			System.out.println("Telefone");
			contato.setTelefone(sc.next());			
			contatos[i] = contato;
		}
		agenda.setContatos(contatos);
		if(agenda != null) {
			System.out.println(agenda.toString());
		}
	}

}
