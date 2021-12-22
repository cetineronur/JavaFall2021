package tag48_maps_theEnd;

import java.util.HashMap;
import java.util.Map;

public class C04_Compute {

	public static void main(String[] args) {
		Map<String, Integer> ornek = new HashMap<>();
		
		ornek.put("A", 2);
		ornek.put("B", 5);

		ornek.put("C", 1);
		ornek.put("Z", 3);

		ornek.put("K", 10);
		System.out.println(ornek);
		
		ornek.compute("A",(key,value) -> 10);
		System.out.println(ornek);
		
		ornek.computeIfAbsent("D",v->20);
		
	System.out.println(ornek);
		
		
	}

}
