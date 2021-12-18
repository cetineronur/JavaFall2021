package tag44_iterator_collections;

import java.util.ArrayList;
import java.util.List;

public class C01_Iterator {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(7);
		list.add(9);
		System.out.println(list);
		
		// index kullanmadan tum elemnalari 3 eklenmis olarak yazdirin.
		for (Integer each : list) {
			System.out.print(each+3+" ");
		}
		//fakat list degismiyor
	}

}
