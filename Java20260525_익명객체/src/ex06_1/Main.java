package ex06_1;

@FunctionalInterface //추상 메소드 1개만 존재
interface Calculable{
	void calculate(int x, int y);       
}

public class Main {

	public static void main(String[] args) {
		
		Calculable cal = (x, y) -> System.out.println(x+y);
			
		cal.calculate(5, 6);
		
	}
}
