package ex04;

class A{
	void fa() {}
	
	void test() {
		System.out.println("A class");
	}
}

class B extends A{
	void fb() {}
	
	void test() {
		System.out.println("B class");
	}
}

class C extends B{
	void fc() {}
	
	void test() {
		System.out.println("C class");
	}
}
public class Main {

	public static void main(String[] args) {
		
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();
		
		a1.fa();
		a1.test();
		
		a2.fa();
		a2.test();
		
		a3.fa();
		a3.test();
		
		B b1 = (B)a2;
		b1.fa();
		b1.fb();
		b1.test();
		
		C c1 = (C)a3;
		c1.fa();
		c1.fb();
		c1.fc();
		c1.test();
	}

}

























