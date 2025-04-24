package ExercicioAula27;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Lampada lampada = new Lampada();
		Scanner scan = new Scanner(System.in);

		//System.out.println("Digite (0) apagar");
		//System.out.println("Digite (1) acender");
		//int posicao = scan.nextInt();
		//lampada.acenderLampada(posicao);

		lampada.ligar();
		lampada.mostrarEstado();
		
		lampada.desligar();
		lampada.mostrarEstado();
		
		lampada.mudarEstado();
		lampada.mostrarEstado();
	}

}
