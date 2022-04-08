package tasks.tasks;

import java.util.Scanner;

public class T02_IkininKuvveti2 {
    //kullanıcıdan gelen detayı methodda parametre olarak kabul eden ve datanın 2 nin kuvveti olup olmadığını
    //kontrol eden PowerofTwo(num) methotu create ediniz.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz.");
        int sayi=scan.nextInt();
        PowerofTwo1(sayi);
    }
    public static void PowerofTwo1(int sayi) {
        int k = 0;
        if (sayi % 2 == 0) {
            sayi /= 2;
            if (sayi == 1) {
                System.out.println("Girilen sayi 2'nin kuvvetidir");
            } else {
                PowerofTwo1(sayi);
            }
        } else {
            System.out.println("Girilen sayi 2'nin kuvveti degildir");
        }
    }
}
