package ex02;

public class Main {

	public static void main(String[] args) {
		
		Dog d = new Dog("로이");
		
		d.sleep();
		d.eat();
		d.bark();
		
		Cat c = new Cat("뽀양");
		c.meow();
		c.eat();
		c.sleep();
	}
	
}
