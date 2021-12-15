package tag41_Errors_garbageCollector;

/*public class aa {

	public static void main(String[] args) {
		int nums1[]= {1,2,3};
		int nums2[]= {1,2,3,4,5};
		nums2=nums1;
		System.out.println(Arrays.toString(nums2));
		System.out.println(Arrays.toString(nums1));
		for (int x : nums2) {
			System.out.println(x+":");
		}
		
	}

}*/


class A{
	public A() {
		
		System.out.println("A ");
	}
}

class B extends A{
	public B() {
		System.out.println("B ");
	}
}

class C extends B{
	public C() {
		System.out.println("C ");
	}
	
	public static void main(String[] args) {
		C C = new C();

	}
}

