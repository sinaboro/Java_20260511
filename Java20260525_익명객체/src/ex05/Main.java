package ex05;

@FunctionalInterface //추상 메소드 1개만 존재
interface ButtonClick{
	void click();   //버튼이 클릭이 되었요!    
}

public class Main {

public static void main(String[] args) {
		
		ButtonClick bc = () -> System.out.println("버튼이 클릭이 되었요!");
		
		bc.click();
	}
}
