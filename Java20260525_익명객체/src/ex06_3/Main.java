package ex06_3;

@FunctionalInterface //추상 메소드 1개만 존재
interface Calculable{
	int calculate(int x, int y);       
}

public class Main {

	public static void main(String[] args) {
		
		/*
		 * 람다식에서 return 이 있는 경우는 중괄호 생략불가
		 * return이 포함된 중괄호에서 문장이 한 문장이면 return문 생략 및 중괄호도 생략 가능
		 */
		Calculable cal = (x, y) ->  x+y;
		
		
		int result = cal.calculate(5, 6);
		System.out.println(result);
		
	}
}
