package Practıce;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        /* TASK :
 *  Kullanicinin boyunu  M  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

   INFO :
BMI = kilo(kg) /(boy*boy)(m)
BMI <=20 oldukca zayifsiniz
20<BMI<=25 Normal sinirlardasiniz
25<BMI<=30 Sisman kategorisindesiniz
30<BMI ==> Obez grubundasiniz.

 */
        Scanner scan= new Scanner(System.in);
        System.out.println("Boyunuzu m olarak gırınız");
        double boy=scan.nextDouble();
        System.out.println("Kkilonuzu kg olarak gırınız");
        double kilo=scan.nextDouble();
        double bmı=kilo/((boy/100)*(boy/100));
        if (bmı<=20) {
            System.out.println("oldukça zayıfsınız");
        }else if(bmı>20 & bmı<=25 ) {
            System.out.println("normal sınırlardasınız");
        }else if(bmı>25 & bmı<=30) {
            System.out.println("Sisman kategorisindesiniz");
        }else if(bmı>30){
            System.out.println("Obez grubundasiniz.");

        }

    }
}
