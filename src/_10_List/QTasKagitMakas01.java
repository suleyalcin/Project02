package _10_List;

import java.util.Scanner;

public class QTasKagitMakas01 {

    public static void main(String[] args) {

        /* TASK:
         tas >makas
         makas >kagit
         kagit >tas

	Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.
	Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini tanimliyoruz.
	While dongumuzun icerisinde kullanicidan aldigimiz secimi “secim” isimli degiskene atiyoruz.
	Bilgisayarin secimini ise Math.random methodunu kullanarak aliyoruz.
	Math.random()*3 diyerek bilgisayara 0 ile 3 arasinda bir rastgele sayi urettiriyoruz.
	Ve secimimiz ile bilgisayarin secimini karsilastirip sonuclarini yaziyoruz.
	En sonda da kullaniciya oyuna devam etmek isteyip istemedigini soruyoruz, eger istiyorsa
	dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.

	 */

        Scanner scan = new Scanner(System.in);
        int yarismaciPuan = 0;
        int bilgisayarPuan = 0;
        System.out.println("Tas icin 1   /   Kagit icin 2   /   Makas icin 3  girin girin");
        int secim = 0;
        int bilgisayarSecim = 0;
        while (true) {
            secim = scan.nextInt();
            bilgisayarSecim = (int) (Math.random() * 3);
            if (secim==0){
                System.out.println("Yine bekleriz");
                break;
            }
            if (secim == 1) {
                if (bilgisayarSecim == 1) {
                    System.out.println("Bilgisyarin secimi:Tas  Sonuc:Berabere");
                    System.out.println("Puaniniz: " + yarismaciPuan + " Bilgisayarin puani: " + bilgisayarPuan +"\nOyunu bitirmek istiyorsan 0 girin");
                } else if (bilgisayarSecim == 2) {
                    bilgisayarPuan++;
                    System.out.println("Bilgisyarin secimi:Kagit  Sonuc:Bilgisayar Kazandi ");
                    System.out.println("Puaniniz: " + yarismaciPuan + " Bilgisayarin puani: " + bilgisayarPuan+"\nOyunu bitirmek istiyorsan 0 girin");
                } else {
                    yarismaciPuan++;
                    System.out.println("Bilgisayarin secimi:Makas  Sonuc:Kazandiniz");
                    System.out.println("Puaniniz: " + yarismaciPuan + " Bilgisayarin puani: " + bilgisayarPuan+"\nOyunu bitirmek istiyorsan 0 girin");
                }
            } else if (secim == 2) {
                if (bilgisayarSecim == 2) {
                    System.out.println("Bilgisyarin secimi:Kagit  Sonuc:Berabere");
                    System.out.println("Puaniniz: " + yarismaciPuan + " Bilgisayarin puani: " + bilgisayarPuan+"\nOyunu bitirmek istiyorsan 0 girin");
                } else if (bilgisayarSecim == 1) {
                    yarismaciPuan++;
                    System.out.println("Bilgisyarin secimi:Tas  Sonuc:Kazandiniz ");
                    System.out.println("Puaniniz: " + yarismaciPuan + " Bilgisayarin puani: " + bilgisayarPuan+"\nOyunu bitirmek istiyorsan 0 girin");
                } else {
                    bilgisayarPuan++;
                    System.out.println("Bilgisayarin secimi:Makas  Sonuc:Bilgisayar Kazandi");
                    System.out.println("Puaniniz: " + yarismaciPuan + " Bilgisayarin puani: " + bilgisayarPuan+"\nOyunu bitirmek istiyorsan 0 girin");
                }
            } else if (secim == 3) {
                if (bilgisayarSecim == 3) {
                    System.out.println("Bilgisyarin secimi:Makas  Sonuc:Berabere");
                    System.out.println("Puaniniz: " + yarismaciPuan + " Bilgisayarin puani: " + bilgisayarPuan+"\nOyunu bitirmek istiyorsan 0 girin");
                } else if (bilgisayarSecim == 1) {
                    bilgisayarPuan++;
                    System.out.println("Bilgisyarin secimi:Tas  Sonuc:Bilgisayar Kazandi ");
                    System.out.println("Puaniniz: " + yarismaciPuan + " Bilgisayarin puani: " + bilgisayarPuan+"\nOyunu bitirmek istiyorsan 0 girin");
                } else {
                    yarismaciPuan++;
                    System.out.println("Bilgisayarin secimi:Kagit  Sonuc:Kazandiniz");
                    System.out.println("Puaniniz: " + yarismaciPuan + " Bilgisayarin puani: " + bilgisayarPuan+"\nOyunu bitirmek istiyorsan 0 girin");
                }
            } else {
                System.out.println("hatali giris tekrar deneyin");
                continue;
            }
        }
    }
}



