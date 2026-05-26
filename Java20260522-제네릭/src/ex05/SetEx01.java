package ex05;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx01 {

	public static void main(String[] args) {
		/*
		 * Set 자료형
		 * 중복 허용 불가
		 * 순서 보장 안됨
		 */
		Set<String> set = new TreeSet<>();
		set.add("kor");
		set.add("eng");
		set.add("math");
		set.add("홍길동");
		set.add("까미");
		set.add("kor");
		set.add("까미");
		
		for(String str : set)
			System.out.println(str);
	}

}
