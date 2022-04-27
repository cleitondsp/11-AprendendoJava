package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String s1=sc.next();
        int x=sc.nextInt();
        String espaco = " ";
        
        int carac = s1.length() + 3;     
        int qtdeEspacos = 18 - carac;    
        
        for (int j = 1; j < qtdeEspacos; j++) {
        	espaco += " ";
        }
        
        System.out.println(s1 + espaco + String.format("%03d", x));
		
		sc.close();
	}

}
