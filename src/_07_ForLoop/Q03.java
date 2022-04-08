package _07_ForLoop;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        /* TASK :
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın

        Bugün hava oldukca güzel.-> 2
         str.CharAt(0)

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine();
        int sayac=0;
        for (int i=0; i<cumle.length(); i++) {
            if(cumle.toLowerCase().charAt(i)=='a') {
                sayac++;
            }else if(cumle.toLowerCase().charAt(i)=='c'){
                    break;
                }
            }
        System.out.println(sayac);
        }

    }

