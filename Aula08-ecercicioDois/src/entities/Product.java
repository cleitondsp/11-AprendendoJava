package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts (int quantity) {
		this.quantity += quantity;
	}
	
	public void remveProducts (int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return  "Product data: "
				+name
				+ ", $ "
				+ String.format("%.2f", price) // formatando o preço com duas casas decimais
				+ ", "
				+ quantity
				+ " units, TOTAL $ "
				+ String.format("%.2f", totalValueInStock());
	}

}
