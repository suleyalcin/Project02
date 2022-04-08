package _07_ForLoop;

import java.util.Scanner;

public class Q14 {

    /*  TASK :
        Girilen bir sayı kadar satır ve sütünu olan ve
        sağ kenara dayalı üçgeni basan kodu yazınız.

        Ekran Çıktısı
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****

        */

     /*
                    *
                    * *
                    * * *
                    * * * *
                    * * * * *
                    şeklini yazdırınız
             */

    public static void main(String[] args) {

        int sayi = 5;
        char karakter = '*';
        for (int i = 0; i <= sayi; i++) {
            for (int j = i; j < sayi; j++) {
                //System.out.print(karakter);
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(karakter);
            }
            System.out.println();
        }
    }
}