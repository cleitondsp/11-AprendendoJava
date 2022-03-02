package entities;

public class Triangle {
	
	public double a;
	public double b;
	public double c;
	
	public double area() { // public - pode ser usada em todos os lugares / double, significa que essa função retorna um resultado Double
		double p = (a + b + c) / 2;
		return Math.sqrt( p * (p-a) * (p-b) * (p-c));
	}

}