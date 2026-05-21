package ex03;

public class Secretary extends Employee implements Bonus{

	public Secretary() {	
	}
	
	public Secretary(String name, int number,  String department, int salary) {
		super(name, number, department, salary );
	}
	
	@Override
	public void incentive(int pay) {
		
	}

	@Override
	public double tax() {
		return 0;
	}

}
