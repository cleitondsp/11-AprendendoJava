
public class Main {

	public static void main(String[] args) {


		String original = "     abcde FGHIJ ABC abc DEFG     ";
		
		String txt1 = original.toLowerCase();
		String txt2 = original.toUpperCase();
		String txt3 = original.trim();
		String txt4 = original.substring(11);
		String txt5 = original.substring(5,10);
		String txt6 = original.replace('a','x');
		String txt7 = original.replace("abc","xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		
		
		System.out.println("Original -" + original + "-");
		System.out.println("toLowerCase -" + txt1 + "-");
		System.out.println("toUpperCase -" + txt2 + "-");
		System.out.println("trim -" + txt3 + "-");
		System.out.println("substring -" + txt4 + "-");
		System.out.println("substring -" + txt5 + "-");
		System.out.println("replace 'a' por 'x' -" + txt6 + "-");
		System.out.println("replace 'abc' por 'xy' -" + txt7 + "-");
		System.out.println("Posição inicial do argumento é " + i);
		System.out.println("Posição final do argumento é " + j);

	}

}
