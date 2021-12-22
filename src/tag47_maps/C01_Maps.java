package tag47_maps;

import java.util.*;

public class C01_Maps {

	public static void main(String[] args) {
		
		Map<Integer, String> sinif = new HashMap<>();
		
		sinif.put(101,"Ali, Can, J.Dev");
		sinif.put(102,"Veli, Yan, QA");
		sinif.put(103, "Ali, Jan, C#");
		
		int no=104;
		String isim = "Ayse";
		String soyisim="Can";
		String brans="QA";
		
		sinif.put(no, isim+", "+soyisim+", "+brans);
		
		System.out.println(sinif);
		
		System.out.println(sinif.get(102)); //Veli, Yan, QA
		
		System.out.println(sinif.keySet());//[101, 102, 103, 104] bir set olarak key degerlerini dondurur.
		
		System.out.println(sinif.values()); // [Ali, Can, J.Dev, Veli, Yan, QA, Ali, Jan, C#, Ayse, Can, QA]
		
		List<String> valueList =new ArrayList<>(sinif.values());
		
		System.out.println("value List: "+ valueList);
		
		System.out.println(valueList.size());
		
		List<String> isimListesi = new ArrayList<>();
		
		String bilgiler[] = new String[3];
		
		for (int i = 0; i < valueList.size(); i++) {
			
			bilgiler=valueList.get(i).split(",");
			isimListesi.add(bilgiler[0]);
		}
		System.out.println(isimListesi);
		
		

	}

}
