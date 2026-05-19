package ex07;

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
		
		
		Account kim = new Account(); //익명, 0
		Account park = new Account(1000); //익명, 1000
		Account su = new Account("유관순", 3000); //유관순, 3000
	}

}

class Account{
	//정보은닉, 멤버변수는 외부 공개하지 않는다!!!
	private int balance;  //멤버변수, 인스턴스 변수
	private String name;	
	
	static int max = 100;  //클래스변수

	Account(){
		this("익명", 0);
	}

	Account(int balance){
		this("익명", balance);		
	}

	Account(String name, int balance){
		this.name = name;		
		this.balance = balance;
	}
		
	String getName() {
		return name;
	}
	
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	void deposit(int amount) { //입금		
		if(amount>0)
			this.balance += amount;
		else
			System.out.println("마이너스는 입금 불가");
	}
	

	void withdraw(int amount) { //출금
		if(amount > balance) {
			System.out.println("잔고부족 인출불가");
		}else {		
			balance -=amount;
		}
	}	
	
}