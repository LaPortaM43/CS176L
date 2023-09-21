package edu.monmouth;

public class Problem1Week3 {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		
		employee.setName("Matt");
		employee.setSalary(50000);
		
		System.out.println("Name: " + employee.getName());
		System.out.println("Salary: " + employee.getSalary());
		employee.raiseSalary(10);
		System.out.println("Raised Salary: " + employee.getSalary());

	}

}

class Employee {
	
	private String name;
	private double salary;
	
	public Employee() {
		setName("Unknown");
		setSalary(0);
		
	}

	public String getName() { 
		return name; 
		
	}
	
	public void setName(String name) { 
		this.name = name; 
	
	}
	
	public double getSalary() { 
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
		
	}
	
	public void raiseSalary(double byPercent) {
		salary += (salary * 10 * 0.01);
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
