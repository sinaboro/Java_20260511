package ex09;

public class Student extends Human{

	static String number;
	static String major;
	
	public Student() {		
	}

	public Student(String name, int age, int height, int weight
			, String number, String major) {

		super(name, age,height, weight );
		
		this.number = number;
		this.major = major;
	}
	
	@Override
	public String printInformation() {
		
		return  super.printInformation() +'\t'+  number + '\t' + major;
	}
}
