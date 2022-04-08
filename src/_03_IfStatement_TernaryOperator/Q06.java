package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        //TASK :  Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.
Scanner scan=new Scanner(System.in);
        System.out.println("X ve Y değerlerini giriniz:");
        int x=scan.nextInt();
        int y=scan.nextInt();
        if(x>0 && y>0) {
            System.out.println("Girdiğiniz degerler 1.bölgeye ait");
        }else if(x<0 && y>0) {
            System.out.println("Girdiğiniz degerler 2.bölgeye ait");
        }else if(x<0 && y<0) {
            System.out.println("Girdiğiniz Degerler 3.bölgeye ait");
        }else if(x>0 && y<0) {
            System.out.println("Girdiğiniz değerler 4. bölye ait");
        }else {
            System.out.println("orjın");
        }

    }
}
