package ExerciciosAula15;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LocalDate dataDg = LocalDate.now();
		
		System.out.println("Informe o ano : ");		
	    String data = scan.next();
	    			
		DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");		
		
	    df.setLenient (false); // aqui o pulo do gato
		try {
		    df.parse (data); 
		    System.out.println(data);
		    // data válida
		} catch (ParseException ex) {
			 System.out.println("Data inválida");
		   // data inválida
		}
		
			
	}

}
