package tag45_Collections;

import java.util.LinkedList;
import java.util.List;

public class C03_LinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll =new LinkedList<>();
		
		ll.add(5);
		ll.add(7);
		System.out.println(ll);
		
		System.out.println(ll.hashCode());// 1123 java nin verdigi hash code'u doner.
		
		LinkedList<Integer> ll2 =new LinkedList<>();
		
		ll2.add(7);
		
		System.out.println(ll2.hashCode()); // 38
		
		System.out.println(ll2.offer(10)); // hem ekliyor hem de boolean donuyor.
		System.out.println(ll2);
	}

}
