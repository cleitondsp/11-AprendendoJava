import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com 3 numeros: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);  // a variavel higher recebe a fun��o "max" com 3 argumentos, os numeros que ser�o testados
				
		showResult(higher);  // chamando a fun��o showesult e passando o argumento higher
		
		
		sc.close();

	}
	
	private static void showResult(int higher) {  // a fun��o recebe um valor quando � chamada, e retorna uma mensagem
		System.out.println("O maior numero � " + higher);
		
	}

	private static int max(int a, int b, int c) {
		int aux;
		
		if (a > b && a > c) {
			aux = a;
		} else if ( b > c) {
			aux = b;
		} else {
			aux = c;
		}
		
		return aux;
	}		

}
