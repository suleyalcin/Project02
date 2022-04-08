package _07_ForLoop;

import java.util.Scanner;

public class Q06 {

    /*  TASK :
       2 boyutlu bir tablo olarak, ekrana çarpım tablosunu hesaplayıp yazan kodu yazınız.

       Örnek Ekran çıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25

       Ekran çıktısı 5 x 5 boyutları için örnek olarak verilmiştir,
       isterseniz boyutları klavyeden okuyup istenen boyutlara göre
       ekrana basan bir kod yazabilirsiniz.
    */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Carpim tablosunun boyutunu giriniz: ");
        int sayi=scan.nextInt();
        for (int carpan1 = 1; carpan1 <=sayi ; carpan1++) {//sutun
            for (int carpan2 = 1; carpan2 <=sayi ; carpan2++) {//satir
                System.out.print(" "+(carpan1*carpan2)); //print=> ayni satira yazsin
            }
            System.out.println(); //yeni satirdan baslamasi icin
        }
    }
}


