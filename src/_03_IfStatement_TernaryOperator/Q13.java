package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {

    /*  TASK :
        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)

        Örnek Ekran Çıktısı
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.

        Bu bir dik üçgendir
     */
    Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen 3 kenar uzunlugunu giriniz");

        System.out.println("Kenar1:");
        int a=scanner.nextInt();

        System.out.println("Kenar2 :");
        int b=scanner.nextInt();

        System.out.println("Kenar3 :");
        int c=scanner.nextInt();


        if((a*a)==(b*b)+(c*c) || (b*b)==(a*a)+(c*c) || (c*c)==(a*a)+(b*b)) {
            System.out.println("Bi bir dik ucgendir");
        }else {
            System.out.println("Bu bir dik ucgen degildir");
        }



    }
}
