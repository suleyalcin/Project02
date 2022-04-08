package _08_While_DoWhile;

import java.util.Scanner;

public class Q06 {


	public static void main(String[] args) {
		/*TASK :
		 kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
		 kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.

		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen bolunen sayiiyi giriniz");
		double bolunenSayi= scanner.nextDouble();
		System.out.println("Lutfen bolen sayiyi giriniz");

		double bolenSayi= scanner.nextDouble();
		double bolum=0;
		double kalan=0;


		while (bolunenSayi >= bolenSayi){
			bolunenSayi-=bolenSayi;
			bolum++;
			if(bolunenSayi < bolum){
				kalan=bolunenSayi;
			}
		}
		System.out.println("Bolme isleminin sonucu "+bolum);
		System.out.println("Kalan "+kalan);
	}

}


