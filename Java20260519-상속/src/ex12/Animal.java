package ex12;
/*
 * 추상 클래스
 *  - 클래스 안에 추상메소드가 1개이상있으면 그 클래스는 추상 클래스
 *  - 추상클래스는 객체 생성 불가!!
 */
public abstract class Animal {

	//일반 메소드
	void eat() {
		System.out.println("동물이 밥을 먹는다");
	}
	
	//추상 메소드
	abstract void sound();
}
