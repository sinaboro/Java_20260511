package ex01;

public class IfEx07 {

	public static void main(String[] args) {
		
		/*
		 * 버스 요금 계산표
		 * 요금 : 2000
		 * 65세이상 : 무료
		 * 20 ~ 64 : 할인율 0%
		 * 15 ~ 19 : 할인율 20%
		 * 7 ~ 14  : 할인율 50%
		 * 6 미만   : 무료
		 * 
		 * 출력 예시
		 * 나이 xx는 xx요금 입니다.
		 */
		
		int age = 25;		
		int fee = 2000;
		double rate = 0;
		
		if(age>=65)
			fee = 0;
		else if(age>=20 && age<=64)
			rate = 0;
		else if(age>=15 && age<=19)
			rate = 0.2;
		else if(age>=7 && age<=14)
			rate = 0.5;
		else
			fee = 0;
			
		if(fee != 0) {
			fee = (int)(fee * (1-rate));
		}
		
		System.out.println("나이 " + age + "는 " + fee + "요금 입니다.");
		
		System.out.println("프로그램 종료!!");

	}

}
