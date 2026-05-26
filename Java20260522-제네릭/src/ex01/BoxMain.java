package ex01;

public class BoxMain {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.func();
		
		Box box = new Box();
		
		box.setItem(car);
		Object obj2 =box.getItem();
		
		Car car2 = (Car)obj2;
		car2.func();
		
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