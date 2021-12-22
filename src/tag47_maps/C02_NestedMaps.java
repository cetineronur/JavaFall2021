package tag47_maps;

import java.util.HashMap;
import java.util.Map;

public class C02_NestedMaps {

	public static void main(String[] args) {
		// icice map olusturacaksak en iceriden baslamaniz yavsiye olunur.
		
		Map<String,String> ogr1Map = new HashMap<>();
		ogr1Map.put("isim","ALi");
		ogr1Map.put("soyisim","Can");
		ogr1Map.put("brans","J.Dev");
		
		Map<String,String> ogr2Map = new HashMap<>();
		ogr2Map.put("isim","Veli");
		ogr2Map.put("soyisim","Yan");
		ogr2Map.put("brans","Qa");
		
		Map<String,String> ogr3Map = new HashMap<>();
		ogr3Map.put("isim","ALi");
		ogr3Map.put("soyisim","Yan");
		ogr3Map.put("brans","J.Dev");
		
		Map<String,String> ogr4Map = new HashMap<>();
		ogr4Map.put("isim","Ayse");
		ogr4Map.put("soyisim","Can");
		ogr4Map.put("brans","Qa");
		
		System.out.println("1.Ogrenci : "+ogr1Map);
		System.out.println("2.Ogrenci : "+ogr2Map);
		System.out.println("3.Ogrenci : "+ogr3Map);
		System.out.println("4.Ogrenci : "+ogr4Map);

		Map<Integer, Map<String,String>> sinifMap = new HashMap<>();
		
		sinifMap.put(101, ogr1Map);
		sinifMap.put(102, ogr2Map);
		sinifMap.put(103, ogr3Map);
		sinifMap.put(104, ogr4Map);
		
		System.out.println(sinifMap); //{
								      // 101={soyisim=Can, brans=J.Dev, isim=ALi}, 
									  // 102={soyisim=Yan, brans=Qa, isim=Veli}, 
									  //103={soyisim=Yan, brans=J.Dev, isim=ALi}, 
									  //104={soyisim=Can, brans=Qa, isim=Ayse
										//}
				}
}


