package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		
		List<String> myList = new ArrayList<>(); 
		
			// List - declarando a variavel Lista
			// <integer> - declarando do que a lista será feita, nesse exemplo só de numeros inteiros - só aceita Integer, Double, String
			// myList - o nome da minha lista
			// ArrayList - hibrido entre Array e List, permitindo buscas mais rapidas
		
		myList.add("Maria"); 		// adicionando um item - Pos 0
		myList.add("Yasmin"); 		// adicionando um item - Pos 1
		myList.add("Geovanna"); 	// adicionando um item - Pos 2
		myList.add("Emily"); 		// adicionando um item - Pos 3		
		myList.add(2, "Cleiton");	// adicionando um valor em uma posição específica ( 2 ) - nesse caso a dois, entre Yasmin e Geovanna
		
		System.out.println(myList.size());  // myList.size() - retorna a quantidade de valores na minha lista
		System.out.println();
		
		for (String x : myList) {
			System.out.println( x );
		}
		
		myList.remove("Cleiton"); 	// removendo um item atraves de valores
		System.out.println();
		
		for (String x : myList) {
			System.out.println( x );
		}
		
		myList.remove(1); 	// removendo um item atraves da posição na lista
		System.out.println();
		
		for (String x : myList) {
			System.out.println( x );
		}
		
		// myList.removeIf(x -> x.charAt(0) == "E"); 	// removendo um item com uma condição de If
		System.out.println();
		
		// for (String x : myList) {
		// 	System.out.println( x );
		// }
		
		System.out.println("Posição do valor Maria : " + myList.indexOf("Maria")); // Encontrando um a posição de um valor especifico - myList.indexOf()
		System.out.println("Posição do valor Ninguem : " + myList.indexOf("Ninguem")); // Quando o valor procurado nao esta na lista, o valor retornado é -1
		

	}

}
