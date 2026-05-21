package ex03;

public class Sales extends Employee implements Bonus{

	public Sales() {	
	}
	
	public Sales(String name, int number,  String department, int salary) {
		super(name, number, department, salary );
	}
	
	@Override
	public void incentive(int pay) {
		
	}

	@Override
	public double tax() {
		return 0;
	}
	
	// 추가수당 지급
	public double getExtraPay() { 
		return 0;
	}

}
