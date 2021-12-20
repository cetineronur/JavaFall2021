package tag46_Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class C02_ReatainAll {

	public static void main(String[] args) {


		Set<String> set = new LinkedHashSet<>();
		
		set.add("Ali");
		set.add("Mehmet Ali");
		set.add("Hasan");
		set.add("Kutlu");
		
		Set<String> set1 = new LinkedHashSet<>();
		
		set1.add("Ali");
		set1.add("Mehmet ALi");
		set1.add("Filiz");
		
		System.out.println(set.retainAll(set1));
		
		System.out.println(set);
		System.out.println(set1);

	}

}
