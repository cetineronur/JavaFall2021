package Tag39_Overriding_Polymorfhism;

public class C01 {

	public static void staticMethod () {
		System.out.println("Parent class static method calisti");
	}
	public void privateMethod () {
		System.out.println("Parent class private method calisti");
	}
	//FINAL DEMEK BU SON HALI BIR DAHA DEGISIRILEMEZ 
	//DOLASIYLA FINAL OVERRIDE EDILEMEZ
	public final void finalMethod () {
		System.out.println("Parent class final method calisti");
	}
	//CHILD CLASS ILE PARENT CLASS AYNI PACKAGEDA OLDUKLARINDAN
	//
}
