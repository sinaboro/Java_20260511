package ex05;

public class Main {
	public static void main(String[] args) {
		
		A a1 = new A(); //fa()
		A a2 = new B(); //fa()
		A a3 = new C(); //fa()
		
		//B b1 = new A() error
		B b2 = new B(); //fa(), fb()
		B b3 = new C(); //fa(), fb()
		
		//C c1 = new A() error
		//C c2 = new B() error
		C c3 = new C(); //fa(),fb(),fc()
	}
}
