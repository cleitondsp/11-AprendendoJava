package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product(); // importando a classe Product pra ser usada
		
		System.out.println("Enter the product data.");
		
		System.out.print("Name: ");		
		product.name = sc.nextLine();
		
		System.out.print("Price: ");		
		product.price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");		
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity); // inserindo a variavel quantity que sera inserida na classe Product
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity); // inserindo a variavel quantity que sera inserida na classe Product
		
		System.out.println();
		System.out.println("Update data: " + product);
				
		
		
		
		
		
		
		
				
				
		sc.close();
	}

}
