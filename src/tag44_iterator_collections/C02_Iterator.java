package tag44_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(7);
		list.add(9);
		list.add(2);
		list.add(8);
		
		System.out.println(list); // [5, 3, 7, 9, 2, 8]

		Iterator ite = list.iterator(); //iterator bir amac icin olusturulur. burada list icin actik.
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(ite.hasNext()+" ==== "+ite.next());
		}
		System.out.println(ite.hasNext()); // false
		System.out.println(ite.next()); // java.util.NoSuchElementException

	}

}
