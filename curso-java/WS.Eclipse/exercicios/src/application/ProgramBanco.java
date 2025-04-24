package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ProgramBanco {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Account account;
		
		
		System.out.println("ENTER ACCOUNT NUMBER");
		int number = sc.nextInt();
		
		System.out.println("ENTER ACCOUNT HOLDER");
		sc.nextLine();
		String holder = sc.nextLine();
						
		System.out.println("IS THERER NA INITIAL DEPOSIT (Y/N)? ");
		char response = sc.next().charAt(0);

		if(response == 'Y' ){
			System.out.println("ENTER INITIAL DEPOSIT VALUE? ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}else {
			account = new Account(number, holder);
		}
		System.out.println();
		System.out.println("ACCOUNT DATA:");
		System.out.println(account);
		System.out.println();
		
		System.out.println("ENTER A DEPOSIT VALUE:");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		
		System.out.println("UPDATE ACCOUNT DATE");
		System.out.println(account);
		
		
		System.out.println("ENTER A WITHDRAW VALUE:");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		
		System.out.println("UPDATE ACCOUNT DATE");
		System.out.println(account);
		
		
		sc.close();
		
			
	}

}
