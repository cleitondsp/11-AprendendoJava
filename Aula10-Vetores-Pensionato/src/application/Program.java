package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int qtde = 10;

		Estudante[] vetor = new Estudante[qtde];

		System.out.print("Digite a quantidade de estudantes que serão cadastrados. (Máx 10) : ");

		int numEstudantes = sc.nextInt();

		for (int i = 0; i < numEstudantes; i++) {

			System.out.println("Digite o Nome, Email e Numero do quarto escolhido.");

			String name = sc.next();
			String email = sc.next();
			int quarto = sc.nextInt();

			vetor[quarto] = new Estudante(name, email);

		}
		System.out.println();

		System.out.println("Quartos ocupados:");
		for (int i = 0; i < 10; i++) {
			if (vetor[i] != null) {
				System.out.println(i + ": " + vetor[i]);
			}
		}

		sc.close();

	}

}
