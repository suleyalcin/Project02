package _07_ForLoop;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {

    /*
     TASK :
    Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=30
     */

        Scanner scan = new Scanner(System.in);//
        System.out.println("lutfen birden buyuk bir tam sayı giriniz");
        int sayi = scan.nextInt();// sayıyı kullanıcıdan aldık
        int toplam = 0;//toplamı sordugu ıcın toplamı deger olarak atayacagımız bır verıable olusturduk
        if (sayi > 1) {
            for (int i = 1; i <= sayi; i++) {//for acıp bırden baslasın sayıya kadar gıtsın sayıyı alsın dedık
                toplam += i * i;//i nın karesını alın dedıgı icin i nin karesını alıp toplma ekledık
            }
            System.out.println("toplam = " + toplam);//sayıya kadar olan sayı dahil sayıların karesını toplamını yazdırdık}
        }else System.out.println("Lütfen 1 den büyük bir sayı girin");
    }
}
