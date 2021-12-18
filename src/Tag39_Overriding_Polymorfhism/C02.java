package tag39_Overriding_Polymorfhism;

public class C02 extends C01 {

	public static void main(String[] args) {
		C02 obj1 =new C02();
		obj1.privateMethod();
		obj1.staticMethod();
		
		C01 obj2 = new C02();
		obj2.privateMethod();
		obj2.staticMethod();

	}
	public static void staticMethod () {
		System.out.println("CHILD class static method calisti");
	}
	public void privateMethod () {
		System.out.println("CHILD class private method calisti");
	}
	/*
	public final void finalMethod () {
		System.out.println("Parent class final method calisti");
	}*/

}
