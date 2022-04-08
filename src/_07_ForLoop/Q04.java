package _07_ForLoop;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
       /* TASK :
        Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        */
        Scanner scan = new Scanner(System.in);

        int toplam=0;  //double da olabilir
        for (int i = 1; i <=5 ; i++) { //5 sayi almak istedigimiz icin 1 den 5'e kadar diyoruz
            System.out.print("Lutfen bir sayi giriniz: ");  //5 kere tekrar soracagimiz icin forLoop olusturuyoruz
            int sayi=scan.nextInt();
            if (sayi>5 && sayi<10){  //6,7,8,9
                System.out.println("Girdiginiz sayi 5 ile 10 araliginda oldugu icin hesaplama islemine dahil edilmeyecek");
            }else{
                toplam+=sayi;
            }
        }
        System.out.println("Girdiginiz sayilarin toplami: "+toplam); //forLoop'un disinda
    }
}

