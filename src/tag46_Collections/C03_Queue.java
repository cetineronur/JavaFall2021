package tag46_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {

	public static void main(String[] args) {

		
		StringBuilder sb1 = new StringBuilder("OCAJP8");
		StringBuilder sb2 = sb1 ;
		sb1.append("J");
		System.out.println(sb1 + " "+ sb2+ " " + (sb1==sb2));
		
		Queue<String> kuyruk = new LinkedList<>();
		kuyruk.add("Lutfullah");
		kuyruk.add("Mustafa");
		kuyruk.add("Ridvan");
		
		System.out.println(kuyruk);
		kuyruk.remove();// ilk elemani siler.
		System.out.println(kuyruk);
	}

}
