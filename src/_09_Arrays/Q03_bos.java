package _09_Arrays;

import java.util.Arrays;

public class Q03_bos {
    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-) seklinde degistiren  bir method yaziniz.
        input : {1,2,-3,4,-5,-6}
        output :{-1,-2,3,-4,5,6}

         */

        int arr[]={1,2,-3,4,-5,-6};
        System.out.println(" Verilen Array : "+ Arrays.toString(arr));

        System.out.println("Ters Isaretlisi" +Arrays.toString(verilenArrrayinTersIsaretlisi(arr)));

    }//main

    private static int[] verilenArrrayinTersIsaretlisi(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            arr[i]*=-1;
        }
        return arr;

    }
}//class

