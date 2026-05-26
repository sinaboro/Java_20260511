package ex03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListEx01 {
	
	public static void main(String[] args) {
		/*
		 * 중복허용, 순서보장
		 */
		List<Integer> list = new LinkedList<>();
		list.add(new Integer(10));
		list.add(20);
		list.add(55);
		list.add(10);
		list.add(45);
		
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		System.out.println("------------------");
		
		for(int num : list)
			System.out.println(num);
		System.out.println("------------------");
	
		list.remove(1);  //index 1 삭제
		
		for(int num : list)
			System.out.println(num);
		
		list.add(1, 50);
		System.out.println("------------------");
		for(int num : list)
			System.out.println(num);
	}

}
