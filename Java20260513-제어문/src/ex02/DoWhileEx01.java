package ex02;

public class DoWhileEx01 {

	public static void main(String[] args) {
		
		int i=0;
		int sum=0;
		
		do {
			i++;
			sum += i;
		}while(i<5);
		
		System.out.println("총합: " + sum);

	}

}
