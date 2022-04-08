package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {


    /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
         (Ignore case sensitivity)

         Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiran code create ediniz.
       input : Learning java is easy
       output: maximumCounts occurring character is : a
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir String giriniz");// hayat java ile cok kolaylastirildill
        String arr[] = scan.nextLine().split("");  ////kullanicidan gelen metin  hiclige gore parcalanarak
        //her bir parca arrayi
        System.out.println(Arrays.toString(arr));
        String enCokTekrarEden = "";
        int maxSayac = 0; //en cok kullanilan karakterin sayisini verir
        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {// karsilastirilan karakter-->h
            for (int j = i + 1; j < arr.length; j++) { //karsilastirilan karakter kontrolu-->a,y,a,t....
                if (arr[i].equalsIgnoreCase(arr[j])) { //esit karakterlerin kontrolu yapilip true durumunda sayac
                                                    //artirilarak esit karakterler saydirildi
                    sayac++;
                }
            }
            if(sayac>maxSayac) {
                maxSayac=sayac;
                enCokTekrarEden=arr[i];
            }else if(sayac==maxSayac){
                enCokTekrarEden+=", "+arr[i];
            }
            sayac=1;
        }

        System.out.println("metinde encok tekrar eden harfler : "+enCokTekrarEden);
    }
}
