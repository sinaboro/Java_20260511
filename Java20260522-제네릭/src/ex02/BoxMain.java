package ex02;

public class BoxMain {

	public static void main(String[] args) {
		
		//Box box = new Box();
		Box<Car> box = new Box<Car>();
		
		//Car 객체성생해서 입력해야 하는데, 문자열을 잘못 입력했을때 체크할수있는 기능은 없는가?
		box.setItem(new Car());
		//Object obj = box.getItem();
		Car obj = box.getItem();
		obj.func();
		System.out.println(obj);
		
		Box<Bus> box2 = new Box<Bus>();
		
		box2.setItem(new Bus());
		Bus bus = box2.getItem();
		bus.func2();
		
		
		Box<Integer> ibox = new Box<>();
		ibox.setItem(10);
		int i = ibox.getItem();
		System.out.println(i);
	}
}

class Car{
	void func() {
		System.out.println("Car 메소드 출력");
	}
}


class Bus{
	void func2() {
		System.out.println("Bus Class 출력");
	}
}

