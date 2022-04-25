package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String s1=sc.next();
        int x=sc.nextInt();
        String espaco = "2";
        
        int qtdeEspacos = 11 - s1.length();
        int carac = s1.length() + espaco.length() + 3;
        
        
        System.out.println(carac);
        System.out.println(qtdeEspacos);
        
        for (int j = 1; j < qtdeEspacos; j++) {
        	espaco += espaco;
        }
        
        System.out.println(s1 + espaco + String.format("%03d", x));
		
		sc.close();
	}

}
