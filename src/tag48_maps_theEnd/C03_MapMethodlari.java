package tag48_maps_theEnd;

import java.security.KeyStore.Entry;
import java.util.Map;
import java.util.Set;

public class C03_MapMethodlari {

	public static void main(String[] args) {


		Map<Integer, String> ornek = MapCreat.myMap();
		
		System.out.println(ornek.containsKey(110)); // false
		System.out.println(ornek.containsValue("Ali, Yan, C#")); // TRUe
		
		Set<java.util.Map.Entry<Integer, String>> entrySet=ornek.entrySet();
		
		int sayac=1;
		
		for (java.util.Map.Entry<Integer, String> each : entrySet) {
			System.out.println(sayac + ".entry : "+ each);
			sayac++;
		}
		System.out.println(ornek.getOrDefault(110, "girilen key map'de yok"));
		
		System.out.println(ornek.getOrDefault(103, "girilen key map'de yok"));
		
		ornek.putIfAbsent(110, "Fikri, Yan, Qa");//Fikri, Yan, Qa olmadigi icin key 110'a ekler.
		
		sayac=1;
		
		for (java.util.Map.Entry<Integer, String> each : entrySet) {
			System.out.println(sayac + ".entry : "+ each);
			sayac++;
		}
		
		String maptenString=ornek.toString();
		
		System.out.println(maptenString);
		
	}

}
