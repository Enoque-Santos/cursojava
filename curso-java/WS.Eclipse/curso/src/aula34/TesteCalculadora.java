package aula34;

import aula34.MinhaCalculardora;

public class TesteCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//MinhaCalculardora calc = new MinhaCalculardora();
        //calc.soma(1, 2);
		//calc.soma(1.0, 2.0);
		soma2Valores(1,2);
		
	}
	
	static int soma2Valores(int num1, int num2) {
		return MinhaCalculardora.soma(num1, num2);
		
	}

}
