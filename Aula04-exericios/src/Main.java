import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Fazer um programa para ler o c?digo de uma pe?a 1, o n?mero de pe?as 1, o valor unit?rio de cada pe?a 1, o 
		// c?digo de uma pe?a 2, o n?mero de pe?as 2 e o valor unit?rio de cada pe?a 2. Calcule e mostre o valor a ser pago.
		
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int cod1, cod2, qtde1, qtde2;
		double preco1, preco2, total;
		
		cod1 = sc.nextInt();
		qtde1 = sc.nextInt();
		preco1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qtde2 = sc.nextInt();
		preco2 = sc.nextDouble();
		
		total = qtde1 * preco1 + qtde2 * preco2;
				
		System.out.printf("Valor a pagar R$ %.2f%n", total);
		
	
		
		
		
		sc.close();
		
		

	}

}
