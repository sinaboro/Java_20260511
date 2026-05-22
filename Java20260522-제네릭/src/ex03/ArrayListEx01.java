package ex03;

import java.util.ArrayList;

public class ArrayListEx01 {
	
	public static void main(String[] args) {
		/*
		 * 중복허용, 순서보장
		 */
		ArrayList<Integer> list = new ArrayList<>();
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
		list.remove(1);
		
		for(int num : list)
			System.out.println(num);
		
		list.add(1, 50);
		System.out.println("------------------");
		for(int num : list)
			System.out.println(num);
	}

}
