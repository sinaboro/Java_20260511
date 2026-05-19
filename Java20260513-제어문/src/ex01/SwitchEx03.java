package ex01;

public class SwitchEx03 {
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
		
		int jumsu =99;
		
		switch(jumsu/10) {
			case 10:			
			case 9:
				System.out.println("A학점");
				break;
			case 8:
				System.out.println("B학점");
				break;
			case 7:
				System.out.println("C학점");
				break;
			case 6:
				System.out.println("D학점");
				break;
			default:
				System.out.println("F학점");
		}
		
		System.out.println("프로그램 종료!!");
	}
}
