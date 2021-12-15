package tag40_Exception;

public class C01_Exception {

	public static void main(String[] args) {
		int a=20;
		int b=0;
		try {
		System.out.println("sayilarin bolumu: "+a/b);
		}catch (ArithmeticException k) {
			System.out.println("sifira bolum yapilamaz");
			k.printStackTrace();
			
		}
			System.out.println("Gorev tamamlandi");
	}

}
