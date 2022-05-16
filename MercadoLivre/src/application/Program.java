package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);		
		int maxDigit = entrada.nextInt();
		
		int a,b,c,d;
		
		for (a=0; a<=maxDigit; a++) {
			for (b=0; b<=maxDigit; b++) {
				for (c=0; c<=maxDigit; c++) {
					for (d=0; d<=maxDigit; d++) {
						int soma = a+b+c+d;
						if (soma == 21) {
							System.out.print(a);
							System.out.print(b);
							System.out.print(c);
							System.out.print(d);
							System.out.println();
						}
					}
				}				
			}
		}		
		entrada.close();		
	}
}
