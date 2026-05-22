package ex07;

public class PersomMain {

	public static void main(String[] args) {
		
		Person p1 = new Person("까미", 15);   //1
		
		Person p2 = new Person("로이", 13);   //2
		
		Person p3 = new Person("강산", 5);    //3

		System.out.println(p1.name);
		System.out.println(p3.age);
		
		System.out.println("no : " + Person.no);  //<< 이것 사용해야 한다.
		System.out.println("no : " + p1.no);
		System.out.println("no : " + p2.no);
		System.out.println("no : " + p3.no);
		
		p1.func();
		p2.func();
		
		Person.func2();
		
	}

}

class Person{
	String name;  //멤버변수, 인스턴스 변수
	int age;      //멤버변수, 인스턴스 변수
	
	static double pi = 3.14159;  //클래스변수, 정적변수	
	static int no= 0; //클래스변수, 정적변수
	
	
	void func() {  //인스턴스 메소드, 멤버함수
		System.out.println("func() 호출");
		age = age+1;
		no = no+1;
	}
	
	static void func2() { //클래스메소드, 정적 메소드
		System.out.println("func2() 호출");
		no = no +1;
		//age = age +1; xxxxx
	}
		
	Person(String name, int age){
		this.name = name;
		this.age = age;
		
		no++;
	}
}
