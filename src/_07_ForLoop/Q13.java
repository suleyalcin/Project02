package _07_ForLoop;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Q13 {
	
	
	public static void main(String[] args) {
		
		/* TASK :
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir metin giriniz");
		String cumle=scan.nextLine().toLowerCase(Locale.ROOT);
		System.out.println("Lutfen bir harf giriniz");
		String harf=scan.next().substring(0);
		int sayac=0;
		String arr[]=cumle.split("");
		Arrays.sort(arr);

		for(String each :arr
		){
			if(each.equalsIgnoreCase(harf)){
				sayac++;
			}
		}
		System.out.println("Cumlede "+ harf+ " "+sayac+" kere geciyor");

		
		
	}

}
