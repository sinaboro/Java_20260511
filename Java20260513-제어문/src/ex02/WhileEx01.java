package ex02;

public class WhileEx01 {

	public static void main(String[] args) {
		
		int i=0;
		int sum=0;
		
		while(i<5) {
			i++;
			sum += i;
		}
		System.out.println("총합 : " + sum);
	}

}
