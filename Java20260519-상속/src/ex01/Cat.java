package ex01;

public class Cat {
	String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	void eat() {
		System.out.println(name + " 밥을 먹는다");
	}
	
	void sleep() {
		System.out.println(name + " 잠을 잔다");
	}
	
	void meow() {
		System.out.println(name + "가 야옹 한다");
	}
}
