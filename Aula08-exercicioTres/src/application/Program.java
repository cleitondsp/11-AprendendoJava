package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and heigth:");	
		rectangle.width = sc.nextDouble();
		rectangle.heigth = sc.nextDouble();
		
		System.out.println();
		System.out.println("AREA: " + rectangle.Area());
		System.out.println("PERIMETER: " + rectangle.Perimeter());
		System.out.printf("DIAGONAL: %.2f", rectangle.Diagonal());
		
		
		
		
		
		
		
		sc.close();
	}

}
