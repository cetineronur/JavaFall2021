package tag44_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C04_Iterator {

	public static void main(String[] args) {
		
		// itarator kullanarak tum elementleri silin.
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(7);
		list.add(9);
		list.add(2);
		list.add(8);
		
		System.out.println(list);
		Iterator ite = list.iterator();
		
		while (ite.hasNext()) {
			ite.next();
			ite.remove();
			System.out.println(list);
		}
		
	}

}
