package ex05;

import java.util.HashSet;
import java.util.Set;

public class SetEx02 {

	public static void main(String[] args) {
		
		Set<Person> set = new HashSet<Person>();
		
		set.add(new Person("홍길동"));
		set.add(new Person("홍길동"));
		set.add(new Person("홍길동"));
		set.add(new Person("까미"));
		set.add(new Person("까미"));
		
		for(Person p : set)
			System.out.println(p);
	}

}


