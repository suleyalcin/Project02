package _04;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        // Kullanıcını yasadığı güne göre 100 gün sonra hangi gün olduğunu yazdırınız.
        // pazartesi hafta baslangıcı

        Scanner scan = new Scanner(System.in);
        System.out.println("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " +
                "6\nPazar: 7\n Haftanın kaçıncı gününde olduğunu giriniz : ");
        int kacıncıGun = scan.nextInt();
        System.out.print("kac gun sonrasını öğrenmek istiyorsunuz : ");
        int kacGunSonrasi = scan.nextInt();
        int bulunanGun = (kacGunSonrasi  + kacıncıGun) % 7;
        switch (bulunanGun) {
            case 1:
                System.out.println(kacGunSonrasi + " gun sonr gunlerden PAZARTESİ");
                break;
            case 2:
                System.out.println(kacGunSonrasi + " gun sonr gunlerden SALI");
                break;
            case 3:
                System.out.println(kacGunSonrasi + " gun sonr gunlerden CARSAMBA");
                break;
            case 4:
                System.out.println(kacGunSonrasi + " gun sonr gunlerden PERSEMBE");
                break;
            case 5:
                System.out.println(kacGunSonrasi + " gun sonr gunlerden CUMA");
                break;
            case 6:
                System.out.println(kacGunSonrasi + " gun sonr gunlerden CUMARTESİ");
                break;
            case 0:
                System.out.println(kacGunSonrasi + " gun sonr gunlerden PAZAR");
                break;
            default:
                System.out.println("agam hafta 7 gun :-( ");
        }


    }
}

