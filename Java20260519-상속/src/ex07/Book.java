package ex07;

/*
 * Book 클래스의 객체(인스턴스)를 5개 생성하고 각각 변수에
저장한 후 각각의 책 정보를 행 단위로 출력하는 BookTest
클래스를 만든다. (아규먼트를 받지않는 생성자가 호출될 땐
“자바의 정석” 정보로 Book 객체의 정보를 초기화 하며, 다
른 Book 객체들은 호출되는 생성자를 통해서 책 정보를 전달
하면서 객체를 생성한다. 책 정보는 임의로 정한다.)
 */
public class Book {
	String title;
	String author;
	int price;
	
	Book(){
		this("자바지의석", "남궁성", 45000);
	}
	
	Book(String title,String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	String getBookInfo() {
		return  "제목 : "+ title + ", 저자 : " + author + ", 가격: " + price;
	}
	
	
	
}
