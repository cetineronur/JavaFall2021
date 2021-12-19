package tag45_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C04_Set {

	public static void main(String[] args) {
		
		Set<Object> set=new HashSet<>();
		
		set.add(4);
		set.add(7);
		set.add("Onur");
		
		System.out.println(set);
		
		set.add("Java candir");
		System.out.println(set);
		
		List<Object> liste = new ArrayList<>();
		
		liste.add(5);
		liste.add("Java Super");
		liste.add(true);
		liste.add('x');
		liste.add(5);
		liste.add(set);
		
		System.out.println(liste);

	}

}
