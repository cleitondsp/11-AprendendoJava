package entities;

public class Product {
	
	public String name;
	public double price;  
	public int quantity;  // quantity referencia
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts (int quantity) {		// essa sera a variavel criada na classe principal
		this.quantity += quantity;					// essa é a variavel quantity referencia
	}
	
	public void removeProducts (int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return  name
				+ ", $ "
				+ String.format("%.2f", price) // formatando o preço com duas casas decimais
				+ ", "
				+ quantity
				+ " units, TOTAL $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
