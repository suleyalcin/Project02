package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		/* TASK :
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada 
		   hatali giris seklinde code create ediniz
		 */

		Scanner scan=new Scanner(System.in);
		System.out.print("Lütfen bir harf giriniz : ");
		// String harf = scan.next().substring(0,1);
		char harf1=scan.next().charAt(0);
		if (harf1 <= 'Z' && harf1 >= 'A') {
			System.out.println("Girdiğiniz harf büyük harf");
		} else if (harf1 <= 'z' && harf1 >= 'a') {
			System.out.println("Girdiğiniz harf küçük harf");
		} else  {
			System.out.println("Hatalı giriş");
		}

	}

}
