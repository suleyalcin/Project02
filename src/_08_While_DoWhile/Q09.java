package _08_While_DoWhile;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {
        // TASK :  kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.
        Scanner scan=new Scanner(System.in);
        int truePin=4561;
        int pin;
        System.out.println("Lufen pin kodunu giriniz");
        pin=scan.nextInt();

        if(truePin==pin){
            System.out.println(" Sisteme basariyla girildi");
        }
        else{
            System.out.println("Pin yanlis girildi tekrar deneyiniz");

        }

    }
}

