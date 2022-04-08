package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q14 {
    /* Günün sorusu: if statement
      katsayıları verilen 2 bilinmeyenli denklemin kökleriniz bulunuz.

        ax^2 + bx + c;

        Çözüm adımları
        kullanıcıdan a,b,c yi okutun.
        Delta = bb - 4ac
        Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
        Delta = 0 => 1 tane kök vardır x = -b/2a
        Delta < 0 ise kök yoktur.
   */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(" ax^2 + bx + c;\n Lutfen denklemdeki katsayilari sirayla giriniz");

        System.out.println("a degerini giriniz:");
        double a=scan.nextInt();
        System.out.println("b degerini giriniz:");
        double b=scan.nextInt();
        System.out.println("c degerini giriniz:");
        double c=scan.nextInt();

       double delta=(b*b)-(4*a*c);

        if(delta>0) {
            double kok1=((-1*b)+Math.sqrt(delta))/(2*a);
            double kok2=((-1*b)-Math.sqrt(delta))/(2*b);
            System.out.println("2 tane kök vardır.kok1= "+kok1 +" "+"kok2= "+kok2);
        }else if(delta==0) {
            double kok=(-1*b)/(2*a);
            System.out.println(" 1 tane kök vardır kok ="+kok);
        }else if(delta<0){

            System.out.println("Kok Yoktur");
        }

          }
}
