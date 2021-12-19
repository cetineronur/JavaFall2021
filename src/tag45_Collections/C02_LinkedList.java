package tag45_Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C02_LinkedList {

	public static void main(String[] args) {
		
		List<Integer> ll =new LinkedList<>();
		
		ll.add(5);
		ll.add(7);
		System.out.println(ll);
		//Data turunu List sectigimiz icin sadece List inerface'indeki mehodlari kullanabilirim. 
		//LinkedList class'inda override ettigimiz icin List interface olmasina ragmen List methodlarini kullanabildik.
		
		Queue<Integer> ll2 =new LinkedList<>();
		ll2.add(5);
		ll2.add(7);
		ll2.clear();// DAta turu queue secilince queue interface'inden gelen methodlari kullanabildik.
		
		Deque
		
	}

}
