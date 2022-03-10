package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {  // salario liquido = salario bruto - taxa
		
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		
		this.grossSalary = grossSalary + (grossSalary * (percentage / 100)); 		
	}
	
	public String toString() {
		return  "Update data: "
				+ name
				+ ", $"
				+ String.format("%.2f", netSalary()); // formatando o salario com duas casas decimais				
	}	

}
