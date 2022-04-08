package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
	/*  TASK :
	 *  Kullanicidan 3 tene pozitif  tam sayi alniz. 
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz

	    INFO :
	     üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
		 a+b>c>a-b
		 a+c>b>a-c  
	     b+c>a>b-c  
		a=b=c ise es kenar ucgen 
		 
	 */
	Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen 3 tane pozitif tam sayi giriniz");

		int a,b,c;
		System.out.print("1. kenar: ");
		a=scan.nextInt();
		System.out.print("2. kenar: ");
		b=scan.nextInt();
		System.out.print("3. kenar: ");
		c=scan.nextInt();
		if (a+b>c && c>a-b && a+c>b && b>a-c && b+c>a && a>b-c){ // üçgen mi değil mi
			if (a==b && a==c && c==b) { // eşkenar mı değil mi
				System.out.println("girdiğiniz uzunluklar bir eşkenar üçgen oluşturur");
			} else if (a==b || a==c || b==c){
				System.out.println("girdiğiniz uzunluklar bir ikizkenar üçgen oluşturur");
			} else { // eşkenar olmayan üçgen
				System.out.println("girdiğiniz uzunluklar bir üçgen oluşturur");
			}
		} else {
			System.out.println("girdiğiniz uzunluklar bir üçgen oluşturmaz");
		}
	}

}
