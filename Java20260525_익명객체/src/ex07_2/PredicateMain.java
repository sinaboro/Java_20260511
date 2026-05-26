package ex07_2;

import java.util.function.Predicate;

/*
 * 1. interface를 설계한다.
 * 2. 정수를 입력받는 함수를 1개 생성한다.
 * 3. 입력받은 정수가 2의 배수이면 true를 반환하고,
 *    2의 배수가 아니면 false를 반환한다.
 * 4. 함수를 호출하여 정수값을 전달한 뒤,
 *    반환 결과를 출력하는 프로그램을 작성한다.
 */

public class PredicateMain {

	public static void main(String[] args) {
			
		Predicate<Integer> pre = (num) ->  (num % 2 == 0) ? true : false ;
		
		boolean result = pre.test(8);
		System.out.println(result);
		
	}
}
