package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		/*
		  TASK :
		  Kullanici tarafindan girilen bir sayinin
		  mutlak degerini yazdiran code create ediniz.
		 */

			Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen Bir Tamsayi Giriniz");
		int sayi=scan.nextInt();

		if(sayi>=0) {
			int sonuc = sayi;
			System.out.println("Girdiginiz Sayinin Mutlak Degeri: " + sonuc);
		}else if(sayi<0){
			int sonuc=(-1)*(sayi);
			System.out.println("Girdiginiz Sayinin Mutlak Degeri: "+ sonuc);
		}else{
			System.out.println("Lutfen Dogru Bir Tamsayi Giriniz");
		}

	}
	/*Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen Bir sayi giriniz");
	int sayi=-45;

		System.out.println(sayi<0?-1*sayi:sayi);/*

	 */
}
