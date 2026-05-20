package ex09;

public class StudentTest {

	public static void main(String[] args) {
		/*
		 * Student 객체를 3개 생성하여 배열에 넣는다.
		   배열에 있는 객체 정보를 printInformation()을 호출하여 모두 출력 한다.
		   예시 데이타 :
		   	홍길동 20 171 81 201101 영문
			고길동 21 183 72 201102 건축
			박길동 22 175 65 201103 컴공
		 */
		Student[] arrays = new Student[3];
		
		arrays[0] = new Student(	"홍길동" ,20, 171, 81, "201101", "영문");
		arrays[1] = new Student(	"고길동" ,21, 181, 72, "201102", "건축");
		arrays[2] = new Student(	"박길동" ,22, 175, 65, "201103", "컴공");
		
		for(int i=0; i<arrays.length; i++) {
			System.out.println(arrays[i].printInformation());
		}
		
	}

}
