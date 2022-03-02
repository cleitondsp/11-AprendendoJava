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
		
		System.out.println("Entre com as 3 medidas do tringulo Y:");
		y.a = sc.nextDouble(); // escolhendo em qual atributo do objeto sera inserido o valor
		y.b = sc.nextDouble(); // escolhendo em qual atributo do objeto sera inserido o valor
		y.c = sc.nextDouble(); // escolhendo em qual atributo do objeto sera inserido o valor
		
		double areaX = x.area(); // chamando aquela função de area dos triangulos
		double areaY = y.area(); // chamando aquela função de area dos triangulos
		
		System.out.printf("Area do triangulo X = %.4f%n",areaX);
		System.out.printf("Area do triangulo Y = %.4f%n",areaY);	
		
		if (areaX > areaY) {
			System.out.printf("O tringulo com a área maior é X");
		} else {
			System.out.printf("O tringulo com a área maior é Y");
		}		
		
		sc.close();
	}

}

