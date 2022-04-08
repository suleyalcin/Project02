package _08_While_DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {
        /* TASK :
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         *
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10
         * indirim yapin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen aldiginiz urun adedini giriniz");
        int uAdedi=scan.nextInt();

        double listeFiyati=0;
        double toplam=0;
        int i=1;

        while (i<=uAdedi){
            System.out.println("Aldiginiz "+i+" . urunun fiyatini giriniz:");
            listeFiyati=scan.nextDouble();
            i++;
            toplam=toplam+listeFiyati;

        }

        System.out.println("Musteri Kartiniz Var mi?(E/H)  : ");
        char musteriKarti=scan.next().toUpperCase().charAt(0);
        if(musteriKarti=='E'){
            if(uAdedi>=10){
                toplam=(toplam*0.80);
                System.out.println("%20 indirim kazandiniz odemeniz gereken toplam fiyat :" +toplam);
            }else{
                toplam=(toplam*0.85);
                System.out.println("%15 indirim kazandiniz.Odemeniz gereken toplam fiyat :"+toplam);
            }
        }else if (musteriKarti=='H') {
            if (uAdedi >= 10) {
                toplam = (toplam * 0.85);
                System.out.println("%15 indirim kazandiniz.Odemeniz gereken Toplam Fiyat " + toplam);
            } else {
                toplam = (toplam * 0.90);
                System.out.println("%10 indirim kazandiniz .Odemeniz gereken Toplam Fiyat " + toplam);
            }
        }
    }
}
