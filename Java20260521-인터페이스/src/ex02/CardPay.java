package ex02;


//카드
public class CardPay implements Payment{

	@Override
	public void pay(int money) {
		System.out.println("카드로 " + money +"원 결제");
		
	}

}
