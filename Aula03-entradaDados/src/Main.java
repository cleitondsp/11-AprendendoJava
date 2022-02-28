import java.util.Locale;
import java.util.Scanner; // primeiro precisamos importar a função de leitura do teclado

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s1, s2, s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		
		
		System.out.println("Valores digitados:");
		System.out.println(s1);	
		System.out.println(s2);	
		System.out.println(s3);	
		sc.close();  // sempre fechar quando nao precisar mais da função

	}
	
	// String x;
	// x = next(); armazena uma palavra
	// sc.close();	
	
	// int x;
	// x = nextInt(); armazena um numero
	// sc.close();
	
	//Locale.setDefault(Locale.US); No double emos que importar a localização, pra resolver o problema de . ou ,	
	// double x;
	// x = nextDouble(); armazena um numero
	// sc.close();
	
	// char x;
	// x = next().charAt(0); armazena uma palavra, e guarda apenas o primeiro caractere da string... função charAt(0)
	// sc.close();

}
