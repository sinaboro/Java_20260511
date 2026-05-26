package ex08_2;

import java.util.function.BiFunction;
import java.util.function.Function;

/*
 * 정수값 전달하면 제곱한 값을 돌려주는 메소드 구현.
 */

public class FunctionMain {

	public static void main(String[] args) {
			
		BiFunction<Integer, Integer, Double> f1 = new BiFunction<Integer, Integer, Double>() {
			
			@Override
			public Double apply(Integer t, Integer u) {
				return (double)t/u;
			}
		};
		
		System.out.println(f1.apply(5, 2));
		
	}
}
