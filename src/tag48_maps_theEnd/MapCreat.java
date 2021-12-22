package tag48_maps_theEnd;

import java.util.HashMap;
import java.util.Map;

public class MapCreat {
	
	public static Map <Integer,String> myMap(){
		
		Map<Integer, String> ornekMap = new HashMap<>();
		
		ornekMap.put(101, "Ali, Can, java");
		ornekMap.put(102, "Veli, Yan, java");
		ornekMap.put(103, "Ali, Yan, C#");
		return ornekMap;
	}

}
