package application;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		

		double a1,b1,c1,p1,area1;
		double a2,b2,c2,p2,area2;
	
		
		System.out.println("Entre com as 3 medidas do tringulo X:");
		a1 = sc.nextDouble();
		b1 = sc.nextDouble();
		c1 = sc.nextDouble();
		
		p1 = (a1 + b1 + c1) / 2;
		area1 = Math.sqrt( p1 * (p1-a1) * (p1-b1) * (p1-c1));
		
		System.out.println("Entre com as 3 medidas do tringulo Y:");
		a2 = sc.nextDouble();
		b2 = sc.nextDouble();
		c2 = sc.nextDouble();
		
		p2 = (a2 + b2 + c2) / 2;
		area2 = Math.sqrt( p2 * (p2-a2) * (p2-b2) * (p2-c2));
		
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
