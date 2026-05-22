package ex04;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListEx01 {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(new Integer(10));
		list.add(20);
		list.add(30);
		list.add(40);
		
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		System.out.println("------------------");
		
		for(int num : list)
			System.out.println(num);
		System.out.println("------------------");
		list.remove(1);
		
		for(int num : list)
			System.out.println(num);
		
		list.add(1, 50);
		System.out.println("------------------");
		for(int num : list)
			System.out.println(num);
	}

}
