package Projects.Projects_02;

import java.util.Scanner;

public class sameFirstAndLastSule {
    /*Bir int array verildiğinde, array uzunluğu 1 veya daha fazlaysa ve ilk öğe ile son öğe eşitse true değerini yazdırın.

    sameFirstLast([1, 2, 3]) → false
    sameFirstLast([1, 2, 3, 1]) → true
    sameFirstLast([1, 2, 1]) → true
    sameFirstLast([1]) → true

    sadece  true veya false print et


     */
    public static void main(String[] args) {

        int arr[] = {1,2,4,5};
        if (arr.length >= 1) {
            System.out.println("Array uzunlugu 1 veya 1 den fazladir");


        if (arr[0] == arr[arr.length - 1]) {//o ıncı ındexden basla son ındeksı al ındex
            // 0 dan basladıgı ıcın index son karakterı almak ıcın -1 dedik
            System.out.println("ilk ve son karakterler esittir. True");

        } else System.out.println("ilk ve son karakterler esit degildir. False");

    }else{
            System.out.println("Arrayin Uzunlugu 1 den kucuktur");
        }

    }//main

}//class
