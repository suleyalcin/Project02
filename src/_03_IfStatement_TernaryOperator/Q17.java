package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		// TASK:
		// Kullanıcının girdiği yılın artık yıl olup olmadığını kontrol eden code create ediniz.


		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yil yaziniz");
		int yil = scan.nextInt();
		if (yil % 100 == 0) { // 100'e bolunebiliyor
			if (yil % 400 == 0) {
				System.out.println("Artik yil");
			} else {
				System.out.println("Artik yil degil");
			}
		} else { // 100'e bolunemiyor
			if (yil % 4 == 0) {
				System.out.println("Artik yil");
			} else {
				System.out.println("Artik yil degil");
			}
		}

	}

}
