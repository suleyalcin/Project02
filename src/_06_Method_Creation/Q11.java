package _06_Method_Creation;

import java.util.Scanner;

public class Q11 {
    static int bakiye = 1000;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {



         /*
  Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma
  ve cekme, çıkış işlemlerinin yapıldıgı bir
   ATM app. method create ediniz
   */

        System.out.println("    ****    ");
        System.out.println("    ATM'ye hos geldiniz  :-)    ");
        System.out.println("Bakiye sorgulama : 1\nPara cekme : 2\nPara yatırma : 3\n" +
                "cıkıs : 4\nyapacagınız işlemi seciniz : ");
        int islem = scan.nextInt();
    }


}



