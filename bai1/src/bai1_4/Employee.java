package bai1_4;

public class Employee {
	private int ID;
	private String firstName;
	private String lastName;
	private int salary;
	
	
	public Employee(int id, String fName, String lName, int salary1) {
		ID = id;
		firstName = fName;
		lastName = lName;
		salary = salary1;
	}
	public int getId() {
		return ID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public String getName() {
		return firstName+lastName;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAnnualSalary() {
		return salary*12;
	}
	public int raiseSalary() {
		return salary*2;
	}
	public String toString() {
		return "Employee[id="+ID+",name="+firstName+lastName+",salary="+salary+"]";
	}
	
}
