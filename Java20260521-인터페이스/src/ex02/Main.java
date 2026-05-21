package ex02;

public class Main {
	public static void main(String[] args) {
		
		Payment p1 = new CardPay();
		Payment p2 = new KakaoPay();
		Payment p3 = new NaverPay();
		
		p1.pay(50000);
		p2.pay(10000);
		p2.coupon();
		
		p3.pay(20000);
		p3.coupon();
	}
}
