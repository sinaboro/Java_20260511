package ex02;

public class Animal {
	
	private String name;
	private int age;
	private int height;
	
	String getName(){
		return name;
	}
	
	public Animal() {
		System.out.println("애니멜 객체 생성");
	}
	public Animal(String name) {
		this.name = name;
	}
	
	Animal(String name, int age, int height){
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	void eat() {
		System.out.println(name + " 밥을 먹는다");
	}
	
	void sleep() {
		System.out.println(name + " 잠을 잔다");
	}
}
