package javaPractise;
import java.util.Scanner;
public class Ter01 {
    public static void main(String[] args) {
        //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
    	Scanner scan = new Scanner(System.in);
		 System.out.println("bir sayi giriniz");
		 double sayi = scan.nextDouble(); 
		 
		 System.out.println("****** ternary cozum ******");
		 System.out.println((sayi>=0)?((sayi<10)?"rakam":"Pozitif sayi"):("Negatif sayi"));
		 
		 
		 System.out.println("****** if      cozum ******");
		 if (sayi>=0) {
			if (sayi<10) {
				System.out.println("rakam");
			}else {
				System.out.println("pozitif sayi");
			}
		}else {
			System.out.println("Negatif sayi");
		}
		 scan.close();
    }}
