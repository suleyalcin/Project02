package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/* TASK :
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucu yazdiriniz
		 */
		Scanner scan= new Scanner(System.in);//Kullanıcıdan veri almak için scanner obje kayıt ettık
		System.out.println("Lütfen \n toplama için 1 \n cıkarma icin 2 \n bölme icin 3 \n carpma ıcın 4 \n giriniz");
		//kullanıcıya secim için işlem menüsü yazdırdık.
		int islem= scan.nextInt();//kullanıcının işlem tercihi için variable  create edildi

		System.out.println("Lütfen iki tamsayı giriniz : ");//Kullanıcıya bildirimde bulundum
		double num1= scan.nextDouble();//1.sayı assıgn edildi
		double num2= scan.nextDouble();//2.sayı assıgn edildi
		if (islem==1) {
			System.out.println("toplama işleminin sonucu :" + num1 + "+" + num2 + " = " + (num1 + num2));

		}else if (islem==2) {
				System.out.println("çıkarma işleminin sonucu :" + num1 + "-" + num2 + " = " + (num1 - num2));

		}else if (islem==3){
					System.out.println("bölme işleminin sonucu :"+num1+ "/" +num2+" = "+(num1/num2));

		}else if (islem==4){
			System.out.println("çarpma işleminin sonucu :"+num1+ "*" +num2+" = "+(num1*num2));

			}else System.out.println("hatalı seçim yaptınız tekrar deneyınız");
		}



	}


