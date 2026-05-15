package ex02;

public class WhileEx04 {

	public static void main(String[] args) {
		
		// 2~5단 구구단 출력
		// 출력예시 2 X 1 = 2
		int i = 2; //단 2~5
		int j = 1; //1~9
				
		while(i<=5) {						
			while(j<=9) {
				System.out.println(i + "X" + j + " = " + i*j);
				j++;
			}
			i++;
			j=1;
		}
	}

}
