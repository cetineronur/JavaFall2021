package javaPractise;
import java.util.Scanner;
public class Q03 {
	public static void main(String[] args) {
		/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		 */
		Scanner scan = new Scanner(System.in);
    	System.out.print("boyunuzu cm olarak giriniz: ");
    	double boy = scan.nextDouble();
    	System.out.print("kilonuzu kg olarak giriniz: ");
    	double kilo = scan.nextDouble();
      	double bmi=kilo/(boy/100*boy/100);
    	if (bmi<=20) {
			System.out.println("Oldukca zayifsiniz: "+bmi);
		}else if(bmi<=25) {
			System.out.println("normal sinirlardasiniz: "+bmi);
		}else if  (bmi<=30) {
			System.out.println("sisman kategorisindesiniz: "+bmi);
		}else  {
			System.out.println("Obezsiniz: "+bmi);
		}scan.close();
    	}}
    

