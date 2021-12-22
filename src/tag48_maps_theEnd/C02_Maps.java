package tag48_maps_theEnd;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class C02_Maps {

	public static void main(String[] args) {
		/*Verilen map’te istenen programlama dilini bilen kisileri list olarak donduren
		 * bir method yaziniz.
		  
		 * map { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#} Istenen dil
		 * java Sonuc [Ali, Veli]
		 */

		Map<Integer, String> soruMap = MapCreat.myMap();

		String istenenDil = "Java";

		System.out.println(dilBilen(soruMap, istenenDil));

	}

	private static List<String> dilBilen(Map<Integer, String> soruMap, String istenenDil) {

		List<String> dilBilen = new ArrayList<>();

		List<String> valueList = new ArrayList<>(soruMap.values());

		String parcaliArr[] = new String[3];

		for (String each : valueList) {

			parcaliArr = each.split(", ");

			if (parcaliArr[2].equalsIgnoreCase(istenenDil)) {

				dilBilen.add(parcaliArr[0]);

			}

		}

		return dilBilen;
		// TODO Auto-generated method stub

	}

}
