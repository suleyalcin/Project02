package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		/*  TASK :
		 *  Kullanicidan IT alanini bilgisini alarak console'a
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
		bilgilileri yazdiriniz
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen IT bilginizi giriniz (qa, dev, ba, pm) : ");
		String meslek=scanner.next().toLowerCase();
		while (!meslek.equals("qa") && !meslek.equals("dev") && !meslek.equals("ba") && !meslek.equals("pm")){
			System.out.println("Hatalı giriş");
			System.out.print("Lütfen IT bilginizi giriniz (qa, dev, ba, pm) : ");
			meslek=scanner.next().toLowerCase();
		}
		switch (meslek){
			case "qa":
				System.out.println("Quality Analyst");
				break;
			case "dev":
				System.out.println("Developer");
				break;
			case "ba":
				System.out.println("Busines Analyst");
				break;
			case "pm":
				System.out.println("Project Manager");
				break;
			default:
				System.out.println("Hatalı giriş");
		}
	}

}
