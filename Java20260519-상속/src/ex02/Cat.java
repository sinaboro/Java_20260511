package ex02;

public class Cat extends Animal {
		
	public Cat() {
		
	}	
	
	public Cat(String name) {
		super(name);
	}
	void meow() {
		System.out.println(getName() + "가 야옹 한다");
	}
}
