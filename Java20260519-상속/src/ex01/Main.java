package ex01;

public class Main {

	public static void main(String[] args) {
		
		Dog d = new Dog("로이");
		d.eat();
		d.sleep();
		d.bark();
		
		System.out.println();
		
		Cat c  = new Cat("야옹");
		c.eat();
		c.sleep();
		c.meow();
	}
	
}
