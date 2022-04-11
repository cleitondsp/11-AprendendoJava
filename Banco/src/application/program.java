package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account titular: ");
		sc.nextLine(); // muda de linha apos a digitação do numero da conta
		String titular = sc.nextLine();
		
		System.out.print("There is initial deposit? ( y or n ): ");
		char response = sc.next().charAt(0); // variavel pa receber a resposta
		
		if (response == 'y') {
			System.out.println("Enter initial deposit now: $");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, titular, initialDeposit);
		} else {
			account = new Account(number, titular);
		}
		
		System.out.println();
		System.out.println("Account Data: ");
		System.out.println(account);
		
		
		
		
		
		sc.close();

	}

}
