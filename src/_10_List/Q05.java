package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
       /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         yazdırınız.

        */

        int arr1[] = new int[6];
        tekelemanYazdir(arr1);


    }//main

    private static void tekelemanYazdir(int[] arr1) {
        Scanner scan = new Scanner(System.in);


        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Lutfen sayi giriniz");
            int sayi = scan.nextInt();
            arr1[i] = sayi;

        }
        System.out.println(Arrays.toString(arr1));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 > 0) {
                list.add(arr1[i]);
            }

        }
        System.out.println(list);
    }
}
