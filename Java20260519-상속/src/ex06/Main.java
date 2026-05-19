package ex06;

public class Main {
	public static void main(String[] args) {
		
		A a1 = new A(); //fa(), test()-A
		a1.test();
		A a2 = new B(); //fa(), test()-B
		a2.test();
		A a3 = new C(); //fa(), test()-C
		a3.test();
		
		//B b1 = new A() error
		B b2 = new B(); //fa(), fb(), test-B
		B b3 = new C(); //fa(), fb(), test-C
		b2.test();
		b3.test();
		
		//C c1 = new A() error
		//C c2 = new B() error
		C c3 = new C(); //fa(),fb(),fc() ,test-C
	}
}
