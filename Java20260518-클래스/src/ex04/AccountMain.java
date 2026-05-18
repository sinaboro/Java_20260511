package ex04;

/*
 * 생성자
 *  -> 자바는 객체를 생성하면 반드시 생성자가 호출된다!!
 *  -> 생성자는 
 */
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
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int b) {
		balance = b;
	}
	
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