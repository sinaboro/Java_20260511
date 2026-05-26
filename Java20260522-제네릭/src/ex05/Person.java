package ex05;

import java.io.ObjectInputStream;
import java.util.Objects;

public class Person {	
	
	String name;

    public Person(String name) {
        this.name = name;
    }

    // 같은 객체인지 비교
    @Override
    public boolean equals(Object obj) {

        // 자기 자신 비교
        if(this == obj) {
            return true;
        }

        // null 체크 + 타입 체크
        if(obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // 다운캐스팅
        Person p = (Person)obj;

        // name 값 비교
        return Objects.equals(this.name, p.name);
    }

    // 해시코드 생성
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }
	
	
}
