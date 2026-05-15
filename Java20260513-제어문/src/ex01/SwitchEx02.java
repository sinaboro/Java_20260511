package ex01;

public class SwitchEx02 {
	public static void main(String[] args) {
		
		/*
		 *  int jumsu = 95;
			if(jumsu >= 90) {
				System.out.println("A학점");
		   	    System.out.println("공부잘했네...");
			}
			else if(jumsu >= 80) 
				System.out.println("B학점");		
			else if(jumsu >= 70) 
				System.out.println("C학점");
			else if(jumsu >= 60)
				System.out.println("D학점");
			else 		
				System.out.println("F학점");
						
			System.out.println("프로그램 종료!!");
		 */
		
		int jumsu = 2;
		
		switch(jumsu) {
			case 1:
				System.out.println("입력한 숫자는 1");
			case 2:
				System.out.println("입력한 숫자는 2");
			case 3:
				System.out.println("입력한 숫자는 3");
			default:
				System.out.println("그 외 숫자");
		}
		
		System.out.println("프로그램 종료!!");
	}
}
