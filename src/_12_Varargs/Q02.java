package _12_Varargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q02 {
    public static void main(String[] args) {
        // verilen int lerden ilki haric tum sayilari toplayan ve
        // buldugunuz toplam ile ilk sayiyi carpip sonucu yazdiriniz.



        int sayi1=5;
        int sayi2=7;
        int sayi3=2;
        int sayi4=8;
        int sayi5=3;

        islem(sayi1,sayi2,sayi3,sayi4,sayi5);

    }

    private static void islem(int carpilacakSayi,int...toplanacakSayi) {
        int toplam=0;
        for (int each:toplanacakSayi
        ) {
            toplam=toplam+each;
        }
        System.out.println("Toplam : "+toplam);
        System.out.println("Toplamin ilk sayiyla carpimi : "+(toplam*carpilacakSayi));
    }
}
