package ex01;

public class FunctionEx02 {

	public static void main(String[] args) {		
		
		info();  //함수 호출
		System.out.println("-----------------");
		info();
		System.out.println("-----------------");
		info();
		System.out.println("-----------------");
		info();
		System.out.println("-----------------");
	}
	
	//     void(반환타입) info(함수명), ():매개변수 
	static void info() {
		System.out.println("안녕하세요!!");
		System.out.println("제 이름은 김대철입니다.");
		System.out.println("천호동에서 살고 있습니다.");
		System.out.println("장래 희망은 놀고 먹는것입니다.");
	}

}
