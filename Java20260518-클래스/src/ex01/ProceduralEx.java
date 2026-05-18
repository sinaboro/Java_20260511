package ex01;

public class ProceduralEx {

	static int balance = 0; //잔고
	
	static void deposit(int amount) { //입금
		balance += amount;
	}
	
	static void withdraw(int amount) { //출금
		balance -=amount; 
	}

	static int balance2 = 0; //잔고
	
	static void deposit2(int amount) { //입금
		balance2 += amount;
	}
	
	static void withdraw2(int amount) { //출금
		balance2 -=amount; 
	}
	
	public static void main(String[] args) {
		
		System.out.println("홍길동 잔고 통장 입출금 내역");
		deposit(10000);
		withdraw(7000);
		System.out.println("홍길동 현재 잔고 : " + balance);
		
		System.out.println("이순신 거래 내역");
		deposit2(15000);
		withdraw2(8000);
		System.out.println("이순신 현재 잔고: " + balance2);

	}

}
