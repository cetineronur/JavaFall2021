package tag46_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_HashSet {

	public static void main(String[] args) {
		// verilen Arraydeki tekrar edilen sayilari silen code creat
		
		int arr[]= {3,4,5,4,2,3,1,1,1,1,2,4,5,6,3,3,4,5,7,8,7,8};
		
		Set<Integer> benzersizSet = new HashSet<>();
		
		for (Integer each : arr) {
			benzersizSet.add(each);
		}System.out.println(benzersizSet);
		
		Object[] tekrarsizArr = benzersizSet.toArray();
		System.out.println(Arrays.toString(tekrarsizArr));
	}

}
