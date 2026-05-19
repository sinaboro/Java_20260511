package ex04;

public class Animal {
	
	private String name;
	
	String getName(){
		return name;
	}
	public Animal() {
		System.out.println("애니멜 객체 생성");
	}
	
	Animal(String name){
		this.name = name;
	}
	
	void eat() {
		System.out.println(name + " 밥을 먹는다");
	}
	
	void sleep() {
		System.out.println(name + " 잠을 잔다");
	}
}
