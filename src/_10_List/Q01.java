package _10_List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01 {

    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */


        ArrayList<String> isimler = new ArrayList<String>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Omer"));
        ArrayList<String> aOLmayanIsimler = new ArrayList<String>();//a olmayan isimlerin atanacagi bos list create ediniz

        for (String w : isimler) {
            if (!w.toLowerCase().contains("a")) {//a bulundurmayan isimler sarti
                aOLmayanIsimler.add(w);
            }
        }
        System.out.println("a olmayan isimler : " + aOLmayanIsimler);
        isimler.clear();
        isimler.addAll(aOLmayanIsimler);
        System.out.println(isimler);

    }
}