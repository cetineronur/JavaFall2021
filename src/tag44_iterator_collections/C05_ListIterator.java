package tag44_iterator_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C05_ListIterator {

	public static void main(String[] args) {
	
		List<String> liste = new ArrayList<>();
		liste.add("Ali");
		liste.add("Veli");
		liste.add("Ayse");
		liste.add("Fatma");
		liste.add("Emrah");
		
		System.out.println(liste);
		
		ListIterator li1=liste.listIterator();
		
		while (li1.hasNext()) {
			li1.set(li1.next()+"x"); // her index'e x ekledik.
				
		}
		System.out.println(liste);
	}

}
