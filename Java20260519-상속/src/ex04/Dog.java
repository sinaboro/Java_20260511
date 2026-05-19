package ex04;

public class Dog extends Animal{

	public Dog() {
		System.out.println("Dog 객체 생성");
	}
	
	Dog(String name){
		//상위 클래스 생성자를 통해서 값을 전달
		super(name);
	}
	
	void bark() {
		System.out.println(getName()+"가 멍멍 짓는다");
	}
}
