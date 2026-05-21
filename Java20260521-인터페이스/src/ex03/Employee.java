package ex03;

public abstract class Employee {
	private String name;  //사원명
	private int number;   //사원번호
	private String department; //부서명
	private int salary;  //급여
	
	int getSalary(){
		return salary;
	}
	
	void setSalary(int salary){
		this.salary = salary;
	}
	
	public Employee() {	
	}

	public Employee(String name, int number, String department, int salary) {
		this.name = name;
		this.number = number;
		this.department = department;
		this.salary = salary;
	}
	
	public abstract double tax();
	
}
