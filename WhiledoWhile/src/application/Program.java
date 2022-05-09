package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int primeiro;
		int segundo;
		double saida;

		
		do {
			System.out.println("Digite o primeiro numero.");
			primeiro = entrada.nextInt();
			
			System.out.println("Digite o segundo numero.");		
			segundo = entrada.nextInt();
			
			saida = primeiro/segundo;
			System.out.println(saida);
		
		} while (segundo != 0);
		
		
		
		
			
	
		
		
		
		
		
		
		
		
		entrada.close();
	}

}
