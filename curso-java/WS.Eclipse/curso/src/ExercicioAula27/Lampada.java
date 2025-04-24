package ExercicioAula27;

public class Lampada {

	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	String[] tipos;
	boolean tipoAbajur;
	double preco;
	int quantidade;
	int posicao;
	boolean ligada;

	/**void acenderLampada (int posicao) {	
		
		if(posicao == 1){
			System.out.println("A luz esta acessa");		
		}
		if(posicao == 0) {
			System.out.println("A luz esta apagada");
		}
	}
	**/
	void ligar() {
	     ligada = true;
	}
	void desligar() {
		ligada = false;
	}
	
	void mostrarEstado() {
		if(ligada) {
			System.out.println("A luz esta ligada");	
		}else {
			System.out.println("A luz esta desligada");	
		}
	}
	void mudarEstado() {
		if(ligada) {
			desligar();
		}else {
			ligar();
		}
	}
	
}
