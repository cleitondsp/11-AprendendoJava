package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros serão digitados?");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		double soma = 0;		
		
		//double[] vect => significa q estou criando um vetor de nome VECT com valores DOUBLE
		
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		
		double media = soma / n;		
		System.out.printf("Average Heigth: %.2f%n", media);		
		
		
		sc.close();

	}

}
