package ExerciciosAula13;

import java.util.Scanner;

public class Exercicios14 {

	public static void main(String[] args) {
		final double multa = 4.00;
		      double peso = 0;
		      double excessoPeso = 0;
		      double valorMulta = 0;
		      double pesoRegular = 50.00;
		      
		      Scanner scan = new Scanner(System.in);
		      System.out.println("Digite quantos kilos de peixe você pescou?");
		      peso = scan.nextDouble();
		      
		      if(peso > pesoRegular) {
		    	  excessoPeso = peso - pesoRegular;
		    	  valorMulta = excessoPeso * multa;
		    	  System.out.println("Peso Permitido: " + pesoRegular + " Kilos");
		    	  System.out.println("Peso Excedido:" + excessoPeso +" Kilos"); 
		    			  
		    	  System.out.println("Multa: R$ " + valorMulta );
		      }else {
		    	  System.out.println("Peso excedido: " + excessoPeso + " Kilos" );
		    	  System.out.println("Multa: R$" + valorMulta  );
		    	  
		      }
		      
	}

}
