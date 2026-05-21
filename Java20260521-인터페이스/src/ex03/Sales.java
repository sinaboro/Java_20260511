package ex03;

public class Sales extends Employee implements Bonus{

	@Override
	public void incentive(int pay) {
		
	}

	@Override
	public double tax() {
		return 0;
	}

}
