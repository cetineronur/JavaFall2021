package tag45_Collections;

import java.util.LinkedList;

public class C01_LinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll =new LinkedList<>();
		System.out.println(ll);
		ll.add(5);
		ll.add(7);
		System.out.println(ll);
		ll.addFirst(4); // queue interface
		System.out.println(ll);
		ll.add(0, 3);//List interface
		System.out.println(ll);
		
		LinkedList<Integer> ll2 = new LinkedList<>();
		ll2.addAll(ll);
		
		System.out.println(ll2);
	}

}
