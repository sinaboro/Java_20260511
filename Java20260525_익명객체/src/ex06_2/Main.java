package ex06_2;

@FunctionalInterface //추상 메소드 1개만 존재
interface Calculable{
	int calculate(int x, int y);       
}

public class Main {

	public static void main(String[] args) {
		
		Calculable cal = new Calculable() {
			
			@Override
			public int calculate(int x, int y) {
				return x+y;
			}
		};
		
		int result = cal.calculate(5, 6);
		System.out.println(result);
		
	}
}
