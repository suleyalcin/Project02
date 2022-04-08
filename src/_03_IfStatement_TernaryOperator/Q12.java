package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        /*
        TASK :
        Kullanıcıdan vize ve final notlarını alınız.
        Kullanıcın istediği oranlarda vize ve final yüzdeleri not ile not ortalamasını hesaplayıp
        not ortalamasını yazdırıp 50 ve büyük ise "Tebrikler dersi başarı ile geçtiniz..." küçük ise
        "Malesef dersten kaldınız..." yazdırınız
         */

    Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen vize notlarinizi giriniz : ");
        double vize=scan.nextDouble();

        System.out.println("Lutfen son sinav notunuzu giriniz : ");
        double sonSinav=scan.nextDouble();

        System.out.println("Lutfen Vize notunun etki yuzdesini giriniz");
        double vizeYuzdesi=scan.nextDouble();

        System.out.println("Lutfen sonSinav notunun ortalamaya etki yuzdesini giriniz : ");
        double sonSinavYuzdesi=scan.nextDouble();

        double ortalama=(vize*vizeYuzdesi/100)+(sonSinav*sonSinavYuzdesi/100);

        if(vize>=0 && vize<=100 && sonSinav>=0 && sonSinav<=100 &&  vizeYuzdesi>=0 && vizeYuzdesi<=100 && sonSinavYuzdesi>=0
                && sonSinavYuzdesi<=100 && (vizeYuzdesi+sonSinavYuzdesi==100)){
            if(ortalama>=50) {
                System.out.println("Tebrikler Basari ile Gectiniz");
            }else if(ortalama<50){
                System.out.println("Dersten Kaldiniz");
            }
            System.out.println(ortalama);
        }else {
            System.out.println("Lutfen dogru degerleri giriniz");
        }

    }
}
