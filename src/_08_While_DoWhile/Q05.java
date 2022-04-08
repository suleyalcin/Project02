package _08_While_DoWhile;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {

        // TASK : GİRİLEN SAYININ BASAMAKLARINDAKİ RAKAMLARIN TOPLAMINI BULUNUZ.

            Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=scan.nextInt();
        int rakamlarToplami=0;

        while(sayi>0){
            rakamlarToplami+=sayi%10;
            sayi/=10;
            System.out.println("Girdiginiz sayinin rakamlar toplami "+rakamlarToplami);
        }
            }

}
