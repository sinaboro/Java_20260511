package ex01;

interface Animal{
	void sound();
}

class Cat implements Animal{

	@Override
	public void sound() {
		System.out.println("야옹~");
	}
	
}

public class Main {

	public static void main(String[] args) {
		
		Animal an = new Cat();
		an.sound();
	}

}
