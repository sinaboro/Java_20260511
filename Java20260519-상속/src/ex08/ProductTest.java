package ex08;

/*
 * 5개의 원소를 갖는 Product 타입의 배열을 생성한 후에 Product 객체를 5개
생성하여 각각의 원소로 대입하고 Product 객체들의 각 정보들을 행 단위로
출력한다.(상품명 재고량 가격) – 가격은 천단위로 , 를 붙이고 금액 끝에
‘원’도 붙여서 출력한다.
 */
public class ProductTest {

	public static void main(String[] args) {
		
		Product[] pArr = new Product[5];
		
		pArr[0] = new Product("짱구",10, 1200);
		pArr[1] = new Product("새우깡",15, 1300);
		pArr[2] = new Product("참이슬",25, 1800);
		pArr[3] = new Product("카스",95, 2000);
		pArr[4] = new Product();
		
		for(int i=0; i<5; i++) {
			System.out.print(pArr[i].getName() + " ");
			System.out.print(pArr[i].getBalance() + " ");
			System.out.print(pArr[i].getPrice() + "원");
			System.out.println("\n---------------------");
		}
	}

}
