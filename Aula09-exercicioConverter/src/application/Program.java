package application;

import java.util.Locale;
import java.util.Scanner;

import entities.currentConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		currentConverter.price = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		currentConverter.amount = sc.nextDouble();
		System.out.print("Amount to be paid in reais = " 
				        + String.format("%.2f", currentConverter.conversor()));
		
		
		
		sc.close();
	}

}
