package ex06;

public class B extends A{

	void fb() {
		System.out.println("fb()");
	}
	/*
	 * 상위클래스있는 메소드를 하위클래스가 다시 작성하는 것을
	 * 메소드 오바라이딩 이라고 한다.
	 * 상위 클래스 있는 메소드를 하위클래스가 재 작성하는것을 매소드 재정의라고 부른다.
	 */
	
	@Override //@ 어노테이션
	void test() {
		System.out.println("B Class..");
	}
}
