package ExerciciosAula19;

public class Arrays {

	public static void main(String[] args) {
		
		// declarando array.
		
		double[] temperaturas = new double [365];
		
		temperaturas[0] = 31;
		temperaturas[1] = 32;
		temperaturas[2] = 33;
		temperaturas[3] = 34;
		temperaturas[4] = 37.1;
		
		System.out.println("O valor da temperatura do 1 dia é: " + temperaturas[0]);
		
		System.out.println("O tamanho do array: " + temperaturas.length);
		
		// mostra o endereço na memoria 
		System.out.println("O valor do array: " + temperaturas);
		//for que demonstra em qual posição pode estar no array
		for (int i=0; i <temperaturas.length; i ++) {
			
			System.out.println("O valor da temperatura do dia " + (i+1) + " é: " + temperaturas[i]);
		}
		// for melhorado nao mostra qual a posição so o que tem nas variaveis o seu valor 
		
		for (double tempe : temperaturas) {
			System.out.println(tempe);
			
			
		}
		
	}

}
