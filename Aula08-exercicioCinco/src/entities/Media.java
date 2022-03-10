package entities;

public class Media {
	
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		
		return nota1 + nota2 + nota3;		
	}
	
	public String status() {
		
		if (notaFinal() > 60) {
			return "PASS";
		} else {
			return "FAILED";
		}
	}

}
