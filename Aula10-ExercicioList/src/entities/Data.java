package entities;

import java.util.ArrayList;
import java.util.List;

public class Data {
	
// 1� construir as variaveis que ser�o utilizadas
	
	private Integer id;
	private String name;
	private Double salary;
	

// 2� construir esse primeiro construtor padr�o, sem argumentos	
	public Data() {    
	}
	
// 3� construir o segundo construtor com todos os argumentos
	public Data(Integer id, String name, Double salary) {  
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
// 4� construir os getters and setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
// 5� criando a opera��o de aumento de salario
	
	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100;
	}
	
	
	
	
	
	
	
}
