package ex01;

public class Dog {

	String name;
	
	public Dog(String name) {
		this.name = name;
	}
	void eat() {
		System.out.println(name + " 밥을 먹는다");
	}
	
	void sleep() {
		System.out.println(name + " 잠을 잔다");
	}
	
	void bark() {
		System.out.println(name + "가 멍멍 짓는다");
	}
}
