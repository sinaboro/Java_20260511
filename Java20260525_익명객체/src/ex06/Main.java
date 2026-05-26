package ex06;

@FunctionalInterface //추상 메소드 1개만 존재
interface Calculable{
	void calculate(int x, int y);       
}

public class Main {

public static void main(String[] args) {
		
		Calculable cal = new Calculable() {
			
			@Override
			public void calculate(int x, int y) {
				System.out.println(x+y);
			}
		};
		
		cal.calculate(5, 6);
		
	}
}
