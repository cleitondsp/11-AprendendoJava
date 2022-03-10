package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Media;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Media media = new Media();
		
		String name;
		double falta;
		
		System.out.print("Digite o nome e as três notas do aluno: ");
		name = sc.nextLine();
		media.nota1 = sc.nextDouble();
		media.nota2 = sc.nextDouble();
		media.nota3 = sc.nextDouble();
		
		System.out.println();
		System.out.println(name);
		System.out.println("FINAL GRADE = " + media.notaFinal());
		System.out.println(media.status());
		
		if (media.notaFinal() < 60) {
			falta = 60 - media.notaFinal();
			System.out.println("MISSING " 
								+ String.format("%.2f", falta) // faltou colocar essa formatação
								+ " POINTS");
		}
		

		
		
		
		
		
		
		
		sc.close();
	}

}
