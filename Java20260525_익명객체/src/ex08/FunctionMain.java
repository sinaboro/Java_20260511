package ex08;

import java.util.function.Function;

/*
 * 정수값 전달하면 제곱한 값을 돌려주는 메소드 구현.
 */

public class FunctionMain {

	public static void main(String[] args) {
			
		Function<Integer, Integer> fun  = new Function<Integer, Integer>() {
			
			@Override
			public Integer apply(Integer t) {
				
				return t*t;
			}
		};
		
		System.out.println(fun.apply(5)); 
		
	}
}
