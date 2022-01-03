package javaLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {
	/*
	 * 1) Lambda "Functional Programming" "Functional Programming" de
	 * "Nasil yaparim?" degil "Ne yaparim?" dusunulur. 2) "Structured Programming"
	 * de "Ne yaparim?" dan cok "Nasil Yaparim?" dusunulur 3)
	 * "Functional Programming" hiz, code kisaligi, code okunabilirligi ve hatasiz
	 * code yazma acilarindan cok faydalidir. 4) Lambda sadece
	 * collections'larda(List, Queue ve Set) ve array'lerde kullanilabilir ancak
	 * map'lerde kullanılmaz. Lambda kullanmak hatasız code kullanmaktır.
	 */
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(12, 13, 65, 3, 7, 34, 22, 60, 42, 55, 44));

		prinElStructured(list);
		System.out.println();
		System.out.print("    *****     ");

		printElfunctional(list);

		System.out.println();
		System.out.print("    *****     ");

		printElfunctional1(list);
		
		System.out.println();
		System.out.print("    *****     ");
		
		printCiftElfunctional(list);
		
		System.out.println();
		System.out.print("    *****     ");
		
		printCiftElfunctional1(list);
		
		System.out.println();
		System.out.print("    *****     ");
		printCiftAltmisKucuk(list);
		
		System.out.println();
		System.out.print("    *****     ");
		printTekYirmiBuyuk(list);
		
	}
	// structured programming ile list elemanlarinin tamamini yazdiriniz.

	public static void prinElStructured(List<Integer> list) {

		for (Integer w : list) {
			System.out.print(w + " ");
		}
	}

	// Functional programming ile list elemanlarinin tamamini yazdiriniz.
	public static void printElfunctional(List<Integer> list) {
		System.out.println();
		list.stream().forEach(t -> System.out.print(t + " "));

		// stream(): datalari yukaridan asagi akis sekline getirir. lambda metodudur.

	}
	// Method reference ---> kendi creat ettigimiz veya javadan aldigimiz method ile
	// Classname:: MethodName

	public static void printEl(int t) {// refere edilecek method creat edildi
		
		System.out.print(t + " ");
	}

	public static void printElfunctional1(List<Integer> list) {
		System.out.println();
		list.stream().forEach(Lambda01::printEl);
	}
	// structured programming ile list elemanlñarinn cift olanlarinin ayni satirda yaziniz.
	
	public static void printCiftElStructured(List<Integer> list) {
		for (Integer w : list) {
			if(w%2==0) {
				System.out.print(w+" ");
			}
		}
	}
	// funktional programming ile list elemanlñarinn cift olanlarinin ayni satirda yaziniz.
	
	public static void printCiftElfunctional(List<Integer> list) {
		System.out.println();
		list.stream().filter(t->t%2==0).forEach(Lambda01::printEl);
		// filter() --> sarta gore filtrele
	}

	public static boolean ciftBul(int i) { // refere edilecek tohum 
		return i%2==0;
		
	}
	public static void printCiftElfunctional1(List<Integer> list) {
		System.out.println();
		list.stream().filter(Lambda01::ciftBul).forEach(Lambda01::printEl);
		
	}
	// funktional programming ile list elemanlñarinn cift olanlarinin 60 dan kucuk olanlari ayni satirda yaziniz.
	public static void printCiftAltmisKucuk(List<Integer> list) {
		System.out.println();
		list.stream().filter(t->t%2==0 & t<60).forEach(Lambda01::printEl);
	}
	// funktional programming ile list elemanlñarinn tek olanlarinin veya 20 dan buyuk olanlari ayni satirda yaziniz.

	public static void printTekYirmiBuyuk(List<Integer> list) {
		System.out.println();
		list.stream().filter(t->t%2==1 || t>20).forEach(Lambda01::printEl);
	}
	
}
