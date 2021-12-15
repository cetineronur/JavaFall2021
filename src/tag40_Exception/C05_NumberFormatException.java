package tag40_Exception;

public class C05_NumberFormatException {

	public static void main(String[] args) {
		
		String str="123a";
		
		//int sayi=Integer.parseInt(str)+4;
		int sayi=Integer.valueOf(str)+4;
		
		System.out.println(sayi);
	}

}
