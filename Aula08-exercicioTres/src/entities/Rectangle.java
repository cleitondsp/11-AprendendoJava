package entities;

public class Rectangle {
	
	public double width;
	public double heigth;
	
	public double Area() {
		return width * heigth;
	}
	
	public double Perimeter() {
		return 2 * (width + heigth);
	}
	
	public double Diagonal() {
		return Math.sqrt((width * width) + (heigth * heigth));
	}

}
