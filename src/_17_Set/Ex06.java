package _17_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ex06 {
    public static void main(String[] args) {
        // Soru 1 : Bir HashSet random olarak 10(set.size(10)) adet olacak şekilde
        Set<Integer> set = new HashSet<>();
        Random rndm=new Random();
        while (set.size()<10){
            set.add(rndm.nextInt(20));
        }
        System.out.println(set);

        // 1 den 20 e kadar olan sayılarla doldurup yazdırın


        // Soru 2 : Bu SET i bir fonksiyonda diziye çevirinizve yazdırınız.


    }
}
