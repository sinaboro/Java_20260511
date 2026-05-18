package ex05;

/*
 * this 2가지 용도    
 *  - this는 객체 자신을 가르킨다.
 *  - 다른 생성자 호출
 */
public class AccountMain {

	public static void main(String[] args) {
		
		System.out.println("이순신 거래 내역");
		Account lee = new Account("이순신", 3000);
		
		lee.deposit(-15000);
		lee.withdraw(8000);		
		System.out.println( lee.getName() + "님 현재 잔고: " + lee.getBalance());
		
		System.out.println("------------------------------");
		
		System.out.println("홍길동 잔고 통장 입출금 내역");
		Account hong  = new Account("홍길동", 3000);
		hong.deposit(10000);
		hong.withdraw(7000);
		System.out.println(hong.getName() + "님 현재 잔고: " + hong.getBalance());
	}

}

class Account{
	//정보은닉, 멤버변수는 외부 공개하지 않는다!!!
	private int balance;
	private String name;	

	Account(){
		
	}

	Account(int b){
		balance = b;
	}

	Account(String n, int b){
		name = n;
		balance = b;		
	}
	
	String getName() {
		return name;
	}
	
	
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