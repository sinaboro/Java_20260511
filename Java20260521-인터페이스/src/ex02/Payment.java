package ex02;

//결제
public interface Payment {
	void pay(int money);  //추상메소드
	
	/*
	 * 디폴드 메소드 : 구현클래스에서 구현해도되고, 안해도 됨
	 */
	default void coupon(){  //할인 기능 추가, 
		System.out.println("할인기능은 각 구현체에서 개별적으로 하세요");
	}
}
