package ex13;

public class MobileTest {

	public static void main(String[] args) {
		
	// 각각의 Mobile 객체를 생성한다.
	Mobile m1 = new Ltab("Ltab", 500, "ABC-01");
	Mobile m2 = new Otab("Otab", 1000, "XYZ-20");
	
	// 생성된 객체의 정보를 출력한다.(printMobile() 호출)
	printMobile(m1);
	printMobile(m2);
		
	// 각각의 Mobile 객체에 10분씩 충전을 한다.
	// 10분 충전 후 객체 정보를 출력한다.(printMobile() 호출)
	// 각각의 Mobile 객체에 5분씩 통화를 한다.
	// 5분 통화 후 객체 정보를 출력한	

	}
		
	public static void printMobile(Mobile mobile) {
		System.out.println(mobile);
		
	}
	
	public static void printTitle() {
	} 

}
