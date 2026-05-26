package ex02;

interface Animal{
	void sound();
}

public class Main {

	public static void main(String[] args) {
		
		Animal an = new Animal() {

			@Override
			public void sound() {
				System.out.println("야옹~");
			}
			
		};
		an.sound();
	}

}
