package _17_Set;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

    /* TASK:
    parametresi Integer set ve integer array ve adi elementEkle
    olan array elemanlarini  set'e convert eden bir method create ediniz .
    yine set icindekileri yazdiracak ayrica bir metod daha create edip print ediniz.
     */

    public static void main(String[] args) {
        Integer arr[]={1,2,3,4,5,6,7};
        HashSet<Integer> hs = new HashSet<>();


        elementEkle(hs,arr);

        
        
        
        

    }

    private static void elementEkle(HashSet<Integer> hs, Integer[] arr) {

        HashSet<Integer> hs2 = new HashSet<>();

        for (Integer sayi : arr) {
            hs.add(sayi);
        }
        yazdir(hs);
    }
    public static void yazdir(HashSet<Integer> hs){
        for(Integer s:hs){
            System.out.print(s+" ");
        }


    }
}
