package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos produtos serão cadastrados: ");
		int N = sc.nextInt();
		
		String[] name = new String[N];
		double[] value = new double[N];
		double sum = 0;
		
		System.out.println("Digite o nome e o valor de cada produto.");
		
		for (int i=0; i<N; i++) {
			name[i] = sc.next();
			value[i] = sc.nextDouble();
			sum += value[i];
		}
		
		System.out.printf("Valor médio dos produtos: $ %.2f%n", (sum/N));	
		
		
		sc.close();
	}

}
