package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;  // importando a entidade do objeto criado

public class Program {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;  // chamando o objeto
		x = new Triangle(); // atribuindo o objeto a uma variavel
		y = new Triangle();	
	
		
		System.out.println("Entre com as 3 medidas do tringulo X:");
		x.a = sc.nextDouble(); // escolhendo em qual atributo do objeto sera inserido o valor
		x.b = sc.nextDouble(); // escolhendo em qual atributo do objeto sera inserido o valor
		x.c = sc.nextDouble(); // escolhendo em qual atributo do objeto sera inserido o valor
		
		double p1 = (x.a + x.b + x.c) / 2;
		double area1 = Math.sqrt( p1 * (p1-x.a) * (p1-x.b) * (p1-x.c));
		
		System.out.println("Entre com as 3 medidas do tringulo Y:");
		y.a = sc.nextDouble(); // escolhendo em qual atributo do objeto sera inserido o valor
		y.b = sc.nextDouble(); // escolhendo em qual atributo do objeto sera inserido o valor
		y.c = sc.nextDouble(); // escolhendo em qual atributo do objeto sera inserido o valor
		
		double p2 = (y.a + y.b + y.c) / 2;
		double area2 = Math.sqrt( p2 * (p2-y.a) * (p2-y.b) * (p2-y.c));
		
		System.out.printf("Area do triangulo X = %.4f%n",area1);
		System.out.printf("Area do triangulo Y = %.4f%n",area2);	
		
		if (area1 > area2) {
			System.out.printf("O tringulo com a área maior é X");
		} else {
			System.out.printf("O tringulo com a área maior é Y");
		}
		
		
		
		sc.close();
	}

}
