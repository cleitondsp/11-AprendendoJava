package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Data;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
				
		System.out.print("How many employees will be registered? ");
		int qtdeEmployes = sc.nextInt();
		
		
		
		
		sc.close();

	}

}
