package tag17;

import java.util.Scanner;

public class forLoop4 {

	public static void main(String[] args) {
		//Kullanicidan 100’den kucuk bir tamsayi isteyin. 
		//1’den baslayarak girilen sayiya kadar
		//3’un veya 5”in kati olan sayilari yazdirin.
		Scanner scan = new Scanner(System.in);
		System.out.println("100'den kucuk bir tam sayi giriniz");
		int nummer= scan.nextInt();
		
		for (int i = 1; i<=nummer; i++) {
			if (i%3==0 || i%5==0) {
				System.out.print(i+" ");
			}else {
				System.out.print("");
			}
		}
		scan.close();
		
	}

}
