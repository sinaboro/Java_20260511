package ex03;

public class SingletonExam {

	public static void main(String[] args) {
		
		                // 싱글톤으로 객체 주소 획득
 		 Singleton s1 =  Singleton.getInstace();
 		 
 		 System.out.println(s1);
 		 
 		 Singleton s2 = Singleton.getInstace();
 		 
 		 System.out.println(s2);
	}

}
