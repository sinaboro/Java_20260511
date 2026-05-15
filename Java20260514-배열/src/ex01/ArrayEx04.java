package ex01;

public class ArrayEx04 {

	public static void main(String[] args) {
		/*
		 * 이번주 로또 번호 출력
		 */
		
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++)
			lotto[i] =  (int)(Math.random()*45) + 1; //1~45
		
		System.out.println("로또 번호 : ");	
		for(int i=0; i<lotto.length; i++)
			System.out.print(lotto[i] + " ");
		
		//System.out.println();
		System.out.println("\n이 문장 출력");
		
	}

}
