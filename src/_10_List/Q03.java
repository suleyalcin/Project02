package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(7);
        sayilar.add(8);
        for (int i = 0; i <sayilar.size(); i++) {
            sayilar.set(i, sayilar.get(i) * sayilar.get(i));
        }
        System.out.println(sayilar);

//2.YONTEM
    List<String> list = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
        System.out.println("liste atamak için sayi giriniz \nyeterli sayiya ulastiginizda 'q' giriniz");
    int toplam = 0;
    String islem = "";
        while (!islem.equalsIgnoreCase("q")) {
        System.out.println("sayi giriniz : ");
        islem = scan.next();
        list.add(islem);
    }
        list.remove(list.size() - 1);//icinde q bulunmayan sadece sayi bulun list haline geldi
    //lisr eleemanlri icine girip kareleri toplami bulun
        for (String w : list) {
        int a = Integer.parseInt(w);
        toplam += a * a;
    }
        System.out.println("girilen sayilarin kareleri toplami :" + toplam);
}
}