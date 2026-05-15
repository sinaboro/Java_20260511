package ex03;

public class VariableEx02 {

	public static void main(String[] args) {		
		
		//산술연산 : + , - , *, /, %
		//관계연산자: >, <, >=, <=
		// ==, !=
		
		System.out.println(5 / 2.0); //2.5
		System.out.println("5 % 2 나머지 : "+ 5 % 2);  //나머지 연산자, 1
		
		System.out.println(5<2);
		
		// a = b   ==> b(우항)이 가지고있는 값을 a(좌항) 대입
		System.out.println(5 == 5);  // == 같다
		
		//줄복사 : ctrl+alt+방향키아래
		System.out.println(5 != 2);  // != 같지 않다
		
		//정수형변수 a를 생성했고, 이 공간에는 +- 21억값을 입력하겠다.
		int a = 5;
		
		a = a + 1;  //6
		
		a +=  1;   //7
		 
		a++;  //8  a = a + 1 , 후위연산자 
		
		++a;  //9  a = a + 1 , 선위연산자
		
		System.out.println(a);
		
		System.out.println("선 후 연산자");
		int b = 10;
		int c ;
		int d;
		
		/*
		 * c = b;
		 * b = b + 1
		 */
		c = b++;
		
		
		/*
		 * b = b+1
		 * d = b;
		 */
		d = ++b;		
		
		
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);			
		

	}

}
