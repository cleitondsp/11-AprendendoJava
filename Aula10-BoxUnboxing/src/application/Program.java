package application;

public class Program {

	public static void main(String[] args) {
		
		int x = 20;
		
		Object obj = x; // boxing - transformando variavel em objeto
		
		System.out.println(obj); 
		
		int y = (int) obj;  // boxing - transformando objeto em variável
		
		System.out.println(y); 

	}

}
