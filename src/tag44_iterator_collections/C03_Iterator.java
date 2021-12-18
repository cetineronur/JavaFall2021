package tag44_iterator_collections;

import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;

public class C03_Iterator {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(7);
		list.add(9);
		list.add(2);
		list.add(8);
		
		System.out.println(list);
		Iterator ite = list.iterator();
		ite.next();
		ite.next();
		ite.next();
	
		System.out.println(ite.next());
		
		ite.remove();
		
		System.out.println(list);
		
		ite.remove();
		System.out.println(list);

	}

}
