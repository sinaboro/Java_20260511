package ex08;

public class Product {
	String name;
	int balance;
	int price;
	
	public Product() {	
		this("듀크인형", 5, 1000);
	}
	
	public Product(String name, int balance, int price) {
		this.name = name;
		this.balance = balance;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public int getPrice() {
		return price;
	}
	
	
}
