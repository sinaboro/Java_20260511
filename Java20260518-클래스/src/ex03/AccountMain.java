package ex03;

public class AccountMain {

	public static void main(String[] args) {
		
		System.out.println("이순신 거래 내역");
		Account lee = new Account();
		
		//lee.balance = -100000;
		
		lee.deposit(-15000);
		lee.withdraw(8000);		
		System.out.println("이순신 현재 잔고: " + lee.getBalance());
		
		System.out.println("------------------------------");
		
		System.out.println("홍길동 잔고 통장 입출금 내역");
		Account hong  = new Account();
		hong.deposit(10000);
		hong.withdraw(7000);
		System.out.println("홍길동 현재 잔고: " + hong.getBalance());
		

	}

}

class Account{
	//정보은닉, 멤버변수는 외부 공개하지 않는다!!!
	private int balance = 0;
	
	
	
	/*
	 * Getter -> 멤버변수값을 확인 하는 용도
	 * Setter -> 멤버변수 값을 저장하는 용도
	 */
	
	/*
	 * Getter 생성 방법
	 * getter는 함수로 생성
	 * 반환타입 -> 멤버변수 자료형 이용
	 * 함수이름 -> get + 멤버변수, 단 멤버변수 첫글자는 대문자, 카멜표기법
	 * 매개변수 -> 없음
	 */
	
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int b) {
		balance = b;
	}
	

	/*
	  * Setter 생성 방법
	  * 반환타입 : void
	  * 함수명 : set + 멤버변수명 -> 카멜표기법
	  * 매개변수: (멤버변수 자료형)
	  */
	
	
	
	void deposit(int amount) { //입금		
		if(amount>0)
			balance += amount;
		else
			System.out.println("마이너스는 입금 불가");
	}
	
	

	void withdraw(int amount) { //출금
		if(amount >balance) {
			System.out.println("잔고부족 인출불가");
		}else {		
			balance -=amount;
		}
	}	
	
}