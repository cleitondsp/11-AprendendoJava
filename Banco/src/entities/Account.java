package entities;

public class Account {
	
	private int number; // numero da conta não pode ser modificdo
	private String titular; // pode ser modificado, quando uma pessoa se casa e muda de nome
	private double balance;	// modifica somente com deposito ou saque
		
	public Account(int number, String titular) { // construtor com duas opções, sem o deposito inicial
		this.number = number;
		this.titular = titular;
	}

	public Account(int number, String titular, double initialDeposit) { // construtor com as 3 opções
		this.number = number;
		this.titular = titular;
		deposit(initialDeposit);
	}

	public int getNumber() { // somente o get pq nao tera alteração do "Number"
		return number;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getBalance() { // somente o get pq só havera alteração atraves de deposito e saque
		return balance;
	}
	
	public void deposit(double amount) {
		balance =+ amount;
	}
	
	public void withdraw(double amount) {
		balance -= (amount + 5);
	}
	

}
