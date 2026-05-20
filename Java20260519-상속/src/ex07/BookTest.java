package ex07;

public class BookTest {

	public static void main(String[] args) {
		
		Book b1 = new Book("파이썬 라이브러리", "김영근", 39000);
		Book b2 = new Book("빅데이타 기술", "김강원", 30000);
		Book b3 = new Book("혼공머신러닝", "박해선", 32000);
		Book b4 = new Book("데이터 엔지리어닝", "김인범", 38000);
		Book b5 = new Book();
		
		System.out.println(b1.getBookInfo());
		System.out.println(b2.getBookInfo());
		System.out.println(b3.getBookInfo());
		System.out.println(b4.getBookInfo());
		System.out.println(b5.getBookInfo());
	

	}

}
