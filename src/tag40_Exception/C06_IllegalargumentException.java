package tag40_Exception;

import java.util.Scanner;

public class C06_IllegalargumentException {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen konsolda gormek icin yasinizi giriniz:");

		int yas = scan.nextInt();
		try {
			if (yas < 0) {
				throw new IllegalArgumentException();
			} else {
				System.out.println(yas);
			}

		} catch (IllegalArgumentException e) {
			System.out.println(e);
			System.out.println("Yas sifirdan kucuk olamaz");
		}

	}

}
