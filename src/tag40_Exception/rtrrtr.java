package tag40_Exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class rtrrtr {

	public static void main(String[] args) {
		class rtrrtr1 {
			
			static int tercih;
			static List<Integer> sayi = new ArrayList<>();
		    static List<String> kelime = new ArrayList<>();
		    
		    static List<Integer> sayi1 = new ArrayList<>();
		    static List<String> kelime1 = new ArrayList<>();
		    static Scanner scan = new Scanner(System.in);
		    static int count=1;
		    
		   
			public static void main(String[] args) {
			
			    
				System.out.println("Kelime girisi icin 1 giriniz\n Sayi girisi icin 2 giriniz ");
				Scanner scan = new Scanner(System.in);
				tercih = scan.nextInt();
				
				switch (tercih) {
				case 1:
					kelime();
					System.out.println(kelime);
					break;
			        case 2:	
		        	sayi();
		        	System.out.println(sayi);
					break;
				default:
					break;
				}
			}
			public static void sayi() {
				while (count<8) {
				System.out.println(count+ ". sayiyi giriniz:");
				sayi.add(scan.nextInt());
				count++;
				}
				 for (int i = sayi.size()-1; i >=0 ; i--) {
					for (int j = i-1; j >=0; j--) {
						if (sayi.get(i)==sayi.get(j)) {
							
							sayi.remove(sayi.get(i));
							
						}
					}	
				}		
			}
			public static void kelime() {
					while (count<8) {
					System.out.println(count+ ". kelimeyi giriniz:");
					
					kelime.add(scan.nextLine());
					
					count++;
					}
					for (int i = kelime.size()-1; i >=0 ; i--) {
						for (int j = i-1; j >=0; j--) {
							if (kelime.get(i).equals(kelime.get(j))) {
								int index= kelime.indexOf(kelime.get(i));
								kelime.remove(index);
								
							}
						}
						
					}
			}
		}
	}
}