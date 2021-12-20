package tag27_Constructor_ConstructorCall;

import java.util.Scanner;

public class Siniflar extends HesapMakinesi {

	Siniflar(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("HEsap MAkinesi icin iki sayi girniz:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		HesapMakinesi hesap = new HesapMakinesi(a,b);
		hesap.toString(a, b);
		
		
	}
	
	

}
