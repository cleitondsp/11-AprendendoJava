package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {
	
	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
	
	Employee employee = new Employee();
	double netSalary = employee.netSalary();
		
	System.out.print("Name of employee: ");
	employee.name = sc.nextLine();
	System.out.print("Gross salary: ");
	employee.grossSalary = sc.nextDouble();
	System.out.print("Tax:");
	employee.tax = sc.nextDouble();
	
	System.out.println();
	System.out.printf("Employee: " + employee.name + ", $" + employee.netSalary());
	System.out.println();
	System.out.print("Wich percentage to increase salary? ");
	double percentage = sc.nextDouble();
	System.out.println();
	System.out.println(employee.toString());
	
		
		
		sc.close();
	}

}
