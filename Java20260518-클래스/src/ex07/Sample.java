package ex07;

public class Sample {

	public static void main(String[] args) {
		
		int test = 10;		//인스턴스 변수, 멤버변수, 속성
		
		System.out.println("test : " + test);
		
		func(100);
		
		int var = 20;  //인스턴스 변수, 멤버변수, 속성
		System.out.println("var : " + var);
		
		Sample s1 = new Sample();
		
		s1.add();
		
		Car c1 = new Car();
		
		System.out.println(c1.car1);
		c1.func();
		
		Bus bus1 = new Bus();
		bus1.func2();
		
		System.out.println(Bus.bus1);
		Bus.func2();

	}
	
	void add() {
		int a = 5;
		int b = 2;
		
		int sum = a+b;
		
		System.out.println("두 수 합 : " + sum);
	}

	static void func(int test) {  //지역변수
		System.out.println("test : " + test);
	}

}

class Bus{
	static int bus1=10000;
	
	static void func2() {
		System.out.println("func2() 호출");		
	}
}

class Car {
	
	int car1 ;
	
	void func() {
		System.out.println("func() 호출");
	}
}



