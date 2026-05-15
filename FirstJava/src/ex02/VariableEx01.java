package ex02;


// 한 줄 주석

/*
 여러 줄 주석(코멘트 or 설명문)
 클래스 명은 카멜 표기법 => 자바는 기본이 카멜표기법
 카멜 표기법:
 - 영문자 첫글자는 대문자
 - 영문자 두 단어가 조합되있으면 첫글자, 두번째 단어 대문자
  예) saleorder -> SaleOrder
  스네이크표기법: -> 데이타베이스(오라클, mysql, maridb)
  예) Sale_order
 */

public class VariableEx01 {

	public static void main(String[] args) {
		
		/*
		 *  변수(값을 저장소) -> 정수형, 실수형, 문자형
		 *  정수 -> integer(4), long(8)
		 *  실수 -> float(4), double(8)
		 *  문자 -> String
		 */
		
		int age;   //int:자료형, age:변수명(첫글자소문자&카멜표기법)
		age = 20;		
		System.out.println("나이 : " + age);
		
		double kor;
		kor = 97.3;		
		System.out.println("국어점수 : " + kor);
		
		double eng = 78.4;
		System.out.println("영어점수 : " + eng);
		
		String name;
		name = "김대철";
		System.out.println("이름 : " + name);

	}

}
