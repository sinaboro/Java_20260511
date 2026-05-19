package ex04;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * 상위클래스는 하위클래스를 참조 가능
		 * 상위클래스는 하위클래스 data 접근 불가.
		 * 하위클래스는 상위클래스 data 접근 가능.
		 * 하위클래스는 상위클래스 참조 불가
		 * 
		 */
		
		Animal a1 = new Animal();		
		
		Animal a2 = new Dog();
		
		Animal a3 = new Cat();
		
		Dog d1 = new Dog();
		
		// Dog d2 = new Animal(); //error 하위클래스는 상위클래스 참조 불가
		//Dog d3 = new Cat(); //error 상속관계도 아니고, 타입이 불일치하기 때문에 참조 불가
		
		
		
		
	}
	
}
