package ex03;

public class Secretary extends Employee implements Bonus{

	public Secretary() {	
	}
	
	public Secretary(String name, int number,  String department, int salary) {
		super(name, number, department, salary );
	}
	
	/*
	 * salary에 계산된 인센티브를 가산한다. 
	 * 인센티브는 pay의 80%이다.
	 *	(pay가100이면 80을 가산)
	 */
	@Override
	public void incentive(int pay) {
		int total = (int)(getSalary() +  pay*0.8);
		setSalary(total);
	}

	@Override
	public double tax() {
		return  getSalary() * 0.1;  //salary에 10% 징수
	}

}
