package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static _10_List.QManav.scan;

public class Q04 {
    public static void main(String[] args) {
        /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */

        List<Integer> notListesi = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String notaDevam;
        do {
            System.out.println("not giriniz : ");
            int notlar = scan.nextInt();
            System.out.println("notaDevam : E/H ");
            notaDevam = scan.next();
            notListesi.add(notlar);
        } while (notaDevam.equalsIgnoreCase("E"));
//ortlama hesaplanmasi..
        int toplam = 0;
        for (int i = 0; i < notListesi.size(); i++) {
            toplam += notListesi.get(i);
        }
        double ortalama = toplam / notListesi.size();
        //ortalamayi geçen ogr sayisi
        int oGOSayisi = 0;
        for (int i = 0; i < notListesi.size(); i++) {
            if (notListesi.get(i) > ortalama) {
                oGOSayisi++;
            }
        }
        System.out.println("notların ortalaması :  " + ortalama);
        System.out.println("ortalamagecen ogrenci sayisi : " + oGOSayisi);

//2.YONTEM
        List<Integer> notlar = new ArrayList<>();
        Scanner scan2 = new Scanner(System.in);
        int not = 0;
        double toplam2 = 0;
        System.out.println("Lütfen girmek istediğiniz kadar öğrenci notu giriniz. Tüm notlar girildikten sonra -1 giriniz.");
        do {
            System.out.print("Lütfen bir not giriniz:");
            not = scan.nextInt();
            if (not < -1) System.out.println("Lütfen geçerli bir not giriniz.");
            else if (not == -1) break;
            else {
                notlar.add(not);
                toplam = toplam + not;
            }
        }
        while (not != -1);
        double ortalama2 = toplam / notlar.size();
        int sayac = 0;
        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i) > ortalama) sayac++;
        }
        System.out.println("Notlar:" + notlar);
        System.out.println("Ortalama:" + ortalama);
        System.out.println("Ortalamayı geçen öğrenci sayisi:" + sayac);
    }
}