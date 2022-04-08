package _08_While_DoWhile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {
        // TASK : indexi tek sayi olan karakterleri yazdiran bir code create ediniz

                  //  Array ile cozumu

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");//"java ogrenmek cok guzel" cumlesini yazarim
        String str = scan.nextLine().replaceAll(" ", "");//girilen cumlelerdeki space leri silmek icin replaceAll
        //methodu ile hiclige ceviririm
        String arr[] = str.split("");//cumleyi Arrayin icine atip split methodu ile karakterlerine ayiririm
        List<String> list = new ArrayList<>();//cumledeki tek indexli harfleri almak icin yeni bir List olustururum
        for (int i = 0; i < arr.length; i++) {//for dongusu acip 0'dan arrayin length ine kadar devam ettiririm
            if (i % 2 != 0) {//if sartimi acip i(indexi) 2 ye bolundugunde kalanin 0 olmayanini alirim(tek indexlileri)
                list.add(arr[i]);//almis oldugum tek indexli karakterleri add methodu ile yeni olusturdugum liste eklerim
            }
        }
        System.out.println("Verilen metnin tek indexli harfleri"+list);//[a, a, g, e, m, k, o, g, z, l]

                //2.cozum

        /*   Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz : ");
        String str = scan.nextLine();


        for (int i = 1; i <str.length() ; i+=2) {
            System.out.print(str.charAt(i)+" ");
        };*/
    }
}



