package tag48_maps_theEnd;

import java.util.HashMap;
import java.util.Map;

public class C01_Maps {

	public static void main(String[] args) {
		/*Verilen bir String’deki harfleri ve harflerin kacar kez 
		kullanildigini return eden bir method yaziniz
	    Ornek : Input : Hellooo  output : H=1, e=1, l=2, o=3*/
		
		String input = "Hellooo";
		System.out.println(harfSay(input));

	}

	private static Map<String, Integer> harfSay(String input) {
		Map<String, Integer> harfSayilariMap = new HashMap<>();
		String inputArr[]=input.split("");// [H,e,l,l,o,o,o]
		for (String each : inputArr) {
			
			if(!harfSayilariMap.containsKey(each)) {
				harfSayilariMap.put(each, 1);
			}else {
				harfSayilariMap.put(each,harfSayilariMap.get(each)+1);
			}
		}
		return harfSayilariMap;
	}
}
