package ex01;

public class BoxMain {

	public static void main(String[] args) {
		
		
	}
}

class Car{
	void func() {
		System.out.println("Car 메소드 출력");
	}
}

class Box{
	Object item;
	
	void setItem(Object item) {
		this.item = item;
	}
	
	Object getItem() {
		return item;
	}
}