package _08_While_DoWhile;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
         /* TASK :
        Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz :");
        int sayi;
        sayi = scan.nextInt();
        int tekSayi = 1;
        do {
            if (tekSayi % 2 != 0){
                System.out.print(tekSayi + " ");
            }
            tekSayi++;
        }while (tekSayi<= sayi);

    }
}
