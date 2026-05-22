package ex05;

import java.io.ObjectInputStream;
import java.util.Objects;

public class Person {	
	
	String name;
	public Person(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	@Override
	public boolean equals(Object obj) {		
		
		Person p = (Person)obj;
		
		return Objects.equals(name, p.name);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	
	
}
