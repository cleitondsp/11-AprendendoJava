import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de numeros que serão inseridos:");
		int num = sc.nextInt();
		
		int bigger = 0;
		int small = 0;
		int[] myArray = new int[num];		
		
		for (int c = 0; c < myArray.length; c++) { // fazendo a leitura dos numeros que serão cadastrados.
			System.out.printf("Número %d: ", c+1);
			myArray[c] = sc.nextInt();
		}				
		int diff = diferenca(bigger, small, myArray);  // Função que calculara a diferença entre o maior e o menor		
		System.out.printf("A maior diferença entre os valores é %d.%n", diff);
		
		boolean order = ordemCrescente(myArray); // Função retorna TRUE ou FALSE se os numeros estiverem em ordem crescente			
		System.out.println("Os numeros digitados estão em ordem crescente?: " + order);	
		
		sc.close();
	}	

	private static int diferenca(int bigger, int small, int[] myArray) {		
		small = myArray[0];  
		bigger = myArray[0];  
		
		for (int c = 1; c < myArray.length; c++) {			
			if (myArray[c] < small) {
		        small = myArray[c];
			}			
			if (myArray[c] > bigger) {
		        bigger = myArray[c];
			}			
		}		
		int diff = bigger - small;
		return diff;
	}
	
	private static boolean ordemCrescente(int[] myArray) {
		for (int c = 0; c < myArray.length-1; c++) {
			for (int d = c+1; d < myArray.length; d++) {
				if (myArray[c] > myArray[d]) {
					return false;
				}
			} 
		}
		return true;
	}
}
